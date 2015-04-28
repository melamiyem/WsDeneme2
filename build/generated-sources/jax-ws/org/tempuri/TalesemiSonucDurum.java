
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TalesemiSonucDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TalesemiSonucDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="islemSonuc" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
 *         &lt;element name="ORNEKNO1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ORNEKNO2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SONUC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SONUC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIGERTETKIK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIGERTETKIK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISTEKNEDENI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AKRABAEVLI" type="{http://tempuri.org/}EVET_HAYIR"/>
 *         &lt;element name="TALESHIKAYE" type="{http://tempuri.org/}EVET_HAYIR"/>
 *         &lt;element name="AKRABAKANSIZ" type="{http://tempuri.org/}EVET_HAYIR"/>
 *         &lt;element name="DUZENLEYEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUZENTARIH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ONAYLAYANADSOYAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ONAYLAYANUNVAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ONAYTARIH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TalesemiSonucDurum", propOrder = {
    "islemSonuc",
    "ornekno1",
    "ornekno2",
    "sonuc1",
    "sonuc2",
    "aciklama1",
    "aciklama2",
    "digertetkik1",
    "digertetkik2",
    "isteknedeni",
    "akrabaevli",
    "taleshikaye",
    "akrabakansiz",
    "duzenleyen",
    "duzentarih",
    "onaylayanadsoyad",
    "onaylayanunvan",
    "onaytarih"
})
public class TalesemiSonucDurum {

    protected IslemSonuc islemSonuc;
    @XmlElement(name = "ORNEKNO1")
    protected int ornekno1;
    @XmlElement(name = "ORNEKNO2")
    protected int ornekno2;
    @XmlElement(name = "SONUC1")
    protected String sonuc1;
    @XmlElement(name = "SONUC2")
    protected String sonuc2;
    @XmlElement(name = "ACIKLAMA1")
    protected String aciklama1;
    @XmlElement(name = "ACIKLAMA2")
    protected String aciklama2;
    @XmlElement(name = "DIGERTETKIK1")
    protected String digertetkik1;
    @XmlElement(name = "DIGERTETKIK2")
    protected String digertetkik2;
    @XmlElement(name = "ISTEKNEDENI")
    protected String isteknedeni;
    @XmlElement(name = "AKRABAEVLI", required = true)
    protected EVETHAYIR akrabaevli;
    @XmlElement(name = "TALESHIKAYE", required = true)
    protected EVETHAYIR taleshikaye;
    @XmlElement(name = "AKRABAKANSIZ", required = true)
    protected EVETHAYIR akrabakansiz;
    @XmlElement(name = "DUZENLEYEN")
    protected String duzenleyen;
    @XmlElement(name = "DUZENTARIH")
    protected String duzentarih;
    @XmlElement(name = "ONAYLAYANADSOYAD")
    protected String onaylayanadsoyad;
    @XmlElement(name = "ONAYLAYANUNVAN")
    protected String onaylayanunvan;
    @XmlElement(name = "ONAYTARIH")
    protected String onaytarih;

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
     * Gets the value of the sonuc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONUC1() {
        return sonuc1;
    }

    /**
     * Sets the value of the sonuc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONUC1(String value) {
        this.sonuc1 = value;
    }

    /**
     * Gets the value of the sonuc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONUC2() {
        return sonuc2;
    }

    /**
     * Sets the value of the sonuc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONUC2(String value) {
        this.sonuc2 = value;
    }

    /**
     * Gets the value of the aciklama1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA1() {
        return aciklama1;
    }

    /**
     * Sets the value of the aciklama1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA1(String value) {
        this.aciklama1 = value;
    }

    /**
     * Gets the value of the aciklama2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA2() {
        return aciklama2;
    }

    /**
     * Sets the value of the aciklama2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA2(String value) {
        this.aciklama2 = value;
    }

    /**
     * Gets the value of the digertetkik1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIGERTETKIK1() {
        return digertetkik1;
    }

    /**
     * Sets the value of the digertetkik1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIGERTETKIK1(String value) {
        this.digertetkik1 = value;
    }

    /**
     * Gets the value of the digertetkik2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIGERTETKIK2() {
        return digertetkik2;
    }

    /**
     * Sets the value of the digertetkik2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIGERTETKIK2(String value) {
        this.digertetkik2 = value;
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
     * Gets the value of the onaylayanadsoyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONAYLAYANADSOYAD() {
        return onaylayanadsoyad;
    }

    /**
     * Sets the value of the onaylayanadsoyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONAYLAYANADSOYAD(String value) {
        this.onaylayanadsoyad = value;
    }

    /**
     * Gets the value of the onaylayanunvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONAYLAYANUNVAN() {
        return onaylayanunvan;
    }

    /**
     * Sets the value of the onaylayanunvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONAYLAYANUNVAN(String value) {
        this.onaylayanunvan = value;
    }

    /**
     * Gets the value of the onaytarih property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONAYTARIH() {
        return onaytarih;
    }

    /**
     * Sets the value of the onaytarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONAYTARIH(String value) {
        this.onaytarih = value;
    }

}
