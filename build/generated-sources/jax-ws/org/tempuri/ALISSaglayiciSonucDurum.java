
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
 *         &lt;element name="SERVISGRUP_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KURUMGRUP_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOKTORGRUP_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BASTAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BITTAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TESTLER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "servisgrupkodu",
    "kurumgrupkodu",
    "doktorgrupkodu",
    "bastar",
    "bittar",
    "testler"
})
@XmlRootElement(name = "ALISSaglayiciSonucDurum")
public class ALISSaglayiciSonucDurum {

    @XmlElement(name = "VENUSER")
    protected String venuser;
    @XmlElement(name = "VENPASS")
    protected String venpass;
    @XmlElement(name = "SERVISGRUP_KODU")
    protected String servisgrupkodu;
    @XmlElement(name = "KURUMGRUP_KODU")
    protected String kurumgrupkodu;
    @XmlElement(name = "DOKTORGRUP_KODU")
    protected String doktorgrupkodu;
    @XmlElement(name = "BASTAR")
    protected String bastar;
    @XmlElement(name = "BITTAR")
    protected String bittar;
    @XmlElement(name = "TESTLER")
    protected String testler;

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
     * Gets the value of the servisgrupkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVISGRUPKODU() {
        return servisgrupkodu;
    }

    /**
     * Sets the value of the servisgrupkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVISGRUPKODU(String value) {
        this.servisgrupkodu = value;
    }

    /**
     * Gets the value of the kurumgrupkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKURUMGRUPKODU() {
        return kurumgrupkodu;
    }

    /**
     * Sets the value of the kurumgrupkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKURUMGRUPKODU(String value) {
        this.kurumgrupkodu = value;
    }

    /**
     * Gets the value of the doktorgrupkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOKTORGRUPKODU() {
        return doktorgrupkodu;
    }

    /**
     * Sets the value of the doktorgrupkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOKTORGRUPKODU(String value) {
        this.doktorgrupkodu = value;
    }

    /**
     * Gets the value of the bastar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASTAR() {
        return bastar;
    }

    /**
     * Sets the value of the bastar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASTAR(String value) {
        this.bastar = value;
    }

    /**
     * Gets the value of the bittar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBITTAR() {
        return bittar;
    }

    /**
     * Sets the value of the bittar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBITTAR(String value) {
        this.bittar = value;
    }

    /**
     * Gets the value of the testler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTESTLER() {
        return testler;
    }

    /**
     * Sets the value of the testler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTESTLER(String value) {
        this.testler = value;
    }

}
