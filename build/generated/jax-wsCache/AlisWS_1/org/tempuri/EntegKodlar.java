
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntegKodlar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntegKodlar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TEST_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TEST_KISA_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEST_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENTEG_KODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENTEG_KODU2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNITE_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UNITE_ADI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntegKodlar", propOrder = {
    "testid",
    "testkisaadi",
    "testadi",
    "entegkodu",
    "entegkodu2",
    "uniteid",
    "uniteadi"
})
public class EntegKodlar {

    @XmlElement(name = "TEST_ID")
    protected int testid;
    @XmlElement(name = "TEST_KISA_ADI")
    protected String testkisaadi;
    @XmlElement(name = "TEST_ADI")
    protected String testadi;
    @XmlElement(name = "ENTEG_KODU")
    protected String entegkodu;
    @XmlElement(name = "ENTEG_KODU2")
    protected String entegkodu2;
    @XmlElement(name = "UNITE_ID")
    protected int uniteid;
    @XmlElement(name = "UNITE_ADI")
    protected String uniteadi;

    /**
     * Gets the value of the testid property.
     * 
     */
    public int getTESTID() {
        return testid;
    }

    /**
     * Sets the value of the testid property.
     * 
     */
    public void setTESTID(int value) {
        this.testid = value;
    }

    /**
     * Gets the value of the testkisaadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTESTKISAADI() {
        return testkisaadi;
    }

    /**
     * Sets the value of the testkisaadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTESTKISAADI(String value) {
        this.testkisaadi = value;
    }

    /**
     * Gets the value of the testadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTESTADI() {
        return testadi;
    }

    /**
     * Sets the value of the testadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTESTADI(String value) {
        this.testadi = value;
    }

    /**
     * Gets the value of the entegkodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTEGKODU() {
        return entegkodu;
    }

    /**
     * Sets the value of the entegkodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTEGKODU(String value) {
        this.entegkodu = value;
    }

    /**
     * Gets the value of the entegkodu2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTEGKODU2() {
        return entegkodu2;
    }

    /**
     * Sets the value of the entegkodu2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTEGKODU2(String value) {
        this.entegkodu2 = value;
    }

    /**
     * Gets the value of the uniteid property.
     * 
     */
    public int getUNITEID() {
        return uniteid;
    }

    /**
     * Sets the value of the uniteid property.
     * 
     */
    public void setUNITEID(int value) {
        this.uniteid = value;
    }

    /**
     * Gets the value of the uniteadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITEADI() {
        return uniteadi;
    }

    /**
     * Sets the value of the uniteadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITEADI(String value) {
        this.uniteadi = value;
    }

}
