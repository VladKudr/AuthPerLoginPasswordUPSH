
package com.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loginSign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loginSign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sessionId" type="{http://upg.sbns.bssys.com/}UuidSeparated"/&gt;
 *         &lt;element name="clientAuthData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="fraudParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginSign", propOrder = {
    "sessionId",
    "clientAuthData",
    "fraudParams"
})
public class LoginSign {

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected byte[] clientAuthData;
    protected String fraudParams;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the clientAuthData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getClientAuthData() {
        return clientAuthData;
    }

    /**
     * Sets the value of the clientAuthData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setClientAuthData(byte[] value) {
        this.clientAuthData = value;
    }

    /**
     * Gets the value of the fraudParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudParams() {
        return fraudParams;
    }

    /**
     * Sets the value of the fraudParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudParams(String value) {
        this.fraudParams = value;
    }

}
