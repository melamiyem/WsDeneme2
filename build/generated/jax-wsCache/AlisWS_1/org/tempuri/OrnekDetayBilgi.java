
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrnekDetayBilgi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrnekDetayBilgi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORNEKNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UNITE_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KABUL_TARIHI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RAPOR_TARIHI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ONAY_TARIHI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ONAYLAYAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrnekDetayBilgi", propOrder = {
    "ornekno",
    "uniteadi",
    "kabultarihi",
    "raportarihi",
    "onaytarihi",
    "onaylayan"
})
public class OrnekDetayBilgi {

    @XmlElement(name = "ORNEKNO")
    protected int ornekno;
    @XmlElement(name = "UNITE_ADI")
    protected String uniteadi;
    @XmlElement(name = "KABUL_TARIHI")
    protected String kabultarihi;
    @XmlElement(name = "RAPOR_TARIHI")
    protected String raportarihi;
    @XmlElement(name = "ONAY_TARIHI")
    protected String onaytarihi;
    @XmlElement(name = "ONAYLAYAN")
    protected String onaylayan;

    /**
     * Gets the value of the ornekno property.
     * 
     */
    public int getORNEKNO() {
        return ornekno;
    }

    /**
     * Sets the value of the ornekno property.
     * 
     */
    public void setORNEKNO(int value) {
        this.ornekno = value;
    }

    /**
     * Gets the value of the uniteadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITEADI() {
        return uniteadi;
    }

    /**
     * Sets the value of the uniteadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITEADI(String value) {
        this.uniteadi = value;
    }

    /**
     * Gets the value of the kabultarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKABULTARIHI() {
        return kabultarihi;
    }

    /**
     * Sets the value of the kabultarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKABULTARIHI(String value) {
        this.kabultarihi = value;
    }

    /**
     * Gets the value of the raportarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAPORTARIHI() {
        return raportarihi;
    }

    /**
     * Sets the value of the raportarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAPORTARIHI(String value) {
        this.raportarihi = value;
    }

    /**
     * Gets the value of the onaytarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONAYTARIHI() {
        return onaytarihi;
    }

    /**
     * Sets the value of the onaytarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONAYTARIHI(String value) {
        this.onaytarihi = value;
    }

    /**
     * Gets the value of the onaylayan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONAYLAYAN() {
        return onaylayan;
    }

    /**
     * Sets the value of the onaylayan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONAYLAYAN(String value) {
        this.onaylayan = value;
    }

}
