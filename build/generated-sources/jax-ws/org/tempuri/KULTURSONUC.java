
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KULTURSONUC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KULTURSONUC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UREME_DURUM" type="{http://tempuri.org/}UREME_DURUM_TIPI"/>
 *         &lt;element name="SONUC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIKALINYER_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIKMATERYAL_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SONUCACIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIKROSKOBI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BOYAMA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENFEKSIYON_DURUM" type="{http://tempuri.org/}ENFEKSIYON_TIPI"/>
 *         &lt;element name="ORGANIZMASONUCLIST" type="{http://tempuri.org/}ArrayOfORGANIZMASONUC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KULTURSONUC", propOrder = {
    "uremedurum",
    "sonuc",
    "mikalinyeradi",
    "mikmateryaladi",
    "sonucacik",
    "mikroskobi",
    "boyama",
    "enfeksiyondurum",
    "organizmasonuclist"
})
public class KULTURSONUC {

    @XmlElement(name = "UREME_DURUM", required = true)
    protected UREMEDURUMTIPI uremedurum;
    @XmlElement(name = "SONUC")
    protected String sonuc;
    @XmlElement(name = "MIKALINYER_ADI")
    protected String mikalinyeradi;
    @XmlElement(name = "MIKMATERYAL_ADI")
    protected String mikmateryaladi;
    @XmlElement(name = "SONUCACIK")
    protected String sonucacik;
    @XmlElement(name = "MIKROSKOBI")
    protected String mikroskobi;
    @XmlElement(name = "BOYAMA")
    protected String boyama;
    @XmlElement(name = "ENFEKSIYON_DURUM", required = true)
    protected ENFEKSIYONTIPI enfeksiyondurum;
    @XmlElement(name = "ORGANIZMASONUCLIST")
    protected ArrayOfORGANIZMASONUC organizmasonuclist;

    /**
     * Gets the value of the uremedurum property.
     * 
     * @return
     *     possible object is
     *     {@link UREMEDURUMTIPI }
     *     
     */
    public UREMEDURUMTIPI getUREMEDURUM() {
        return uremedurum;
    }

    /**
     * Sets the value of the uremedurum property.
     * 
     * @param value
     *     allowed object is
     *     {@link UREMEDURUMTIPI }
     *     
     */
    public void setUREMEDURUM(UREMEDURUMTIPI value) {
        this.uremedurum = value;
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
     * Gets the value of the mikalinyeradi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIKALINYERADI() {
        return mikalinyeradi;
    }

    /**
     * Sets the value of the mikalinyeradi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIKALINYERADI(String value) {
        this.mikalinyeradi = value;
    }

    /**
     * Gets the value of the mikmateryaladi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIKMATERYALADI() {
        return mikmateryaladi;
    }

    /**
     * Sets the value of the mikmateryaladi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIKMATERYALADI(String value) {
        this.mikmateryaladi = value;
    }

    /**
     * Gets the value of the sonucacik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONUCACIK() {
        return sonucacik;
    }

    /**
     * Sets the value of the sonucacik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONUCACIK(String value) {
        this.sonucacik = value;
    }

    /**
     * Gets the value of the mikroskobi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIKROSKOBI() {
        return mikroskobi;
    }

    /**
     * Sets the value of the mikroskobi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIKROSKOBI(String value) {
        this.mikroskobi = value;
    }

    /**
     * Gets the value of the boyama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOYAMA() {
        return boyama;
    }

    /**
     * Sets the value of the boyama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOYAMA(String value) {
        this.boyama = value;
    }

    /**
     * Gets the value of the enfeksiyondurum property.
     * 
     * @return
     *     possible object is
     *     {@link ENFEKSIYONTIPI }
     *     
     */
    public ENFEKSIYONTIPI getENFEKSIYONDURUM() {
        return enfeksiyondurum;
    }

    /**
     * Sets the value of the enfeksiyondurum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENFEKSIYONTIPI }
     *     
     */
    public void setENFEKSIYONDURUM(ENFEKSIYONTIPI value) {
        this.enfeksiyondurum = value;
    }

    /**
     * Gets the value of the organizmasonuclist property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfORGANIZMASONUC }
     *     
     */
    public ArrayOfORGANIZMASONUC getORGANIZMASONUCLIST() {
        return organizmasonuclist;
    }

    /**
     * Sets the value of the organizmasonuclist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfORGANIZMASONUC }
     *     
     */
    public void setORGANIZMASONUCLIST(ArrayOfORGANIZMASONUC value) {
        this.organizmasonuclist = value;
    }

}
