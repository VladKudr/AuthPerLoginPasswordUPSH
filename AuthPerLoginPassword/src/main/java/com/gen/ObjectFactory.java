
package com.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ChangePassword_QNAME = new QName("http://upg.sbns.bssys.com/", "changePassword");
    private final static QName _ChangePasswordResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "changePasswordResponse");
    private final static QName _GetIdCookie_QNAME = new QName("http://upg.sbns.bssys.com/", "getIdCookie");
    private final static QName _GetIdCookieResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "getIdCookieResponse");
    private final static QName _GetRequestStatus_QNAME = new QName("http://upg.sbns.bssys.com/", "getRequestStatus");
    private final static QName _GetRequestStatusPackage_QNAME = new QName("http://upg.sbns.bssys.com/", "getRequestStatusPackage");
    private final static QName _GetRequestStatusPackageResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "getRequestStatusPackageResponse");
    private final static QName _GetRequestStatusResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "getRequestStatusResponse");
    private final static QName _GetRequestStatusSRP_QNAME = new QName("http://upg.sbns.bssys.com/", "getRequestStatusSRP");
    private final static QName _GetRequestStatusSRPResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "getRequestStatusSRPResponse");
    private final static QName _GetResponsePart_QNAME = new QName("http://upg.sbns.bssys.com/", "getResponsePart");
    private final static QName _GetResponsePartResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "getResponsePartResponse");
    private final static QName _GetResponsePartSRP_QNAME = new QName("http://upg.sbns.bssys.com/", "getResponsePartSRP");
    private final static QName _GetResponsePartSRPResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "getResponsePartSRPResponse");
    private final static QName _Login_QNAME = new QName("http://upg.sbns.bssys.com/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "loginResponse");
    private final static QName _LoginSign_QNAME = new QName("http://upg.sbns.bssys.com/", "loginSign");
    private final static QName _LoginSignResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "loginSignResponse");
    private final static QName _Logout_QNAME = new QName("http://upg.sbns.bssys.com/", "logout");
    private final static QName _LogoutResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "logoutResponse");
    private final static QName _PreChangePassword_QNAME = new QName("http://upg.sbns.bssys.com/", "preChangePassword");
    private final static QName _PreChangePasswordResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "preChangePasswordResponse");
    private final static QName _PreLogin_QNAME = new QName("http://upg.sbns.bssys.com/", "preLogin");
    private final static QName _PreLoginResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "preLoginResponse");
    private final static QName _PreLoginSign_QNAME = new QName("http://upg.sbns.bssys.com/", "preLoginSign");
    private final static QName _PreLoginSignResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "preLoginSignResponse");
    private final static QName _SendDocumentReceipts_QNAME = new QName("http://upg.sbns.bssys.com/", "sendDocumentReceipts");
    private final static QName _SendDocumentReceiptsResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "sendDocumentReceiptsResponse");
    private final static QName _SendPcHash_QNAME = new QName("http://upg.sbns.bssys.com/", "sendPcHash");
    private final static QName _SendPcHashResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "sendPcHashResponse");
    private final static QName _SendRequestPackage_QNAME = new QName("http://upg.sbns.bssys.com/", "sendRequestPackage");
    private final static QName _SendRequestPackageResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "sendRequestPackageResponse");
    private final static QName _SendRequestZip_QNAME = new QName("http://upg.sbns.bssys.com/", "sendRequestZip");
    private final static QName _SendRequestZipResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "sendRequestZipResponse");
    private final static QName _SendRequests_QNAME = new QName("http://upg.sbns.bssys.com/", "sendRequests");
    private final static QName _SendRequestsResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "sendRequestsResponse");
    private final static QName _SendRequestsSRP_QNAME = new QName("http://upg.sbns.bssys.com/", "sendRequestsSRP");
    private final static QName _SendRequestsSRPResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "sendRequestsSRPResponse");
    private final static QName _VerifySMSSession_QNAME = new QName("http://upg.sbns.bssys.com/", "verifySMSSession");
    private final static QName _VerifySMSSessionResponse_QNAME = new QName("http://upg.sbns.bssys.com/", "verifySMSSessionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRequestStatusPackageResponse }
     * 
     */
    public GetRequestStatusPackageResponse createGetRequestStatusPackageResponse() {
        return new GetRequestStatusPackageResponse();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link GetIdCookie }
     * 
     */
    public GetIdCookie createGetIdCookie() {
        return new GetIdCookie();
    }

    /**
     * Create an instance of {@link GetIdCookieResponse }
     * 
     */
    public GetIdCookieResponse createGetIdCookieResponse() {
        return new GetIdCookieResponse();
    }

    /**
     * Create an instance of {@link GetRequestStatus }
     * 
     */
    public GetRequestStatus createGetRequestStatus() {
        return new GetRequestStatus();
    }

    /**
     * Create an instance of {@link GetRequestStatusPackage }
     * 
     */
    public GetRequestStatusPackage createGetRequestStatusPackage() {
        return new GetRequestStatusPackage();
    }

    /**
     * Create an instance of {@link GetRequestStatusResponse }
     * 
     */
    public GetRequestStatusResponse createGetRequestStatusResponse() {
        return new GetRequestStatusResponse();
    }

    /**
     * Create an instance of {@link GetRequestStatusSRP }
     * 
     */
    public GetRequestStatusSRP createGetRequestStatusSRP() {
        return new GetRequestStatusSRP();
    }

    /**
     * Create an instance of {@link GetRequestStatusSRPResponse }
     * 
     */
    public GetRequestStatusSRPResponse createGetRequestStatusSRPResponse() {
        return new GetRequestStatusSRPResponse();
    }

    /**
     * Create an instance of {@link GetResponsePart }
     * 
     */
    public GetResponsePart createGetResponsePart() {
        return new GetResponsePart();
    }

    /**
     * Create an instance of {@link GetResponsePartResponse }
     * 
     */
    public GetResponsePartResponse createGetResponsePartResponse() {
        return new GetResponsePartResponse();
    }

    /**
     * Create an instance of {@link GetResponsePartSRP }
     * 
     */
    public GetResponsePartSRP createGetResponsePartSRP() {
        return new GetResponsePartSRP();
    }

    /**
     * Create an instance of {@link GetResponsePartSRPResponse }
     * 
     */
    public GetResponsePartSRPResponse createGetResponsePartSRPResponse() {
        return new GetResponsePartSRPResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginSign }
     * 
     */
    public LoginSign createLoginSign() {
        return new LoginSign();
    }

    /**
     * Create an instance of {@link LoginSignResponse }
     * 
     */
    public LoginSignResponse createLoginSignResponse() {
        return new LoginSignResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link PreChangePassword }
     * 
     */
    public PreChangePassword createPreChangePassword() {
        return new PreChangePassword();
    }

    /**
     * Create an instance of {@link PreChangePasswordResponse }
     * 
     */
    public PreChangePasswordResponse createPreChangePasswordResponse() {
        return new PreChangePasswordResponse();
    }

    /**
     * Create an instance of {@link PreLogin }
     * 
     */
    public PreLogin createPreLogin() {
        return new PreLogin();
    }

    /**
     * Create an instance of {@link PreLoginResponse }
     * 
     */
    public PreLoginResponse createPreLoginResponse() {
        return new PreLoginResponse();
    }

    /**
     * Create an instance of {@link PreLoginSign }
     * 
     */
    public PreLoginSign createPreLoginSign() {
        return new PreLoginSign();
    }

    /**
     * Create an instance of {@link PreLoginSignResponse }
     * 
     */
    public PreLoginSignResponse createPreLoginSignResponse() {
        return new PreLoginSignResponse();
    }

    /**
     * Create an instance of {@link SendDocumentReceipts }
     * 
     */
    public SendDocumentReceipts createSendDocumentReceipts() {
        return new SendDocumentReceipts();
    }

    /**
     * Create an instance of {@link SendDocumentReceiptsResponse }
     * 
     */
    public SendDocumentReceiptsResponse createSendDocumentReceiptsResponse() {
        return new SendDocumentReceiptsResponse();
    }

    /**
     * Create an instance of {@link SendPcHash }
     * 
     */
    public SendPcHash createSendPcHash() {
        return new SendPcHash();
    }

    /**
     * Create an instance of {@link SendPcHashResponse }
     * 
     */
    public SendPcHashResponse createSendPcHashResponse() {
        return new SendPcHashResponse();
    }

    /**
     * Create an instance of {@link SendRequestPackage }
     * 
     */
    public SendRequestPackage createSendRequestPackage() {
        return new SendRequestPackage();
    }

    /**
     * Create an instance of {@link SendRequestPackageResponse }
     * 
     */
    public SendRequestPackageResponse createSendRequestPackageResponse() {
        return new SendRequestPackageResponse();
    }

    /**
     * Create an instance of {@link SendRequestZip }
     * 
     */
    public SendRequestZip createSendRequestZip() {
        return new SendRequestZip();
    }

    /**
     * Create an instance of {@link SendRequestZipResponse }
     * 
     */
    public SendRequestZipResponse createSendRequestZipResponse() {
        return new SendRequestZipResponse();
    }

    /**
     * Create an instance of {@link SendRequests }
     * 
     */
    public SendRequests createSendRequests() {
        return new SendRequests();
    }

    /**
     * Create an instance of {@link SendRequestsResponse }
     * 
     */
    public SendRequestsResponse createSendRequestsResponse() {
        return new SendRequestsResponse();
    }

    /**
     * Create an instance of {@link SendRequestsSRP }
     * 
     */
    public SendRequestsSRP createSendRequestsSRP() {
        return new SendRequestsSRP();
    }

    /**
     * Create an instance of {@link SendRequestsSRPResponse }
     * 
     */
    public SendRequestsSRPResponse createSendRequestsSRPResponse() {
        return new SendRequestsSRPResponse();
    }

    /**
     * Create an instance of {@link VerifySMSSession }
     * 
     */
    public VerifySMSSession createVerifySMSSession() {
        return new VerifySMSSession();
    }

    /**
     * Create an instance of {@link VerifySMSSessionResponse }
     * 
     */
    public VerifySMSSessionResponse createVerifySMSSessionResponse() {
        return new VerifySMSSessionResponse();
    }

    /**
     * Create an instance of {@link PackageResponse }
     * 
     */
    public PackageResponse createPackageResponse() {
        return new PackageResponse();
    }

    /**
     * Create an instance of {@link RequestTypeForPackageStatusResponse }
     * 
     */
    public RequestTypeForPackageStatusResponse createRequestTypeForPackageStatusResponse() {
        return new RequestTypeForPackageStatusResponse();
    }

    /**
     * Create an instance of {@link GetRequestStatusPackageResponse.Packages }
     * 
     */
    public GetRequestStatusPackageResponse.Packages createGetRequestStatusPackageResponsePackages() {
        return new GetRequestStatusPackageResponse.Packages();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "changePassword")
    public JAXBElement<ChangePassword> createChangePassword(ChangePassword value) {
        return new JAXBElement<ChangePassword>(_ChangePassword_QNAME, ChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "changePasswordResponse")
    public JAXBElement<ChangePasswordResponse> createChangePasswordResponse(ChangePasswordResponse value) {
        return new JAXBElement<ChangePasswordResponse>(_ChangePasswordResponse_QNAME, ChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdCookie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getIdCookie")
    public JAXBElement<GetIdCookie> createGetIdCookie(GetIdCookie value) {
        return new JAXBElement<GetIdCookie>(_GetIdCookie_QNAME, GetIdCookie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdCookieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getIdCookieResponse")
    public JAXBElement<GetIdCookieResponse> createGetIdCookieResponse(GetIdCookieResponse value) {
        return new JAXBElement<GetIdCookieResponse>(_GetIdCookieResponse_QNAME, GetIdCookieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getRequestStatus")
    public JAXBElement<GetRequestStatus> createGetRequestStatus(GetRequestStatus value) {
        return new JAXBElement<GetRequestStatus>(_GetRequestStatus_QNAME, GetRequestStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestStatusPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getRequestStatusPackage")
    public JAXBElement<GetRequestStatusPackage> createGetRequestStatusPackage(GetRequestStatusPackage value) {
        return new JAXBElement<GetRequestStatusPackage>(_GetRequestStatusPackage_QNAME, GetRequestStatusPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestStatusPackageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getRequestStatusPackageResponse")
    public JAXBElement<GetRequestStatusPackageResponse> createGetRequestStatusPackageResponse(GetRequestStatusPackageResponse value) {
        return new JAXBElement<GetRequestStatusPackageResponse>(_GetRequestStatusPackageResponse_QNAME, GetRequestStatusPackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getRequestStatusResponse")
    public JAXBElement<GetRequestStatusResponse> createGetRequestStatusResponse(GetRequestStatusResponse value) {
        return new JAXBElement<GetRequestStatusResponse>(_GetRequestStatusResponse_QNAME, GetRequestStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestStatusSRP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getRequestStatusSRP")
    public JAXBElement<GetRequestStatusSRP> createGetRequestStatusSRP(GetRequestStatusSRP value) {
        return new JAXBElement<GetRequestStatusSRP>(_GetRequestStatusSRP_QNAME, GetRequestStatusSRP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestStatusSRPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getRequestStatusSRPResponse")
    public JAXBElement<GetRequestStatusSRPResponse> createGetRequestStatusSRPResponse(GetRequestStatusSRPResponse value) {
        return new JAXBElement<GetRequestStatusSRPResponse>(_GetRequestStatusSRPResponse_QNAME, GetRequestStatusSRPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponsePart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getResponsePart")
    public JAXBElement<GetResponsePart> createGetResponsePart(GetResponsePart value) {
        return new JAXBElement<GetResponsePart>(_GetResponsePart_QNAME, GetResponsePart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponsePartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getResponsePartResponse")
    public JAXBElement<GetResponsePartResponse> createGetResponsePartResponse(GetResponsePartResponse value) {
        return new JAXBElement<GetResponsePartResponse>(_GetResponsePartResponse_QNAME, GetResponsePartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponsePartSRP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getResponsePartSRP")
    public JAXBElement<GetResponsePartSRP> createGetResponsePartSRP(GetResponsePartSRP value) {
        return new JAXBElement<GetResponsePartSRP>(_GetResponsePartSRP_QNAME, GetResponsePartSRP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponsePartSRPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "getResponsePartSRPResponse")
    public JAXBElement<GetResponsePartSRPResponse> createGetResponsePartSRPResponse(GetResponsePartSRPResponse value) {
        return new JAXBElement<GetResponsePartSRPResponse>(_GetResponsePartSRPResponse_QNAME, GetResponsePartSRPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginSign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "loginSign")
    public JAXBElement<LoginSign> createLoginSign(LoginSign value) {
        return new JAXBElement<LoginSign>(_LoginSign_QNAME, LoginSign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginSignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "loginSignResponse")
    public JAXBElement<LoginSignResponse> createLoginSignResponse(LoginSignResponse value) {
        return new JAXBElement<LoginSignResponse>(_LoginSignResponse_QNAME, LoginSignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "preChangePassword")
    public JAXBElement<PreChangePassword> createPreChangePassword(PreChangePassword value) {
        return new JAXBElement<PreChangePassword>(_PreChangePassword_QNAME, PreChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "preChangePasswordResponse")
    public JAXBElement<PreChangePasswordResponse> createPreChangePasswordResponse(PreChangePasswordResponse value) {
        return new JAXBElement<PreChangePasswordResponse>(_PreChangePasswordResponse_QNAME, PreChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "preLogin")
    public JAXBElement<PreLogin> createPreLogin(PreLogin value) {
        return new JAXBElement<PreLogin>(_PreLogin_QNAME, PreLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "preLoginResponse")
    public JAXBElement<PreLoginResponse> createPreLoginResponse(PreLoginResponse value) {
        return new JAXBElement<PreLoginResponse>(_PreLoginResponse_QNAME, PreLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreLoginSign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "preLoginSign")
    public JAXBElement<PreLoginSign> createPreLoginSign(PreLoginSign value) {
        return new JAXBElement<PreLoginSign>(_PreLoginSign_QNAME, PreLoginSign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreLoginSignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "preLoginSignResponse")
    public JAXBElement<PreLoginSignResponse> createPreLoginSignResponse(PreLoginSignResponse value) {
        return new JAXBElement<PreLoginSignResponse>(_PreLoginSignResponse_QNAME, PreLoginSignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDocumentReceipts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendDocumentReceipts")
    public JAXBElement<SendDocumentReceipts> createSendDocumentReceipts(SendDocumentReceipts value) {
        return new JAXBElement<SendDocumentReceipts>(_SendDocumentReceipts_QNAME, SendDocumentReceipts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDocumentReceiptsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendDocumentReceiptsResponse")
    public JAXBElement<SendDocumentReceiptsResponse> createSendDocumentReceiptsResponse(SendDocumentReceiptsResponse value) {
        return new JAXBElement<SendDocumentReceiptsResponse>(_SendDocumentReceiptsResponse_QNAME, SendDocumentReceiptsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPcHash }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendPcHash")
    public JAXBElement<SendPcHash> createSendPcHash(SendPcHash value) {
        return new JAXBElement<SendPcHash>(_SendPcHash_QNAME, SendPcHash.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPcHashResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendPcHashResponse")
    public JAXBElement<SendPcHashResponse> createSendPcHashResponse(SendPcHashResponse value) {
        return new JAXBElement<SendPcHashResponse>(_SendPcHashResponse_QNAME, SendPcHashResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendRequestPackage")
    public JAXBElement<SendRequestPackage> createSendRequestPackage(SendRequestPackage value) {
        return new JAXBElement<SendRequestPackage>(_SendRequestPackage_QNAME, SendRequestPackage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestPackageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendRequestPackageResponse")
    public JAXBElement<SendRequestPackageResponse> createSendRequestPackageResponse(SendRequestPackageResponse value) {
        return new JAXBElement<SendRequestPackageResponse>(_SendRequestPackageResponse_QNAME, SendRequestPackageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestZip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendRequestZip")
    public JAXBElement<SendRequestZip> createSendRequestZip(SendRequestZip value) {
        return new JAXBElement<SendRequestZip>(_SendRequestZip_QNAME, SendRequestZip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestZipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendRequestZipResponse")
    public JAXBElement<SendRequestZipResponse> createSendRequestZipResponse(SendRequestZipResponse value) {
        return new JAXBElement<SendRequestZipResponse>(_SendRequestZipResponse_QNAME, SendRequestZipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequests }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendRequests")
    public JAXBElement<SendRequests> createSendRequests(SendRequests value) {
        return new JAXBElement<SendRequests>(_SendRequests_QNAME, SendRequests.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendRequestsResponse")
    public JAXBElement<SendRequestsResponse> createSendRequestsResponse(SendRequestsResponse value) {
        return new JAXBElement<SendRequestsResponse>(_SendRequestsResponse_QNAME, SendRequestsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestsSRP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendRequestsSRP")
    public JAXBElement<SendRequestsSRP> createSendRequestsSRP(SendRequestsSRP value) {
        return new JAXBElement<SendRequestsSRP>(_SendRequestsSRP_QNAME, SendRequestsSRP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestsSRPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "sendRequestsSRPResponse")
    public JAXBElement<SendRequestsSRPResponse> createSendRequestsSRPResponse(SendRequestsSRPResponse value) {
        return new JAXBElement<SendRequestsSRPResponse>(_SendRequestsSRPResponse_QNAME, SendRequestsSRPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifySMSSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "verifySMSSession")
    public JAXBElement<VerifySMSSession> createVerifySMSSession(VerifySMSSession value) {
        return new JAXBElement<VerifySMSSession>(_VerifySMSSession_QNAME, VerifySMSSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifySMSSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://upg.sbns.bssys.com/", name = "verifySMSSessionResponse")
    public JAXBElement<VerifySMSSessionResponse> createVerifySMSSessionResponse(VerifySMSSessionResponse value) {
        return new JAXBElement<VerifySMSSessionResponse>(_VerifySMSSessionResponse_QNAME, VerifySMSSessionResponse.class, null, value);
    }

}
