
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKayitSorguTamamla complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKayitSorguTamamla">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KayitSorguTamamla" type="{http://tempuri.org/}KayitSorguTamamla" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKayitSorguTamamla", propOrder = {
    "kayitSorguTamamla"
})
public class ArrayOfKayitSorguTamamla {

    @XmlElement(name = "KayitSorguTamamla", nillable = true)
    protected List<KayitSorguTamamla> kayitSorguTamamla;

    /**
     * Gets the value of the kayitSorguTamamla property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kayitSorguTamamla property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKayitSorguTamamla().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KayitSorguTamamla }
     * 
     * 
     */
    public List<KayitSorguTamamla> getKayitSorguTamamla() {
        if (kayitSorguTamamla == null) {
            kayitSorguTamamla = new ArrayList<KayitSorguTamamla>();
        }
        return this.kayitSorguTamamla;
    }

}
