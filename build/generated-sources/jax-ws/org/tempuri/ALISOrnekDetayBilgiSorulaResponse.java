
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
 *         &lt;element name="ALISOrnekDetayBilgiSorulaResult" type="{http://tempuri.org/}ArrayOfOrnekDetayBilgi" minOccurs="0"/>
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
    "alisOrnekDetayBilgiSorulaResult"
})
@XmlRootElement(name = "ALISOrnekDetayBilgiSorulaResponse")
public class ALISOrnekDetayBilgiSorulaResponse {

    @XmlElement(name = "ALISOrnekDetayBilgiSorulaResult")
    protected ArrayOfOrnekDetayBilgi alisOrnekDetayBilgiSorulaResult;

    /**
     * Gets the value of the alisOrnekDetayBilgiSorulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrnekDetayBilgi }
     *     
     */
    public ArrayOfOrnekDetayBilgi getALISOrnekDetayBilgiSorulaResult() {
        return alisOrnekDetayBilgiSorulaResult;
    }

    /**
     * Sets the value of the alisOrnekDetayBilgiSorulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrnekDetayBilgi }
     *     
     */
    public void setALISOrnekDetayBilgiSorulaResult(ArrayOfOrnekDetayBilgi value) {
        this.alisOrnekDetayBilgiSorulaResult = value;
    }

}
