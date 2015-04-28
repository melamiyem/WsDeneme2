
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
 *         &lt;element name="ALISBarkodBilgiResult" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
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
    "alisBarkodBilgiResult"
})
@XmlRootElement(name = "ALISBarkodBilgiResponse")
public class ALISBarkodBilgiResponse {

    @XmlElement(name = "ALISBarkodBilgiResult")
    protected IslemSonuc alisBarkodBilgiResult;

    /**
     * Gets the value of the alisBarkodBilgiResult property.
     * 
     * @return
     *     possible object is
     *     {@link IslemSonuc }
     *     
     */
    public IslemSonuc getALISBarkodBilgiResult() {
        return alisBarkodBilgiResult;
    }

    /**
     * Sets the value of the alisBarkodBilgiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IslemSonuc }
     *     
     */
    public void setALISBarkodBilgiResult(IslemSonuc value) {
        this.alisBarkodBilgiResult = value;
    }

}
