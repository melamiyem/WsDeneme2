
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KayitSorguTamamla complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KayitSorguTamamla">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORNEKNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KONTROL_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RES" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HATA_MESAJI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KayitSorguTamamla", propOrder = {
    "ornekno",
    "kontrolkodu",
    "res",
    "hatamesaji"
})
public class KayitSorguTamamla {

    @XmlElement(name = "ORNEKNO")
    protected int ornekno;
    @XmlElement(name = "KONTROL_KODU")
    protected String kontrolkodu;
    @XmlElement(name = "RES")
    protected int res;
    @XmlElement(name = "HATA_MESAJI")
    protected String hatamesaji;

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
     * Gets the value of the kontrolkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKONTROLKODU() {
        return kontrolkodu;
    }

    /**
     * Sets the value of the kontrolkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKONTROLKODU(String value) {
        this.kontrolkodu = value;
    }

    /**
     * Gets the value of the res property.
     * 
     */
    public int getRES() {
        return res;
    }

    /**
     * Sets the value of the res property.
     * 
     */
    public void setRES(int value) {
        this.res = value;
    }

    /**
     * Gets the value of the hatamesaji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHATAMESAJI() {
        return hatamesaji;
    }

    /**
     * Sets the value of the hatamesaji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHATAMESAJI(String value) {
        this.hatamesaji = value;
    }

}
