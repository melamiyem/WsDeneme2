
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
 *         &lt;element name="ALISDoktorPanelResult" type="{http://tempuri.org/}PanelDurum" minOccurs="0"/>
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
    "alisDoktorPanelResult"
})
@XmlRootElement(name = "ALISDoktorPanelResponse")
public class ALISDoktorPanelResponse {

    @XmlElement(name = "ALISDoktorPanelResult")
    protected PanelDurum alisDoktorPanelResult;

    /**
     * Gets the value of the alisDoktorPanelResult property.
     * 
     * @return
     *     possible object is
     *     {@link PanelDurum }
     *     
     */
    public PanelDurum getALISDoktorPanelResult() {
        return alisDoktorPanelResult;
    }

    /**
     * Sets the value of the alisDoktorPanelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PanelDurum }
     *     
     */
    public void setALISDoktorPanelResult(PanelDurum value) {
        this.alisDoktorPanelResult = value;
    }

}
