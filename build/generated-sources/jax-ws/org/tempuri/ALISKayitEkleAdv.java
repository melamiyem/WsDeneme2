
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="entegRec" type="{http://tempuri.org/}EntegRec" minOccurs="0"/>
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
    "entegRec"
})
@XmlRootElement(name = "ALISKayitEkleAdv")
public class ALISKayitEkleAdv {

    protected EntegRec entegRec;

    /**
     * Gets the value of the entegRec property.
     * 
     * @return
     *     possible object is
     *     {@link EntegRec }
     *     
     */
    public EntegRec getEntegRec() {
        return entegRec;
    }

    /**
     * Sets the value of the entegRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntegRec }
     *     
     */
    public void setEntegRec(EntegRec value) {
        this.entegRec = value;
    }

}
