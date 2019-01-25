package com.kurdi.auth;

import com.upg.UniversalPaymentGate;

import java.net.URL;
import java.util.Base64;

public class ServiceIUpshTest {

    @org.junit.Test
    public void connectPerLP() throws Exception {
        {
            System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        }
        // укажите адрес предоставленный вам
        URL url = new URL("http://10.36.252.31:9080/sbns-upg/upg?wsdl");


        UniversalPaymentGate universalPaymentGate = new UniversalPaymentGate(url);

        ServiceIUpsh serviceIUpsh = new ServiceIUpsh();
        String result = serviceIUpsh.connectPerLP("login", "password", universalPaymentGate);
    }
}