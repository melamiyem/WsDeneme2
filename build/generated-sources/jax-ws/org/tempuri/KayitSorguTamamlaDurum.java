
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KayitSorguTamamlaDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KayitSorguTamamlaDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RES" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HATA_MESAJI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KAYIT_SORGU_ARR" type="{http://tempuri.org/}ArrayOfKayitSorguTamamla" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KayitSorguTamamlaDurum", propOrder = {
    "res",
    "hatamesaji",
    "kayitsorguarr"
})
public class KayitSorguTamamlaDurum {

    @XmlElement(name = "RES")
    protected int res;
    @XmlElement(name = "HATA_MESAJI")
    protected String hatamesaji;
    @XmlElement(name = "KAYIT_SORGU_ARR")
    protected ArrayOfKayitSorguTamamla kayitsorguarr;

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

    /**
     * Gets the value of the kayitsorguarr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKayitSorguTamamla }
     *     
     */
    public ArrayOfKayitSorguTamamla getKAYITSORGUARR() {
        return kayitsorguarr;
    }

    /**
     * Sets the value of the kayitsorguarr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKayitSorguTamamla }
     *     
     */
    public void setKAYITSORGUARR(ArrayOfKayitSorguTamamla value) {
        this.kayitsorguarr = value;
    }

}
