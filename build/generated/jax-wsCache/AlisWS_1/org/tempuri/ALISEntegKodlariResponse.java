
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
 *         &lt;element name="ALISEntegKodlariResult" type="{http://tempuri.org/}EntegKodDurum" minOccurs="0"/>
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
    "alisEntegKodlariResult"
})
@XmlRootElement(name = "ALISEntegKodlariResponse")
public class ALISEntegKodlariResponse {

    @XmlElement(name = "ALISEntegKodlariResult")
    protected EntegKodDurum alisEntegKodlariResult;

    /**
     * Gets the value of the alisEntegKodlariResult property.
     * 
     * @return
     *     possible object is
     *     {@link EntegKodDurum }
     *     
     */
    public EntegKodDurum getALISEntegKodlariResult() {
        return alisEntegKodlariResult;
    }

    /**
     * Sets the value of the alisEntegKodlariResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntegKodDurum }
     *     
     */
    public void setALISEntegKodlariResult(EntegKodDurum value) {
        this.alisEntegKodlariResult = value;
    }

}
