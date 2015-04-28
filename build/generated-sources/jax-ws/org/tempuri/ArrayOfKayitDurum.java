
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKayitDurum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKayitDurum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KayitDurum" type="{http://tempuri.org/}KayitDurum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKayitDurum", propOrder = {
    "kayitDurum"
})
public class ArrayOfKayitDurum {

    @XmlElement(name = "KayitDurum", nillable = true)
    protected List<KayitDurum> kayitDurum;

    /**
     * Gets the value of the kayitDurum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kayitDurum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKayitDurum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KayitDurum }
     * 
     * 
     */
    public List<KayitDurum> getKayitDurum() {
        if (kayitDurum == null) {
            kayitDurum = new ArrayList<KayitDurum>();
        }
        return this.kayitDurum;
    }

}
