
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
 *         &lt;element name="ALISTalesemiKayitEkleResult" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
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
    "alisTalesemiKayitEkleResult"
})
@XmlRootElement(name = "ALISTalesemiKayitEkleResponse")
public class ALISTalesemiKayitEkleResponse {

    @XmlElement(name = "ALISTalesemiKayitEkleResult")
    protected IslemSonuc alisTalesemiKayitEkleResult;

    /**
     * Gets the value of the alisTalesemiKayitEkleResult property.
     * 
     * @return
     *     possible object is
     *     {@link IslemSonuc }
     *     
     */
    public IslemSonuc getALISTalesemiKayitEkleResult() {
        return alisTalesemiKayitEkleResult;
    }

    /**
     * Sets the value of the alisTalesemiKayitEkleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IslemSonuc }
     *     
     */
    public void setALISTalesemiKayitEkleResult(IslemSonuc value) {
        this.alisTalesemiKayitEkleResult = value;
    }

}
