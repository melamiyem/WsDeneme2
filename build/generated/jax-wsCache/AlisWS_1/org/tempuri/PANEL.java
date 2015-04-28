
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PANEL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANEL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PANEL_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PanelTestArr" type="{http://tempuri.org/}ArrayOfEntegKodlar" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PANEL", propOrder = {
    "paneladi",
    "panelTestArr"
})
public class PANEL {

    @XmlElement(name = "PANEL_ADI")
    protected String paneladi;
    @XmlElement(name = "PanelTestArr")
    protected ArrayOfEntegKodlar panelTestArr;

    /**
     * Gets the value of the paneladi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANELADI() {
        return paneladi;
    }

    /**
     * Sets the value of the paneladi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANELADI(String value) {
        this.paneladi = value;
    }

    /**
     * Gets the value of the panelTestArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntegKodlar }
     *     
     */
    public ArrayOfEntegKodlar getPanelTestArr() {
        return panelTestArr;
    }

    /**
     * Sets the value of the panelTestArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntegKodlar }
     *     
     */
    public void setPanelTestArr(ArrayOfEntegKodlar value) {
        this.panelTestArr = value;
    }

}
