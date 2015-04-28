
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PanelDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanelDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="islemSonuc" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
 *         &lt;element name="PanelArr" type="{http://tempuri.org/}ArrayOfPANEL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanelDurum", propOrder = {
    "islemSonuc",
    "panelArr"
})
public class PanelDurum {

    protected IslemSonuc islemSonuc;
    @XmlElement(name = "PanelArr")
    protected ArrayOfPANEL panelArr;

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
     * Gets the value of the panelArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPANEL }
     *     
     */
    public ArrayOfPANEL getPanelArr() {
        return panelArr;
    }

    /**
     * Sets the value of the panelArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPANEL }
     *     
     */
    public void setPanelArr(ArrayOfPANEL value) {
        this.panelArr = value;
    }

}
