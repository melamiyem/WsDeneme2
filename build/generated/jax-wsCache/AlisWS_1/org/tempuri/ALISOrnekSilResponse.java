
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
 *         &lt;element name="ALISOrnekSilResult" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
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
    "alisOrnekSilResult"
})
@XmlRootElement(name = "ALISOrnekSilResponse")
public class ALISOrnekSilResponse {

    @XmlElement(name = "ALISOrnekSilResult")
    protected IslemSonuc alisOrnekSilResult;

    /**
     * Gets the value of the alisOrnekSilResult property.
     * 
     * @return
     *     possible object is
     *     {@link IslemSonuc }
     *     
     */
    public IslemSonuc getALISOrnekSilResult() {
        return alisOrnekSilResult;
    }

    /**
     * Sets the value of the alisOrnekSilResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IslemSonuc }
     *     
     */
    public void setALISOrnekSilResult(IslemSonuc value) {
        this.alisOrnekSilResult = value;
    }

}
