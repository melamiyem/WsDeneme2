
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
 *         &lt;element name="ALISOrnekKayitSorgulaResult" type="{http://tempuri.org/}OrnekKayitSorgulaDurum" minOccurs="0"/>
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
    "alisOrnekKayitSorgulaResult"
})
@XmlRootElement(name = "ALISOrnekKayitSorgulaResponse")
public class ALISOrnekKayitSorgulaResponse {

    @XmlElement(name = "ALISOrnekKayitSorgulaResult")
    protected OrnekKayitSorgulaDurum alisOrnekKayitSorgulaResult;

    /**
     * Gets the value of the alisOrnekKayitSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrnekKayitSorgulaDurum }
     *     
     */
    public OrnekKayitSorgulaDurum getALISOrnekKayitSorgulaResult() {
        return alisOrnekKayitSorgulaResult;
    }

    /**
     * Sets the value of the alisOrnekKayitSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrnekKayitSorgulaDurum }
     *     
     */
    public void setALISOrnekKayitSorgulaResult(OrnekKayitSorgulaDurum value) {
        this.alisOrnekKayitSorgulaResult = value;
    }

}
