
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
 *         &lt;element name="ALISDiyalizSonucDurumResult" type="{http://tempuri.org/}DiyalizSonucDurum" minOccurs="0"/>
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
    "alisDiyalizSonucDurumResult"
})
@XmlRootElement(name = "ALISDiyalizSonucDurumResponse")
public class ALISDiyalizSonucDurumResponse {

    @XmlElement(name = "ALISDiyalizSonucDurumResult")
    protected DiyalizSonucDurum alisDiyalizSonucDurumResult;

    /**
     * Gets the value of the alisDiyalizSonucDurumResult property.
     * 
     * @return
     *     possible object is
     *     {@link DiyalizSonucDurum }
     *     
     */
    public DiyalizSonucDurum getALISDiyalizSonucDurumResult() {
        return alisDiyalizSonucDurumResult;
    }

    /**
     * Sets the value of the alisDiyalizSonucDurumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiyalizSonucDurum }
     *     
     */
    public void setALISDiyalizSonucDurumResult(DiyalizSonucDurum value) {
        this.alisDiyalizSonucDurumResult = value;
    }

}
