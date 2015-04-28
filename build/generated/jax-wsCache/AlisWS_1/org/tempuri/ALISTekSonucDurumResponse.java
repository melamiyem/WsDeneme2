
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
 *         &lt;element name="ALISTekSonucDurumResult" type="{http://tempuri.org/}ArrayOfSonucDurum" minOccurs="0"/>
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
    "alisTekSonucDurumResult"
})
@XmlRootElement(name = "ALISTekSonucDurumResponse")
public class ALISTekSonucDurumResponse {

    @XmlElement(name = "ALISTekSonucDurumResult")
    protected ArrayOfSonucDurum alisTekSonucDurumResult;

    /**
     * Gets the value of the alisTekSonucDurumResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSonucDurum }
     *     
     */
    public ArrayOfSonucDurum getALISTekSonucDurumResult() {
        return alisTekSonucDurumResult;
    }

    /**
     * Sets the value of the alisTekSonucDurumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSonucDurum }
     *     
     */
    public void setALISTekSonucDurumResult(ArrayOfSonucDurum value) {
        this.alisTekSonucDurumResult = value;
    }

}
