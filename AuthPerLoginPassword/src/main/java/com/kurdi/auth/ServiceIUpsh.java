package com.kurdi.auth;


import com.kurdi.auth.srp.SRPService;
import com.kurdi.utils.GeneralUtils;
import com.upg.UniversalPaymentGate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ServiceIUpsh {
    private static final Logger logger = LoggerFactory.getLogger(ServiceIUpsh.class);


    public String connectPerLP(String userLogin, String password, UniversalPaymentGate paymentGate) throws UpshException {
        String sessionIDResult = null;

        List<byte[]> preLoginResponse = paymentGate.getUniversalPaymentGateSbrfImplPort().preLogin(userLogin, false);
        parsePreLoginResponse(preLoginResponse, "Exception by invoking prelogin function for establishing connect. Returned data: \n" + GeneralUtils.getByteArrayToPrintFormat(preLoginResponse), logger);


        String sessionID = new String(preLoginResponse.get(2));


        List<byte[]> KandA = SRPService.getKandAWNew(userLogin, password, preLoginResponse.get(0), preLoginResponse.get(1));

        List<byte[]> loginResponse = paymentGate.getUniversalPaymentGateSbrfImplPort().login(sessionID, KandA);
        parseLoginResponse(loginResponse, "Exception by invoking login function for establishing connect. Returned data: \n" + GeneralUtils.getByteArrayToPrintFormat(loginResponse), logger);
        sessionIDResult = sessionID;

        return sessionIDResult;


    }

    private void parsePreLoginResponse(List<byte[]> preLoginResponse, String msgForLogger, Logger logger) throws UpshException {

        if (preLoginResponse.size() < 4) {


            logger.error(msgForLogger);

            throw new UpshException("Exception by invoking prelogin function");
        }
        if (preLoginResponse.get(3)[0] != 0x0) {

            logger.error(msgForLogger);

            throw new UpshException("Exception by invoking prelogin function");
        }


    }

    private void parseLoginResponse(List<byte[]> loginResponse, String msgForLogger, Logger logger) throws UpshException {
        if (loginResponse.size() < 3) {


            logger.error(msgForLogger);

            throw new UpshException("Exception by invoking Login function");
        }
        if (loginResponse.get(1)[0] != 0x0) {

            logger.error(msgForLogger);

            throw new UpshException("Exception by invoking Login function");
        }
    }

}

