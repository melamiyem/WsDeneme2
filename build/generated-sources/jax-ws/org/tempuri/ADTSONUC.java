
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADTSONUC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADTSONUC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANTIBIOGR_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANTIBIO_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SONUC" type="{http://tempuri.org/}ADTSONUC_TIPI"/>
 *         &lt;element name="ACIKLAMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KONSANTRASYON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KONSANTRASYON_BIRIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADTSONUC", propOrder = {
    "antibiogradi",
    "antibioadi",
    "sonuc",
    "aciklama",
    "konsantrasyon",
    "konsantrasyonbirim"
})
public class ADTSONUC {

    @XmlElement(name = "ANTIBIOGR_ADI")
    protected String antibiogradi;
    @XmlElement(name = "ANTIBIO_ADI")
    protected String antibioadi;
    @XmlElement(name = "SONUC", required = true)
    protected ADTSONUCTIPI sonuc;
    @XmlElement(name = "ACIKLAMA")
    protected String aciklama;
    @XmlElement(name = "KONSANTRASYON")
    protected String konsantrasyon;
    @XmlElement(name = "KONSANTRASYON_BIRIM")
    protected String konsantrasyonbirim;

    /**
     * Gets the value of the antibiogradi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANTIBIOGRADI() {
        return antibiogradi;
    }

    /**
     * Sets the value of the antibiogradi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANTIBIOGRADI(String value) {
        this.antibiogradi = value;
    }

    /**
     * Gets the value of the antibioadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANTIBIOADI() {
        return antibioadi;
    }

    /**
     * Sets the value of the antibioadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANTIBIOADI(String value) {
        this.antibioadi = value;
    }

    /**
     * Gets the value of the sonuc property.
     * 
     * @return
     *     possible object is
     *     {@link ADTSONUCTIPI }
     *     
     */
    public ADTSONUCTIPI getSONUC() {
        return sonuc;
    }

    /**
     * Sets the value of the sonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADTSONUCTIPI }
     *     
     */
    public void setSONUC(ADTSONUCTIPI value) {
        this.sonuc = value;
    }

    /**
     * Gets the value of the aciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA() {
        return aciklama;
    }

    /**
     * Sets the value of the aciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA(String value) {
        this.aciklama = value;
    }

    /**
     * Gets the value of the konsantrasyon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKONSANTRASYON() {
        return konsantrasyon;
    }

    /**
     * Sets the value of the konsantrasyon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKONSANTRASYON(String value) {
        this.konsantrasyon = value;
    }

    /**
     * Gets the value of the konsantrasyonbirim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKONSANTRASYONBIRIM() {
        return konsantrasyonbirim;
    }

    /**
     * Sets the value of the konsantrasyonbirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKONSANTRASYONBIRIM(String value) {
        this.konsantrasyonbirim = value;
    }

}
