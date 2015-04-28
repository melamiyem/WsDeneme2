
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tetkik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tetkik">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TETKIK_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISTEM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TETKIK_ACIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="islemSonuc" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tetkik", propOrder = {
    "tetkikkodu",
    "istemid",
    "tetkikacik",
    "islemSonuc"
})
public class Tetkik {

    @XmlElement(name = "TETKIK_KODU")
    protected String tetkikkodu;
    @XmlElement(name = "ISTEM_ID")
    protected String istemid;
    @XmlElement(name = "TETKIK_ACIK")
    protected String tetkikacik;
    protected IslemSonuc islemSonuc;

    /**
     * Gets the value of the tetkikkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTETKIKKODU() {
        return tetkikkodu;
    }

    /**
     * Sets the value of the tetkikkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTETKIKKODU(String value) {
        this.tetkikkodu = value;
    }

    /**
     * Gets the value of the istemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISTEMID() {
        return istemid;
    }

    /**
     * Sets the value of the istemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISTEMID(String value) {
        this.istemid = value;
    }

    /**
     * Gets the value of the tetkikacik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTETKIKACIK() {
        return tetkikacik;
    }

    /**
     * Sets the value of the tetkikacik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTETKIKACIK(String value) {
        this.tetkikacik = value;
    }

    /**
     * Gets the value of the islemSonuc property.
     * 
     * @return
     *     possible object is
     *     {@link IslemSonuc }
     *     
     */
    public IslemSonuc getIslemSonuc() {
        return islemSonuc;
    }

    /**
     * Sets the value of the islemSonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IslemSonuc }
     *     
     */
    public void setIslemSonuc(IslemSonuc value) {
        this.islemSonuc = value;
    }

}
