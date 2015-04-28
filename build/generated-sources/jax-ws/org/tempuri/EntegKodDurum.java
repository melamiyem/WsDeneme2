
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntegKodDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntegKodDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="islemSonuc" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
 *         &lt;element name="EntegKodArr" type="{http://tempuri.org/}ArrayOfEntegKodlar" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntegKodDurum", propOrder = {
    "islemSonuc",
    "entegKodArr"
})
public class EntegKodDurum {

    protected IslemSonuc islemSonuc;
    @XmlElement(name = "EntegKodArr")
    protected ArrayOfEntegKodlar entegKodArr;

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
     * Gets the value of the entegKodArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntegKodlar }
     *     
     */
    public ArrayOfEntegKodlar getEntegKodArr() {
        return entegKodArr;
    }

    /**
     * Sets the value of the entegKodArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntegKodlar }
     *     
     */
    public void setEntegKodArr(ArrayOfEntegKodlar value) {
        this.entegKodArr = value;
    }

}
