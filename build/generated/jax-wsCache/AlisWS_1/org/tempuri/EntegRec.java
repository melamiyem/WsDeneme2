
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntegRec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntegRec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VENPASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VENUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORNEKNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TETKIKLER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TetkikArr" type="{http://tempuri.org/}ArrayOfTetkik" minOccurs="0"/>
 *         &lt;element name="ISTEM_TARIHI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TC_KIMLIKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOSYA_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GELIS_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOYAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CINSIYET" type="{http://tempuri.org/}CINSIYET_TIPI"/>
 *         &lt;element name="DOGUM_TARIHI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOGUM_YERI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BABA_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANA_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIL" type="{http://tempuri.org/}ACIL_TIPI"/>
 *         &lt;element name="YATAN" type="{http://tempuri.org/}YATAN_TIPI"/>
 *         &lt;element name="SGK" type="{http://tempuri.org/}SKRS_SGK"/>
 *         &lt;element name="KURUM_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KURUM_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERVIS_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERVIS_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERPOL" type="{http://tempuri.org/}SERPOL_TIPI"/>
 *         &lt;element name="DOKTOR_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOKTOR_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOKTOR_SOYADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOKTOR_SICIL_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TANI_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TANI_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOBILTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EPOSTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SONUC_ALABILIR_YAKINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OZELKOD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OZELKOD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OZELKOD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OZELKOD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OZELKOD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KANALMA_TARIHI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LABKABUL_TARIHI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntegRec", propOrder = {
    "venpass",
    "venuser",
    "ornekno",
    "tetkikler",
    "tetkikArr",
    "istemtarihi",
    "tckimlikno",
    "dosyano",
    "gelisno",
    "ad",
    "soyad",
    "cinsiyet",
    "dogumtarihi",
    "dogumyeri",
    "babaadi",
    "anaadi",
    "acil",
    "yatan",
    "sgk",
    "kurumkodu",
    "kurumadi",
    "serviskodu",
    "servisadi",
    "serpol",
    "doktorkodu",
    "doktoradi",
    "doktorsoyadi",
    "doktorsicilno",
    "tanikodu",
    "taniadi",
    "aciklama",
    "tel",
    "tel2",
    "mobiltel",
    "eposta",
    "sonucalabiliryakini",
    "ozelkod1",
    "ozelkod2",
    "ozelkod3",
    "ozelkod4",
    "ozelkod5",
    "kanalmatarihi",
    "labkabultarihi"
})
public class EntegRec {

    @XmlElement(name = "VENPASS")
    protected String venpass;
    @XmlElement(name = "VENUSER")
    protected String venuser;
    @XmlElement(name = "ORNEKNO")
    protected int ornekno;
    @XmlElement(name = "TETKIKLER")
    protected String tetkikler;
    @XmlElement(name = "TetkikArr")
    protected ArrayOfTetkik tetkikArr;
    @XmlElement(name = "ISTEM_TARIHI")
    protected String istemtarihi;
    @XmlElement(name = "TC_KIMLIKNO")
    protected String tckimlikno;
    @XmlElement(name = "DOSYA_NO")
    protected String dosyano;
    @XmlElement(name = "GELIS_NO")
    protected String gelisno;
    @XmlElement(name = "AD")
    protected String ad;
    @XmlElement(name = "SOYAD")
    protected String soyad;
    @XmlElement(name = "CINSIYET", required = true)
    protected CINSIYETTIPI cinsiyet;
    @XmlElement(name = "DOGUM_TARIHI")
    protected String dogumtarihi;
    @XmlElement(name = "DOGUM_YERI")
    protected String dogumyeri;
    @XmlElement(name = "BABA_ADI")
    protected String babaadi;
    @XmlElement(name = "ANA_ADI")
    protected String anaadi;
    @XmlElement(name = "ACIL", required = true)
    protected ACILTIPI acil;
    @XmlElement(name = "YATAN", required = true)
    protected YATANTIPI yatan;
    @XmlElement(name = "SGK", required = true)
    protected SKRSSGK sgk;
    @XmlElement(name = "KURUM_KODU")
    protected String kurumkodu;
    @XmlElement(name = "KURUM_ADI")
    protected String kurumadi;
    @XmlElement(name = "SERVIS_KODU")
    protected String serviskodu;
    @XmlElement(name = "SERVIS_ADI")
    protected String servisadi;
    @XmlElement(name = "SERPOL", required = true)
    protected SERPOLTIPI serpol;
    @XmlElement(name = "DOKTOR_KODU")
    protected String doktorkodu;
    @XmlElement(name = "DOKTOR_ADI")
    protected String doktoradi;
    @XmlElement(name = "DOKTOR_SOYADI")
    protected String doktorsoyadi;
    @XmlElement(name = "DOKTOR_SICIL_NO")
    protected String doktorsicilno;
    @XmlElement(name = "TANI_KODU")
    protected String tanikodu;
    @XmlElement(name = "TANI_ADI")
    protected String taniadi;
    @XmlElement(name = "ACIKLAMA")
    protected String aciklama;
    @XmlElement(name = "TEL")
    protected String tel;
    @XmlElement(name = "TEL2")
    protected String tel2;
    @XmlElement(name = "MOBILTEL")
    protected String mobiltel;
    @XmlElement(name = "EPOSTA")
    protected String eposta;
    @XmlElement(name = "SONUC_ALABILIR_YAKINI")
    protected String sonucalabiliryakini;
    @XmlElement(name = "OZELKOD1")
    protected String ozelkod1;
    @XmlElement(name = "OZELKOD2")
    protected String ozelkod2;
    @XmlElement(name = "OZELKOD3")
    protected String ozelkod3;
    @XmlElement(name = "OZELKOD4")
    protected String ozelkod4;
    @XmlElement(name = "OZELKOD5")
    protected String ozelkod5;
    @XmlElement(name = "KANALMA_TARIHI")
    protected String kanalmatarihi;
    @XmlElement(name = "LABKABUL_TARIHI")
    protected String labkabultarihi;

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
     * Gets the value of the tetkikler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTETKIKLER() {
        return tetkikler;
    }

    /**
     * Sets the value of the tetkikler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTETKIKLER(String value) {
        this.tetkikler = value;
    }

    /**
     * Gets the value of the tetkikArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTetkik }
     *     
     */
    public ArrayOfTetkik getTetkikArr() {
        return tetkikArr;
    }

    /**
     * Sets the value of the tetkikArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTetkik }
     *     
     */
    public void setTetkikArr(ArrayOfTetkik value) {
        this.tetkikArr = value;
    }

    /**
     * Gets the value of the istemtarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISTEMTARIHI() {
        return istemtarihi;
    }

    /**
     * Sets the value of the istemtarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISTEMTARIHI(String value) {
        this.istemtarihi = value;
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
     * Gets the value of the dosyano property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOSYANO() {
        return dosyano;
    }

    /**
     * Sets the value of the dosyano property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOSYANO(String value) {
        this.dosyano = value;
    }

    /**
     * Gets the value of the gelisno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGELISNO() {
        return gelisno;
    }

    /**
     * Sets the value of the gelisno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGELISNO(String value) {
        this.gelisno = value;
    }

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAD() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAD(String value) {
        this.ad = value;
    }

    /**
     * Gets the value of the soyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOYAD() {
        return soyad;
    }

    /**
     * Sets the value of the soyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOYAD(String value) {
        this.soyad = value;
    }

    /**
     * Gets the value of the cinsiyet property.
     * 
     * @return
     *     possible object is
     *     {@link CINSIYETTIPI }
     *     
     */
    public CINSIYETTIPI getCINSIYET() {
        return cinsiyet;
    }

    /**
     * Sets the value of the cinsiyet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CINSIYETTIPI }
     *     
     */
    public void setCINSIYET(CINSIYETTIPI value) {
        this.cinsiyet = value;
    }

    /**
     * Gets the value of the dogumtarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOGUMTARIHI() {
        return dogumtarihi;
    }

    /**
     * Sets the value of the dogumtarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOGUMTARIHI(String value) {
        this.dogumtarihi = value;
    }

    /**
     * Gets the value of the dogumyeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOGUMYERI() {
        return dogumyeri;
    }

    /**
     * Sets the value of the dogumyeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOGUMYERI(String value) {
        this.dogumyeri = value;
    }

    /**
     * Gets the value of the babaadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBABAADI() {
        return babaadi;
    }

    /**
     * Sets the value of the babaadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBABAADI(String value) {
        this.babaadi = value;
    }

    /**
     * Gets the value of the anaadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANAADI() {
        return anaadi;
    }

    /**
     * Sets the value of the anaadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANAADI(String value) {
        this.anaadi = value;
    }

    /**
     * Gets the value of the acil property.
     * 
     * @return
     *     possible object is
     *     {@link ACILTIPI }
     *     
     */
    public ACILTIPI getACIL() {
        return acil;
    }

    /**
     * Sets the value of the acil property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACILTIPI }
     *     
     */
    public void setACIL(ACILTIPI value) {
        this.acil = value;
    }

    /**
     * Gets the value of the yatan property.
     * 
     * @return
     *     possible object is
     *     {@link YATANTIPI }
     *     
     */
    public YATANTIPI getYATAN() {
        return yatan;
    }

    /**
     * Sets the value of the yatan property.
     * 
     * @param value
     *     allowed object is
     *     {@link YATANTIPI }
     *     
     */
    public void setYATAN(YATANTIPI value) {
        this.yatan = value;
    }

    /**
     * Gets the value of the sgk property.
     * 
     * @return
     *     possible object is
     *     {@link SKRSSGK }
     *     
     */
    public SKRSSGK getSGK() {
        return sgk;
    }

    /**
     * Sets the value of the sgk property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKRSSGK }
     *     
     */
    public void setSGK(SKRSSGK value) {
        this.sgk = value;
    }

    /**
     * Gets the value of the kurumkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKURUMKODU() {
        return kurumkodu;
    }

    /**
     * Sets the value of the kurumkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKURUMKODU(String value) {
        this.kurumkodu = value;
    }

    /**
     * Gets the value of the kurumadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKURUMADI() {
        return kurumadi;
    }

    /**
     * Sets the value of the kurumadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKURUMADI(String value) {
        this.kurumadi = value;
    }

    /**
     * Gets the value of the serviskodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVISKODU() {
        return serviskodu;
    }

    /**
     * Sets the value of the serviskodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVISKODU(String value) {
        this.serviskodu = value;
    }

    /**
     * Gets the value of the servisadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVISADI() {
        return servisadi;
    }

    /**
     * Sets the value of the servisadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVISADI(String value) {
        this.servisadi = value;
    }

    /**
     * Gets the value of the serpol property.
     * 
     * @return
     *     possible object is
     *     {@link SERPOLTIPI }
     *     
     */
    public SERPOLTIPI getSERPOL() {
        return serpol;
    }

    /**
     * Sets the value of the serpol property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERPOLTIPI }
     *     
     */
    public void setSERPOL(SERPOLTIPI value) {
        this.serpol = value;
    }

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
     * Gets the value of the doktorsicilno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOKTORSICILNO() {
        return doktorsicilno;
    }

    /**
     * Sets the value of the doktorsicilno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOKTORSICILNO(String value) {
        this.doktorsicilno = value;
    }

    /**
     * Gets the value of the tanikodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTANIKODU() {
        return tanikodu;
    }

    /**
     * Sets the value of the tanikodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTANIKODU(String value) {
        this.tanikodu = value;
    }

    /**
     * Gets the value of the taniadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTANIADI() {
        return taniadi;
    }

    /**
     * Sets the value of the taniadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTANIADI(String value) {
        this.taniadi = value;
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
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEL() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEL(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the tel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEL2() {
        return tel2;
    }

    /**
     * Sets the value of the tel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEL2(String value) {
        this.tel2 = value;
    }

    /**
     * Gets the value of the mobiltel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBILTEL() {
        return mobiltel;
    }

    /**
     * Sets the value of the mobiltel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBILTEL(String value) {
        this.mobiltel = value;
    }

    /**
     * Gets the value of the eposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPOSTA() {
        return eposta;
    }

    /**
     * Sets the value of the eposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPOSTA(String value) {
        this.eposta = value;
    }

    /**
     * Gets the value of the sonucalabiliryakini property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONUCALABILIRYAKINI() {
        return sonucalabiliryakini;
    }

    /**
     * Sets the value of the sonucalabiliryakini property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONUCALABILIRYAKINI(String value) {
        this.sonucalabiliryakini = value;
    }

    /**
     * Gets the value of the ozelkod1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOZELKOD1() {
        return ozelkod1;
    }

    /**
     * Sets the value of the ozelkod1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOZELKOD1(String value) {
        this.ozelkod1 = value;
    }

    /**
     * Gets the value of the ozelkod2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOZELKOD2() {
        return ozelkod2;
    }

    /**
     * Sets the value of the ozelkod2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOZELKOD2(String value) {
        this.ozelkod2 = value;
    }

    /**
     * Gets the value of the ozelkod3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOZELKOD3() {
        return ozelkod3;
    }

    /**
     * Sets the value of the ozelkod3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOZELKOD3(String value) {
        this.ozelkod3 = value;
    }

    /**
     * Gets the value of the ozelkod4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOZELKOD4() {
        return ozelkod4;
    }

    /**
     * Sets the value of the ozelkod4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOZELKOD4(String value) {
        this.ozelkod4 = value;
    }

    /**
     * Gets the value of the ozelkod5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOZELKOD5() {
        return ozelkod5;
    }

    /**
     * Sets the value of the ozelkod5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOZELKOD5(String value) {
        this.ozelkod5 = value;
    }

    /**
     * Gets the value of the kanalmatarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKANALMATARIHI() {
        return kanalmatarihi;
    }

    /**
     * Sets the value of the kanalmatarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKANALMATARIHI(String value) {
        this.kanalmatarihi = value;
    }

    /**
     * Gets the value of the labkabultarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABKABULTARIHI() {
        return labkabultarihi;
    }

    /**
     * Sets the value of the labkabultarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABKABULTARIHI(String value) {
        this.labkabultarihi = value;
    }

}
