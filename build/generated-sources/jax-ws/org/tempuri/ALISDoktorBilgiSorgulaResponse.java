
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
 *         &lt;element name="ALISDoktorBilgiSorgulaResult" type="{http://tempuri.org/}DoktorBilgi" minOccurs="0"/>
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
    "alisDoktorBilgiSorgulaResult"
})
@XmlRootElement(name = "ALISDoktorBilgiSorgulaResponse")
public class ALISDoktorBilgiSorgulaResponse {

    @XmlElement(name = "ALISDoktorBilgiSorgulaResult")
    protected DoktorBilgi alisDoktorBilgiSorgulaResult;

    /**
     * Gets the value of the alisDoktorBilgiSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link DoktorBilgi }
     *     
     */
    public DoktorBilgi getALISDoktorBilgiSorgulaResult() {
        return alisDoktorBilgiSorgulaResult;
    }

    /**
     * Sets the value of the alisDoktorBilgiSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoktorBilgi }
     *     
     */
    public void setALISDoktorBilgiSorgulaResult(DoktorBilgi value) {
        this.alisDoktorBilgiSorgulaResult = value;
    }

}
