
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KayitSorgulaDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KayitSorgulaDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="islemSonuc" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
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
@XmlType(name = "KayitSorgulaDurum", propOrder = {
    "islemSonuc",
    "kayitDurumArr"
})
public class KayitSorgulaDurum {

    protected IslemSonuc islemSonuc;
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
