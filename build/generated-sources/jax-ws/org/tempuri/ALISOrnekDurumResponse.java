
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
 *         &lt;element name="ALISOrnekDurumResult" type="{http://tempuri.org/}OrnekDurum" minOccurs="0"/>
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
    "alisOrnekDurumResult"
})
@XmlRootElement(name = "ALISOrnekDurumResponse")
public class ALISOrnekDurumResponse {

    @XmlElement(name = "ALISOrnekDurumResult")
    protected OrnekDurum alisOrnekDurumResult;

    /**
     * Gets the value of the alisOrnekDurumResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrnekDurum }
     *     
     */
    public OrnekDurum getALISOrnekDurumResult() {
        return alisOrnekDurumResult;
    }

    /**
     * Sets the value of the alisOrnekDurumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrnekDurum }
     *     
     */
    public void setALISOrnekDurumResult(OrnekDurum value) {
        this.alisOrnekDurumResult = value;
    }

}
