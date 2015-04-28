
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrnekKayitSorgulaDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrnekKayitSorgulaDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="islemSonuc" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
 *         &lt;element name="Katsayi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TetkikTur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KayitDurumArr" type="{http://tempuri.org/}ArrayOfKayitDurum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrnekKayitSorgulaDurum", propOrder = {
    "islemSonuc",
    "katsayi",
    "tetkikTur",
    "kayitDurumArr"
})
public class OrnekKayitSorgulaDurum {

    protected IslemSonuc islemSonuc;
    @XmlElement(name = "Katsayi")
    protected int katsayi;
    @XmlElement(name = "TetkikTur")
    protected String tetkikTur;
    @XmlElement(name = "KayitDurumArr")
    protected ArrayOfKayitDurum kayitDurumArr;

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
     * Gets the value of the katsayi property.
     * 
     */
    public int getKatsayi() {
        return katsayi;
    }

    /**
     * Sets the value of the katsayi property.
     * 
     */
    public void setKatsayi(int value) {
        this.katsayi = value;
    }

    /**
     * Gets the value of the tetkikTur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTetkikTur() {
        return tetkikTur;
    }

    /**
     * Sets the value of the tetkikTur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTetkikTur(String value) {
        this.tetkikTur = value;
    }

    /**
     * Gets the value of the kayitDurumArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKayitDurum }
     *     
     */
    public ArrayOfKayitDurum getKayitDurumArr() {
        return kayitDurumArr;
    }

    /**
     * Sets the value of the kayitDurumArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKayitDurum }
     *     
     */
    public void setKayitDurumArr(ArrayOfKayitDurum value) {
        this.kayitDurumArr = value;
    }

}
