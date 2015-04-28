
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
 *         &lt;element name="ORNEKNO1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ORNEKNO2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ISTEKNEDENI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AKRABAEVLI" type="{http://tempuri.org/}EVET_HAYIR"/>
 *         &lt;element name="TALESHIKAYE" type="{http://tempuri.org/}EVET_HAYIR"/>
 *         &lt;element name="AKRABAKANSIZ" type="{http://tempuri.org/}EVET_HAYIR"/>
 *         &lt;element name="DUZENTARIH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUZENLEYEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ornekno1",
    "ornekno2",
    "isteknedeni",
    "akrabaevli",
    "taleshikaye",
    "akrabakansiz",
    "duzentarih",
    "duzenleyen"
})
@XmlRootElement(name = "ALISTalesemiKayitEkle")
public class ALISTalesemiKayitEkle {

    @XmlElement(name = "VENUSER")
    protected String venuser;
    @XmlElement(name = "VENPASS")
    protected String venpass;
    @XmlElement(name = "ORNEKNO1")
    protected int ornekno1;
    @XmlElement(name = "ORNEKNO2")
    protected int ornekno2;
    @XmlElement(name = "ISTEKNEDENI")
    protected String isteknedeni;
    @XmlElement(name = "AKRABAEVLI", required = true)
    protected EVETHAYIR akrabaevli;
    @XmlElement(name = "TALESHIKAYE", required = true)
    protected EVETHAYIR taleshikaye;
    @XmlElement(name = "AKRABAKANSIZ", required = true)
    protected EVETHAYIR akrabakansiz;
    @XmlElement(name = "DUZENTARIH")
    protected String duzentarih;
    @XmlElement(name = "DUZENLEYEN")
    protected String duzenleyen;

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
     * Gets the value of the ornekno1 property.
     * 
     */
    public int getORNEKNO1() {
        return ornekno1;
    }

    /**
     * Sets the value of the ornekno1 property.
     * 
     */
    public void setORNEKNO1(int value) {
        this.ornekno1 = value;
    }

    /**
     * Gets the value of the ornekno2 property.
     * 
     */
    public int getORNEKNO2() {
        return ornekno2;
    }

    /**
     * Sets the value of the ornekno2 property.
     * 
     */
    public void setORNEKNO2(int value) {
        this.ornekno2 = value;
    }

    /**
     * Gets the value of the isteknedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISTEKNEDENI() {
        return isteknedeni;
    }

    /**
     * Sets the value of the isteknedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISTEKNEDENI(String value) {
        this.isteknedeni = value;
    }

    /**
     * Gets the value of the akrabaevli property.
     * 
     * @return
     *     possible object is
     *     {@link EVETHAYIR }
     *     
     */
    public EVETHAYIR getAKRABAEVLI() {
        return akrabaevli;
    }

    /**
     * Sets the value of the akrabaevli property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVETHAYIR }
     *     
     */
    public void setAKRABAEVLI(EVETHAYIR value) {
        this.akrabaevli = value;
    }

    /**
     * Gets the value of the taleshikaye property.
     * 
     * @return
     *     possible object is
     *     {@link EVETHAYIR }
     *     
     */
    public EVETHAYIR getTALESHIKAYE() {
        return taleshikaye;
    }

    /**
     * Sets the value of the taleshikaye property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVETHAYIR }
     *     
     */
    public void setTALESHIKAYE(EVETHAYIR value) {
        this.taleshikaye = value;
    }

    /**
     * Gets the value of the akrabakansiz property.
     * 
     * @return
     *     possible object is
     *     {@link EVETHAYIR }
     *     
     */
    public EVETHAYIR getAKRABAKANSIZ() {
        return akrabakansiz;
    }

    /**
     * Sets the value of the akrabakansiz property.
     * 
     * @param value
     *     allowed object is
     *     {@link EVETHAYIR }
     *     
     */
    public void setAKRABAKANSIZ(EVETHAYIR value) {
        this.akrabakansiz = value;
    }

    /**
     * Gets the value of the duzentarih property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUZENTARIH() {
        return duzentarih;
    }

    /**
     * Sets the value of the duzentarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUZENTARIH(String value) {
        this.duzentarih = value;
    }

    /**
     * Gets the value of the duzenleyen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUZENLEYEN() {
        return duzenleyen;
    }

    /**
     * Sets the value of the duzenleyen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUZENLEYEN(String value) {
        this.duzenleyen = value;
    }

}
