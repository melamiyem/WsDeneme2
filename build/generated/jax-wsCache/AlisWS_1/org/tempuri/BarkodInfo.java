
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarkodInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BarkodInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BARKODNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KATSAYI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BARKOD_GRUBU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOPYA_SAYISI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BARKODTIPI" type="{http://tempuri.org/}BARKOD_TIPI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarkodInfo", propOrder = {
    "barkodno",
    "aciklama1",
    "aciklama2",
    "aciklama3",
    "aciklama4",
    "aciklama5",
    "aciklama6",
    "aciklama7",
    "aciklama8",
    "aciklama9",
    "aciklama10",
    "katsayi",
    "barkodgrubu",
    "kopyasayisi",
    "barkodtipi"
})
public class BarkodInfo {

    @XmlElement(name = "BARKODNO")
    protected String barkodno;
    @XmlElement(name = "ACIKLAMA1")
    protected String aciklama1;
    @XmlElement(name = "ACIKLAMA2")
    protected String aciklama2;
    @XmlElement(name = "ACIKLAMA3")
    protected String aciklama3;
    @XmlElement(name = "ACIKLAMA4")
    protected String aciklama4;
    @XmlElement(name = "ACIKLAMA5")
    protected String aciklama5;
    @XmlElement(name = "ACIKLAMA6")
    protected String aciklama6;
    @XmlElement(name = "ACIKLAMA7")
    protected String aciklama7;
    @XmlElement(name = "ACIKLAMA8")
    protected String aciklama8;
    @XmlElement(name = "ACIKLAMA9")
    protected String aciklama9;
    @XmlElement(name = "ACIKLAMA10")
    protected String aciklama10;
    @XmlElement(name = "KATSAYI")
    protected String katsayi;
    @XmlElement(name = "BARKOD_GRUBU")
    protected String barkodgrubu;
    @XmlElement(name = "KOPYA_SAYISI")
    protected int kopyasayisi;
    @XmlElement(name = "BARKODTIPI", required = true)
    protected BARKODTIPI barkodtipi;

    /**
     * Gets the value of the barkodno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARKODNO() {
        return barkodno;
    }

    /**
     * Sets the value of the barkodno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARKODNO(String value) {
        this.barkodno = value;
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
     * Gets the value of the aciklama3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA3() {
        return aciklama3;
    }

    /**
     * Sets the value of the aciklama3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA3(String value) {
        this.aciklama3 = value;
    }

    /**
     * Gets the value of the aciklama4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA4() {
        return aciklama4;
    }

    /**
     * Sets the value of the aciklama4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA4(String value) {
        this.aciklama4 = value;
    }

    /**
     * Gets the value of the aciklama5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA5() {
        return aciklama5;
    }

    /**
     * Sets the value of the aciklama5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA5(String value) {
        this.aciklama5 = value;
    }

    /**
     * Gets the value of the aciklama6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA6() {
        return aciklama6;
    }

    /**
     * Sets the value of the aciklama6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA6(String value) {
        this.aciklama6 = value;
    }

    /**
     * Gets the value of the aciklama7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA7() {
        return aciklama7;
    }

    /**
     * Sets the value of the aciklama7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA7(String value) {
        this.aciklama7 = value;
    }

    /**
     * Gets the value of the aciklama8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA8() {
        return aciklama8;
    }

    /**
     * Sets the value of the aciklama8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA8(String value) {
        this.aciklama8 = value;
    }

    /**
     * Gets the value of the aciklama9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA9() {
        return aciklama9;
    }

    /**
     * Sets the value of the aciklama9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA9(String value) {
        this.aciklama9 = value;
    }

    /**
     * Gets the value of the aciklama10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA10() {
        return aciklama10;
    }

    /**
     * Sets the value of the aciklama10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA10(String value) {
        this.aciklama10 = value;
    }

    /**
     * Gets the value of the katsayi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKATSAYI() {
        return katsayi;
    }

    /**
     * Sets the value of the katsayi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKATSAYI(String value) {
        this.katsayi = value;
    }

    /**
     * Gets the value of the barkodgrubu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARKODGRUBU() {
        return barkodgrubu;
    }

    /**
     * Sets the value of the barkodgrubu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARKODGRUBU(String value) {
        this.barkodgrubu = value;
    }

    /**
     * Gets the value of the kopyasayisi property.
     * 
     */
    public int getKOPYASAYISI() {
        return kopyasayisi;
    }

    /**
     * Sets the value of the kopyasayisi property.
     * 
     */
    public void setKOPYASAYISI(int value) {
        this.kopyasayisi = value;
    }

    /**
     * Gets the value of the barkodtipi property.
     * 
     * @return
     *     possible object is
     *     {@link BARKODTIPI }
     *     
     */
    public BARKODTIPI getBARKODTIPI() {
        return barkodtipi;
    }

    /**
     * Sets the value of the barkodtipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BARKODTIPI }
     *     
     */
    public void setBARKODTIPI(BARKODTIPI value) {
        this.barkodtipi = value;
    }

}
