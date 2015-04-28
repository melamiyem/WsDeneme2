
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
 *         &lt;element name="ALISBarkodTanimResult" type="{http://tempuri.org/}BarkodTanim" minOccurs="0"/>
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
    "alisBarkodTanimResult"
})
@XmlRootElement(name = "ALISBarkodTanimResponse")
public class ALISBarkodTanimResponse {

    @XmlElement(name = "ALISBarkodTanimResult")
    protected BarkodTanim alisBarkodTanimResult;

    /**
     * Gets the value of the alisBarkodTanimResult property.
     * 
     * @return
     *     possible object is
     *     {@link BarkodTanim }
     *     
     */
    public BarkodTanim getALISBarkodTanimResult() {
        return alisBarkodTanimResult;
    }

    /**
     * Sets the value of the alisBarkodTanimResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarkodTanim }
     *     
     */
    public void setALISBarkodTanimResult(BarkodTanim value) {
        this.alisBarkodTanimResult = value;
    }

}
