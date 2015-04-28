
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IstemDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IstemDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="islemSonuc" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
 *         &lt;element name="IstemArr" type="{http://tempuri.org/}ArrayOfIstem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IstemDurum", propOrder = {
    "islemSonuc",
    "istemArr"
})
public class IstemDurum {

    protected IslemSonuc islemSonuc;
    @XmlElement(name = "IstemArr")
    protected ArrayOfIstem istemArr;

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
     * Gets the value of the istemArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIstem }
     *     
     */
    public ArrayOfIstem getIstemArr() {
        return istemArr;
    }

    /**
     * Sets the value of the istemArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIstem }
     *     
     */
    public void setIstemArr(ArrayOfIstem value) {
        this.istemArr = value;
    }

}
