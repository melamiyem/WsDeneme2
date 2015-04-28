
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IslemSonuc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IslemSonuc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Res" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrnekNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HataMesaji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UyarıMesaji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TetkikArr" type="{http://tempuri.org/}ArrayOfTetkik" minOccurs="0"/>
 *         &lt;element name="BarkodInfoArr" type="{http://tempuri.org/}ArrayOfBarkodInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IslemSonuc", propOrder = {
    "res",
    "ornekNo",
    "hataMesaji",
    "uyar\u0131Mesaji",
    "tetkikArr",
    "barkodInfoArr"
})
public class IslemSonuc {

    @XmlElement(name = "Res")
    protected int res;
    @XmlElement(name = "OrnekNo")
    protected int ornekNo;
    @XmlElement(name = "HataMesaji")
    protected String hataMesaji;
    @XmlElement(name = "Uyar\u0131Mesaji")
    protected String uyarıMesaji;
    @XmlElement(name = "TetkikArr")
    protected ArrayOfTetkik tetkikArr;
    @XmlElement(name = "BarkodInfoArr")
    protected ArrayOfBarkodInfo barkodInfoArr;

    /**
     * Gets the value of the res property.
     * 
     */
    public int getRes() {
        return res;
    }

    /**
     * Sets the value of the res property.
     * 
     */
    public void setRes(int value) {
        this.res = value;
    }

    /**
     * Gets the value of the ornekNo property.
     * 
     */
    public int getOrnekNo() {
        return ornekNo;
    }

    /**
     * Sets the value of the ornekNo property.
     * 
     */
    public void setOrnekNo(int value) {
        this.ornekNo = value;
    }

    /**
     * Gets the value of the hataMesaji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHataMesaji() {
        return hataMesaji;
    }

    /**
     * Sets the value of the hataMesaji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHataMesaji(String value) {
        this.hataMesaji = value;
    }

    /**
     * Gets the value of the uyarıMesaji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUyarıMesaji() {
        return uyarıMesaji;
    }

    /**
     * Sets the value of the uyarıMesaji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUyarıMesaji(String value) {
        this.uyarıMesaji = value;
    }

    /**
     * Gets the value of the tetkikArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTetkik }
     *     
     */
    public ArrayOfTetkik getTetkikArr() {
        return tetkikArr;
    }

    /**
     * Sets the value of the tetkikArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTetkik }
     *     
     */
    public void setTetkikArr(ArrayOfTetkik value) {
        this.tetkikArr = value;
    }

    /**
     * Gets the value of the barkodInfoArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBarkodInfo }
     *     
     */
    public ArrayOfBarkodInfo getBarkodInfoArr() {
        return barkodInfoArr;
    }

    /**
     * Sets the value of the barkodInfoArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBarkodInfo }
     *     
     */
    public void setBarkodInfoArr(ArrayOfBarkodInfo value) {
        this.barkodInfoArr = value;
    }

}
