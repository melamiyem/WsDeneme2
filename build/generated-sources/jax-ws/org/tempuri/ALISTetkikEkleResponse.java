
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
 *         &lt;element name="ALISTetkikEkleResult" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
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
    "alisTetkikEkleResult"
})
@XmlRootElement(name = "ALISTetkikEkleResponse")
public class ALISTetkikEkleResponse {

    @XmlElement(name = "ALISTetkikEkleResult")
    protected IslemSonuc alisTetkikEkleResult;

    /**
     * Gets the value of the alisTetkikEkleResult property.
     * 
     * @return
     *     possible object is
     *     {@link IslemSonuc }
     *     
     */
    public IslemSonuc getALISTetkikEkleResult() {
        return alisTetkikEkleResult;
    }

    /**
     * Sets the value of the alisTetkikEkleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IslemSonuc }
     *     
     */
    public void setALISTetkikEkleResult(IslemSonuc value) {
        this.alisTetkikEkleResult = value;
    }

}
