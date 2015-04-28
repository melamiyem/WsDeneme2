
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoktorBilgi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoktorBilgi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DOKTOR_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOKTOR_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOKTOR_SOYADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOKTOR_TC_KIMLIKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOKTOR_TESCIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOKTOR_SICIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoktorBilgi", propOrder = {
    "doktorkodu",
    "doktoradi",
    "doktorsoyadi",
    "doktortckimlikno",
    "doktortescil",
    "doktorsicil"
})
public class DoktorBilgi {

    @XmlElement(name = "DOKTOR_KODU")
    protected String doktorkodu;
    @XmlElement(name = "DOKTOR_ADI")
    protected String doktoradi;
    @XmlElement(name = "DOKTOR_SOYADI")
    protected String doktorsoyadi;
    @XmlElement(name = "DOKTOR_TC_KIMLIKNO")
    protected String doktortckimlikno;
    @XmlElement(name = "DOKTOR_TESCIL")
    protected String doktortescil;
    @XmlElement(name = "DOKTOR_SICIL")
    protected String doktorsicil;

    /**
     * Gets the value of the doktorkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOKTORKODU() {
        return doktorkodu;
    }

    /**
     * Sets the value of the doktorkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOKTORKODU(String value) {
        this.doktorkodu = value;
    }

    /**
     * Gets the value of the doktoradi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOKTORADI() {
        return doktoradi;
    }

    /**
     * Sets the value of the doktoradi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOKTORADI(String value) {
        this.doktoradi = value;
    }

    /**
     * Gets the value of the doktorsoyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOKTORSOYADI() {
        return doktorsoyadi;
    }

    /**
     * Sets the value of the doktorsoyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOKTORSOYADI(String value) {
        this.doktorsoyadi = value;
    }

    /**
     * Gets the value of the doktortckimlikno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOKTORTCKIMLIKNO() {
        return doktortckimlikno;
    }

    /**
     * Sets the value of the doktortckimlikno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOKTORTCKIMLIKNO(String value) {
        this.doktortckimlikno = value;
    }

    /**
     * Gets the value of the doktortescil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOKTORTESCIL() {
        return doktortescil;
    }

    /**
     * Sets the value of the doktortescil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOKTORTESCIL(String value) {
        this.doktortescil = value;
    }

    /**
     * Gets the value of the doktorsicil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOKTORSICIL() {
        return doktorsicil;
    }

    /**
     * Sets the value of the doktorsicil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOKTORSICIL(String value) {
        this.doktorsicil = value;
    }

}
