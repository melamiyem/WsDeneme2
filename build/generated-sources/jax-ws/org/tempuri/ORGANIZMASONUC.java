
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ORGANIZMASONUC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ORGANIZMASONUC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORGANIZMA_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UREME_DUZEYI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADTSONUCLIST" type="{http://tempuri.org/}ArrayOfADTSONUC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ORGANIZMASONUC", propOrder = {
    "organizmaadi",
    "uremeduzeyi",
    "adtsonuclist"
})
public class ORGANIZMASONUC {

    @XmlElement(name = "ORGANIZMA_ADI")
    protected String organizmaadi;
    @XmlElement(name = "UREME_DUZEYI")
    protected String uremeduzeyi;
    @XmlElement(name = "ADTSONUCLIST")
    protected ArrayOfADTSONUC adtsonuclist;

    /**
     * Gets the value of the organizmaadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGANIZMAADI() {
        return organizmaadi;
    }

    /**
     * Sets the value of the organizmaadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGANIZMAADI(String value) {
        this.organizmaadi = value;
    }

    /**
     * Gets the value of the uremeduzeyi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUREMEDUZEYI() {
        return uremeduzeyi;
    }

    /**
     * Sets the value of the uremeduzeyi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUREMEDUZEYI(String value) {
        this.uremeduzeyi = value;
    }

    /**
     * Gets the value of the adtsonuclist property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfADTSONUC }
     *     
     */
    public ArrayOfADTSONUC getADTSONUCLIST() {
        return adtsonuclist;
    }

    /**
     * Sets the value of the adtsonuclist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfADTSONUC }
     *     
     */
    public void setADTSONUCLIST(ArrayOfADTSONUC value) {
        this.adtsonuclist = value;
    }

}
