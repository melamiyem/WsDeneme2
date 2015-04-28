
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrnekDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrnekDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="islemSonuc" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
 *         &lt;element name="ORNEKNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TUMUBOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TUMUDOLU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TUMUONAYLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TUMUBASILMIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrnekDurum", propOrder = {
    "islemSonuc",
    "ornekno",
    "tumubos",
    "tumudolu",
    "tumuonayli",
    "tumubasilmis"
})
public class OrnekDurum {

    protected IslemSonuc islemSonuc;
    @XmlElement(name = "ORNEKNO")
    protected int ornekno;
    @XmlElement(name = "TUMUBOS")
    protected String tumubos;
    @XmlElement(name = "TUMUDOLU")
    protected String tumudolu;
    @XmlElement(name = "TUMUONAYLI")
    protected String tumuonayli;
    @XmlElement(name = "TUMUBASILMIS")
    protected String tumubasilmis;

    /**
     * Gets the value of the islemSonuc property.
     * 
     * @return
     *     possible object is
     *     {@link IslemSonuc }
     *     
     */
    public IslemSonuc getIslemSonuc() {
        return islemSonuc;
    }

    /**
     * Sets the value of the islemSonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IslemSonuc }
     *     
     */
    public void setIslemSonuc(IslemSonuc value) {
        this.islemSonuc = value;
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
     * Gets the value of the tumubos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTUMUBOS() {
        return tumubos;
    }

    /**
     * Sets the value of the tumubos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTUMUBOS(String value) {
        this.tumubos = value;
    }

    /**
     * Gets the value of the tumudolu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTUMUDOLU() {
        return tumudolu;
    }

    /**
     * Sets the value of the tumudolu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTUMUDOLU(String value) {
        this.tumudolu = value;
    }

    /**
     * Gets the value of the tumuonayli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTUMUONAYLI() {
        return tumuonayli;
    }

    /**
     * Sets the value of the tumuonayli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTUMUONAYLI(String value) {
        this.tumuonayli = value;
    }

    /**
     * Gets the value of the tumubasilmis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTUMUBASILMIS() {
        return tumubasilmis;
    }

    /**
     * Sets the value of the tumubasilmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTUMUBASILMIS(String value) {
        this.tumubasilmis = value;
    }

}
