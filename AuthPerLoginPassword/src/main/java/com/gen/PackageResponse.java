
package com.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://upg.sbns.bssys.com/}RequestTypeForPackageStatusResponse" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="packageGuid" type="{http://upg.sbns.bssys.com/}UuidSeparated" /&gt;
 *       &lt;attribute name="statusPackageStateCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="msgFromBank" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageResponse", propOrder = {
    "request"
})
public class PackageResponse {

    @XmlElement(name = "Request")
    protected List<RequestTypeForPackageStatusResponse> request;
    @XmlAttribute(name = "createTime")
    protected String createTime;
    @XmlAttribute(name = "packageGuid")
    protected String packageGuid;
    @XmlAttribute(name = "statusPackageStateCode")
    protected String statusPackageStateCode;
    @XmlAttribute(name = "msgFromBank")
    protected String msgFromBank;

    /**
     * Gets the value of the request property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the request property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestTypeForPackageStatusResponse }
     * 
     * 
     */
    public List<RequestTypeForPackageStatusResponse> getRequest() {
        if (request == null) {
            request = new ArrayList<RequestTypeForPackageStatusResponse>();
        }
        return this.request;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the packageGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageGuid() {
        return packageGuid;
    }

    /**
     * Sets the value of the packageGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageGuid(String value) {
        this.packageGuid = value;
    }

    /**
     * Gets the value of the statusPackageStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPackageStateCode() {
        return statusPackageStateCode;
    }

    /**
     * Sets the value of the statusPackageStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPackageStateCode(String value) {
        this.statusPackageStateCode = value;
    }

    /**
     * Gets the value of the msgFromBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgFromBank() {
        return msgFromBank;
    }

    /**
     * Sets the value of the msgFromBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgFromBank(String value) {
        this.msgFromBank = value;
    }

}
