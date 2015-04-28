
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SonucDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SonucDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="islemSonuc" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
 *         &lt;element name="SONUC_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ORNEKNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HASTA_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HASTA_SOYADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TC_KIMLIKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CINSIYET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNITE_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEST_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SONUC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KULTUR_SONUC" type="{http://tempuri.org/}KULTURSONUC" minOccurs="0"/>
 *         &lt;element name="EKSONUC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EKSONUC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DETAY_ACIKLAMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REF_DEGER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUSUK_YUKSEK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BIRIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GONDERILDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PATOLOJIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KULTUR_TESTI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KAYIT_TARIHI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CALISMA_TARIHI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SONUC_ENTEG1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SONUC_ENTEG2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SONUC_ENTEG3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TETKIK_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TETKIK_KODU2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ONAYLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SONUC_DURUM" type="{http://tempuri.org/}DURUM"/>
 *         &lt;element name="SONUC_DURUM_ACIKLAMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SonucDurum", propOrder = {
    "islemSonuc",
    "sonucid",
    "ornekno",
    "hastaadi",
    "hastasoyadi",
    "tckimlikno",
    "cinsiyet",
    "uniteadi",
    "testadi",
    "sonuc",
    "kultursonuc",
    "eksonuc1",
    "eksonuc2",
    "aciklama",
    "detayaciklama",
    "refdeger",
    "dusukyuksek",
    "birim",
    "gonderildi",
    "patolojik",
    "kulturtesti",
    "kayittarihi",
    "calismatarihi",
    "sonucenteg1",
    "sonucenteg2",
    "sonucenteg3",
    "tetkikkodu",
    "tetkikkodu2",
    "onayli",
    "sonucdurum",
    "sonucdurumaciklama"
})
public class SonucDurum {

    protected IslemSonuc islemSonuc;
    @XmlElement(name = "SONUC_ID")
    protected int sonucid;
    @XmlElement(name = "ORNEKNO")
    protected int ornekno;
    @XmlElement(name = "HASTA_ADI")
    protected String hastaadi;
    @XmlElement(name = "HASTA_SOYADI")
    protected String hastasoyadi;
    @XmlElement(name = "TC_KIMLIKNO")
    protected String tckimlikno;
    @XmlElement(name = "CINSIYET")
    protected String cinsiyet;
    @XmlElement(name = "UNITE_ADI")
    protected String uniteadi;
    @XmlElement(name = "TEST_ADI")
    protected String testadi;
    @XmlElement(name = "SONUC")
    protected String sonuc;
    @XmlElement(name = "KULTUR_SONUC")
    protected KULTURSONUC kultursonuc;
    @XmlElement(name = "EKSONUC1")
    protected String eksonuc1;
    @XmlElement(name = "EKSONUC2")
    protected String eksonuc2;
    @XmlElement(name = "ACIKLAMA")
    protected String aciklama;
    @XmlElement(name = "DETAY_ACIKLAMA")
    protected String detayaciklama;
    @XmlElement(name = "REF_DEGER")
    protected String refdeger;
    @XmlElement(name = "DUSUK_YUKSEK")
    protected String dusukyuksek;
    @XmlElement(name = "BIRIM")
    protected String birim;
    @XmlElement(name = "GONDERILDI")
    protected String gonderildi;
    @XmlElement(name = "PATOLOJIK")
    protected String patolojik;
    @XmlElement(name = "KULTUR_TESTI")
    protected String kulturtesti;
    @XmlElement(name = "KAYIT_TARIHI")
    protected String kayittarihi;
    @XmlElement(name = "CALISMA_TARIHI")
    protected String calismatarihi;
    @XmlElement(name = "SONUC_ENTEG1")
    protected String sonucenteg1;
    @XmlElement(name = "SONUC_ENTEG2")
    protected String sonucenteg2;
    @XmlElement(name = "SONUC_ENTEG3")
    protected String sonucenteg3;
    @XmlElement(name = "TETKIK_KODU")
    protected String tetkikkodu;
    @XmlElement(name = "TETKIK_KODU2")
    protected String tetkikkodu2;
    @XmlElement(name = "ONAYLI")
    protected String onayli;
    @XmlElement(name = "SONUC_DURUM", required = true)
    protected DURUM sonucdurum;
    @XmlElement(name = "SONUC_DURUM_ACIKLAMA")
    protected String sonucdurumaciklama;

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
     * Gets the value of the sonucid property.
     * 
     */
    public int getSONUCID() {
        return sonucid;
    }

    /**
     * Sets the value of the sonucid property.
     * 
     */
    public void setSONUCID(int value) {
        this.sonucid = value;
    }

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
     * Gets the value of the hastaadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHASTAADI() {
        return hastaadi;
    }

    /**
     * Sets the value of the hastaadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHASTAADI(String value) {
        this.hastaadi = value;
    }

    /**
     * Gets the value of the hastasoyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHASTASOYADI() {
        return hastasoyadi;
    }

    /**
     * Sets the value of the hastasoyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHASTASOYADI(String value) {
        this.hastasoyadi = value;
    }

    /**
     * Gets the value of the tckimlikno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCKIMLIKNO() {
        return tckimlikno;
    }

    /**
     * Sets the value of the tckimlikno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCKIMLIKNO(String value) {
        this.tckimlikno = value;
    }

    /**
     * Gets the value of the cinsiyet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCINSIYET() {
        return cinsiyet;
    }

    /**
     * Sets the value of the cinsiyet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCINSIYET(String value) {
        this.cinsiyet = value;
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
     * Gets the value of the testadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTESTADI() {
        return testadi;
    }

    /**
     * Sets the value of the testadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTESTADI(String value) {
        this.testadi = value;
    }

    /**
     * Gets the value of the sonuc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONUC() {
        return sonuc;
    }

    /**
     * Sets the value of the sonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONUC(String value) {
        this.sonuc = value;
    }

    /**
     * Gets the value of the kultursonuc property.
     * 
     * @return
     *     possible object is
     *     {@link KULTURSONUC }
     *     
     */
    public KULTURSONUC getKULTURSONUC() {
        return kultursonuc;
    }

    /**
     * Sets the value of the kultursonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link KULTURSONUC }
     *     
     */
    public void setKULTURSONUC(KULTURSONUC value) {
        this.kultursonuc = value;
    }

    /**
     * Gets the value of the eksonuc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEKSONUC1() {
        return eksonuc1;
    }

    /**
     * Sets the value of the eksonuc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEKSONUC1(String value) {
        this.eksonuc1 = value;
    }

    /**
     * Gets the value of the eksonuc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEKSONUC2() {
        return eksonuc2;
    }

    /**
     * Sets the value of the eksonuc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEKSONUC2(String value) {
        this.eksonuc2 = value;
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
     * Gets the value of the detayaciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDETAYACIKLAMA() {
        return detayaciklama;
    }

    /**
     * Sets the value of the detayaciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDETAYACIKLAMA(String value) {
        this.detayaciklama = value;
    }

    /**
     * Gets the value of the refdeger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFDEGER() {
        return refdeger;
    }

    /**
     * Sets the value of the refdeger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFDEGER(String value) {
        this.refdeger = value;
    }

    /**
     * Gets the value of the dusukyuksek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUSUKYUKSEK() {
        return dusukyuksek;
    }

    /**
     * Sets the value of the dusukyuksek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUSUKYUKSEK(String value) {
        this.dusukyuksek = value;
    }

    /**
     * Gets the value of the birim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIRIM() {
        return birim;
    }

    /**
     * Sets the value of the birim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIRIM(String value) {
        this.birim = value;
    }

    /**
     * Gets the value of the gonderildi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGONDERILDI() {
        return gonderildi;
    }

    /**
     * Sets the value of the gonderildi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGONDERILDI(String value) {
        this.gonderildi = value;
    }

    /**
     * Gets the value of the patolojik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATOLOJIK() {
        return patolojik;
    }

    /**
     * Sets the value of the patolojik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATOLOJIK(String value) {
        this.patolojik = value;
    }

    /**
     * Gets the value of the kulturtesti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKULTURTESTI() {
        return kulturtesti;
    }

    /**
     * Sets the value of the kulturtesti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKULTURTESTI(String value) {
        this.kulturtesti = value;
    }

    /**
     * Gets the value of the kayittarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKAYITTARIHI() {
        return kayittarihi;
    }

    /**
     * Sets the value of the kayittarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKAYITTARIHI(String value) {
        this.kayittarihi = value;
    }

    /**
     * Gets the value of the calismatarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALISMATARIHI() {
        return calismatarihi;
    }

    /**
     * Sets the value of the calismatarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALISMATARIHI(String value) {
        this.calismatarihi = value;
    }

    /**
     * Gets the value of the sonucenteg1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONUCENTEG1() {
        return sonucenteg1;
    }

    /**
     * Sets the value of the sonucenteg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONUCENTEG1(String value) {
        this.sonucenteg1 = value;
    }

    /**
     * Gets the value of the sonucenteg2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONUCENTEG2() {
        return sonucenteg2;
    }

    /**
     * Sets the value of the sonucenteg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONUCENTEG2(String value) {
        this.sonucenteg2 = value;
    }

    /**
     * Gets the value of the sonucenteg3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONUCENTEG3() {
        return sonucenteg3;
    }

    /**
     * Sets the value of the sonucenteg3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONUCENTEG3(String value) {
        this.sonucenteg3 = value;
    }

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
     * Gets the value of the tetkikkodu2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTETKIKKODU2() {
        return tetkikkodu2;
    }

    /**
     * Sets the value of the tetkikkodu2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTETKIKKODU2(String value) {
        this.tetkikkodu2 = value;
    }

    /**
     * Gets the value of the onayli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONAYLI() {
        return onayli;
    }

    /**
     * Sets the value of the onayli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONAYLI(String value) {
        this.onayli = value;
    }

    /**
     * Gets the value of the sonucdurum property.
     * 
     * @return
     *     possible object is
     *     {@link DURUM }
     *     
     */
    public DURUM getSONUCDURUM() {
        return sonucdurum;
    }

    /**
     * Sets the value of the sonucdurum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURUM }
     *     
     */
    public void setSONUCDURUM(DURUM value) {
        this.sonucdurum = value;
    }

    /**
     * Gets the value of the sonucdurumaciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONUCDURUMACIKLAMA() {
        return sonucdurumaciklama;
    }

    /**
     * Sets the value of the sonucdurumaciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONUCDURUMACIKLAMA(String value) {
        this.sonucdurumaciklama = value;
    }

}
