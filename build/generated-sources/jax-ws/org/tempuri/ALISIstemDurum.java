
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
 *         &lt;element name="VENUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VENPASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAKIPNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORNEKNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TCKIMLIKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOSYANO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "venuser",
    "venpass",
    "takipno",
    "ornekno",
    "tckimlikno",
    "dosyano"
})
@XmlRootElement(name = "ALISIstemDurum")
public class ALISIstemDurum {

    @XmlElement(name = "VENUSER")
    protected String venuser;
    @XmlElement(name = "VENPASS")
    protected String venpass;
    @XmlElement(name = "TAKIPNO")
    protected String takipno;
    @XmlElement(name = "ORNEKNO")
    protected int ornekno;
    @XmlElement(name = "TCKIMLIKNO")
    protected String tckimlikno;
    @XmlElement(name = "DOSYANO")
    protected String dosyano;

    /**
     * Gets the value of the venuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENUSER() {
        return venuser;
    }

    /**
     * Sets the value of the venuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENUSER(String value) {
        this.venuser = value;
    }

    /**
     * Gets the value of the venpass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENPASS() {
        return venpass;
    }

    /**
     * Sets the value of the venpass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENPASS(String value) {
        this.venpass = value;
    }

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
     * Gets the value of the tckimlikno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCKIMLIKNO() {
        return tckimlikno;
    }

    /**
     * Sets the value of the tckimlikno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCKIMLIKNO(String value) {
        this.tckimlikno = value;
    }

    /**
     * Gets the value of the dosyano property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOSYANO() {
        return dosyano;
    }

    /**
     * Sets the value of the dosyano property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOSYANO(String value) {
        this.dosyano = value;
    }

}
