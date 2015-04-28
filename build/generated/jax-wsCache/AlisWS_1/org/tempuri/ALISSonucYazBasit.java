
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
 *         &lt;element name="SONUC_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ORNEKNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CALISMA_TARIHI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENTEGRASYON_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SONUC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIHAZSONUC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EKSONUC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EKSONUC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BIRIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NDARALIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NDUYGUN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUSUK_YUKSEK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sonucid",
    "ornekno",
    "calismatarihi",
    "entegrasyonkodu",
    "sonuc",
    "cihazsonuc",
    "eksonuc1",
    "eksonuc2",
    "aciklama",
    "birim",
    "ndaralik",
    "nduygun",
    "dusukyuksek"
})
@XmlRootElement(name = "ALISSonucYazBasit")
public class ALISSonucYazBasit {

    @XmlElement(name = "VENUSER")
    protected String venuser;
    @XmlElement(name = "VENPASS")
    protected String venpass;
    @XmlElement(name = "SONUC_ID")
    protected int sonucid;
    @XmlElement(name = "ORNEKNO")
    protected int ornekno;
    @XmlElement(name = "CALISMA_TARIHI")
    protected String calismatarihi;
    @XmlElement(name = "ENTEGRASYON_KODU")
    protected String entegrasyonkodu;
    @XmlElement(name = "SONUC")
    protected String sonuc;
    @XmlElement(name = "CIHAZSONUC")
    protected String cihazsonuc;
    @XmlElement(name = "EKSONUC1")
    protected String eksonuc1;
    @XmlElement(name = "EKSONUC2")
    protected String eksonuc2;
    @XmlElement(name = "ACIKLAMA")
    protected String aciklama;
    @XmlElement(name = "BIRIM")
    protected String birim;
    @XmlElement(name = "NDARALIK")
    protected String ndaralik;
    @XmlElement(name = "NDUYGUN")
    protected String nduygun;
    @XmlElement(name = "DUSUK_YUKSEK")
    protected String dusukyuksek;

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
     * Gets the value of the entegrasyonkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTEGRASYONKODU() {
        return entegrasyonkodu;
    }

    /**
     * Sets the value of the entegrasyonkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTEGRASYONKODU(String value) {
        this.entegrasyonkodu = value;
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
     * Gets the value of the cihazsonuc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIHAZSONUC() {
        return cihazsonuc;
    }

    /**
     * Sets the value of the cihazsonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIHAZSONUC(String value) {
        this.cihazsonuc = value;
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
     * Gets the value of the ndaralik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDARALIK() {
        return ndaralik;
    }

    /**
     * Sets the value of the ndaralik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDARALIK(String value) {
        this.ndaralik = value;
    }

    /**
     * Gets the value of the nduygun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDUYGUN() {
        return nduygun;
    }

    /**
     * Sets the value of the nduygun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDUYGUN(String value) {
        this.nduygun = value;
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

}
