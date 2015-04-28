
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VENUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VENPASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BASTAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BITTAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KONTROL_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "venuser",
    "venpass",
    "bastar",
    "bittar",
    "kontrolkodu"
})
@XmlRootElement(name = "ALISKayitSorgula")
public class ALISKayitSorgula {

    @XmlElement(name = "VENUSER")
    protected String venuser;
    @XmlElement(name = "VENPASS")
    protected String venpass;
    @XmlElement(name = "BASTAR")
    protected String bastar;
    @XmlElement(name = "BITTAR")
    protected String bittar;
    @XmlElement(name = "KONTROL_KODU")
    protected String kontrolkodu;

    /**
     * Gets the value of the venuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENUSER() {
        return venuser;
    }

    /**
     * Sets the value of the venuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENUSER(String value) {
        this.venuser = value;
    }

    /**
     * Gets the value of the venpass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENPASS() {
        return venpass;
    }

    /**
     * Sets the value of the venpass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENPASS(String value) {
        this.venpass = value;
    }

    /**
     * Gets the value of the bastar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASTAR() {
        return bastar;
    }

    /**
     * Sets the value of the bastar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASTAR(String value) {
        this.bastar = value;
    }

    /**
     * Gets the value of the bittar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBITTAR() {
        return bittar;
    }

    /**
     * Sets the value of the bittar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBITTAR(String value) {
        this.bittar = value;
    }

    /**
     * Gets the value of the kontrolkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKONTROLKODU() {
        return kontrolkodu;
    }

    /**
     * Sets the value of the kontrolkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKONTROLKODU(String value) {
        this.kontrolkodu = value;
    }

}
