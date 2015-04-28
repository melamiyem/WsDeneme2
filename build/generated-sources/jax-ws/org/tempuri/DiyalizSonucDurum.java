
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiyalizSonucDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiyalizSonucDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServisKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KurumKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BasTar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BitTar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Testler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SonucDurumArr" type="{http://tempuri.org/}ArrayOfSonucDurum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiyalizSonucDurum", propOrder = {
    "servisKodu",
    "kurumKodu",
    "basTar",
    "bitTar",
    "testler",
    "sonucDurumArr"
})
public class DiyalizSonucDurum {

    @XmlElement(name = "ServisKodu")
    protected String servisKodu;
    @XmlElement(name = "KurumKodu")
    protected String kurumKodu;
    @XmlElement(name = "BasTar")
    protected String basTar;
    @XmlElement(name = "BitTar")
    protected String bitTar;
    @XmlElement(name = "Testler")
    protected String testler;
    @XmlElement(name = "SonucDurumArr")
    protected ArrayOfSonucDurum sonucDurumArr;

    /**
     * Gets the value of the servisKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServisKodu() {
        return servisKodu;
    }

    /**
     * Sets the value of the servisKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServisKodu(String value) {
        this.servisKodu = value;
    }

    /**
     * Gets the value of the kurumKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumKodu() {
        return kurumKodu;
    }

    /**
     * Sets the value of the kurumKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumKodu(String value) {
        this.kurumKodu = value;
    }

    /**
     * Gets the value of the basTar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasTar() {
        return basTar;
    }

    /**
     * Sets the value of the basTar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasTar(String value) {
        this.basTar = value;
    }

    /**
     * Gets the value of the bitTar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitTar() {
        return bitTar;
    }

    /**
     * Sets the value of the bitTar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitTar(String value) {
        this.bitTar = value;
    }

    /**
     * Gets the value of the testler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestler() {
        return testler;
    }

    /**
     * Sets the value of the testler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestler(String value) {
        this.testler = value;
    }

    /**
     * Gets the value of the sonucDurumArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSonucDurum }
     *     
     */
    public ArrayOfSonucDurum getSonucDurumArr() {
        return sonucDurumArr;
    }

    /**
     * Sets the value of the sonucDurumArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSonucDurum }
     *     
     */
    public void setSonucDurumArr(ArrayOfSonucDurum value) {
        this.sonucDurumArr = value;
    }

}
