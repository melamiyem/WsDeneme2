
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
 *         &lt;element name="ALISKayitSorguTamamlandiResult" type="{http://tempuri.org/}KayitSorguTamamlaDurum" minOccurs="0"/>
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
    "alisKayitSorguTamamlandiResult"
})
@XmlRootElement(name = "ALISKayitSorguTamamlandiResponse")
public class ALISKayitSorguTamamlandiResponse {

    @XmlElement(name = "ALISKayitSorguTamamlandiResult")
    protected KayitSorguTamamlaDurum alisKayitSorguTamamlandiResult;

    /**
     * Gets the value of the alisKayitSorguTamamlandiResult property.
     * 
     * @return
     *     possible object is
     *     {@link KayitSorguTamamlaDurum }
     *     
     */
    public KayitSorguTamamlaDurum getALISKayitSorguTamamlandiResult() {
        return alisKayitSorguTamamlandiResult;
    }

    /**
     * Sets the value of the alisKayitSorguTamamlandiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KayitSorguTamamlaDurum }
     *     
     */
    public void setALISKayitSorguTamamlandiResult(KayitSorguTamamlaDurum value) {
        this.alisKayitSorguTamamlandiResult = value;
    }

}
