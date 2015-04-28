
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Istem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Istem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TAKIPNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORNEKNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TETKIK_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TETKIK_KODU2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Istem", propOrder = {
    "takipno",
    "ornekno",
    "tetkikkodu",
    "tetkikkodu2"
})
public class Istem {

    @XmlElement(name = "TAKIPNO")
    protected String takipno;
    @XmlElement(name = "ORNEKNO")
    protected int ornekno;
    @XmlElement(name = "TETKIK_KODU")
    protected String tetkikkodu;
    @XmlElement(name = "TETKIK_KODU2")
    protected String tetkikkodu2;

    /**
     * Gets the value of the takipno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAKIPNO() {
        return takipno;
    }

    /**
     * Sets the value of the takipno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAKIPNO(String value) {
        this.takipno = value;
    }

    /**
     * Gets the value of the ornekno property.
     * 
     */
    public int getORNEKNO() {
        return ornekno;
    }

    /**
     * Sets the value of the ornekno property.
     * 
     */
    public void setORNEKNO(int value) {
        this.ornekno = value;
    }

    /**
     * Gets the value of the tetkikkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTETKIKKODU() {
        return tetkikkodu;
    }

    /**
     * Sets the value of the tetkikkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTETKIKKODU(String value) {
        this.tetkikkodu = value;
    }

    /**
     * Gets the value of the tetkikkodu2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTETKIKKODU2() {
        return tetkikkodu2;
    }

    /**
     * Sets the value of the tetkikkodu2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTETKIKKODU2(String value) {
        this.tetkikkodu2 = value;
    }

}
