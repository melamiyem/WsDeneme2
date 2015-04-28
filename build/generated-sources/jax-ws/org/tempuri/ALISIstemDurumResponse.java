
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
 *         &lt;element name="ALISIstemDurumResult" type="{http://tempuri.org/}IstemDurum" minOccurs="0"/>
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
    "alisIstemDurumResult"
})
@XmlRootElement(name = "ALISIstemDurumResponse")
public class ALISIstemDurumResponse {

    @XmlElement(name = "ALISIstemDurumResult")
    protected IstemDurum alisIstemDurumResult;

    /**
     * Gets the value of the alisIstemDurumResult property.
     * 
     * @return
     *     possible object is
     *     {@link IstemDurum }
     *     
     */
    public IstemDurum getALISIstemDurumResult() {
        return alisIstemDurumResult;
    }

    /**
     * Sets the value of the alisIstemDurumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IstemDurum }
     *     
     */
    public void setALISIstemDurumResult(IstemDurum value) {
        this.alisIstemDurumResult = value;
    }

}
