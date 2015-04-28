
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEntegKodlar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEntegKodlar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntegKodlar" type="{http://tempuri.org/}EntegKodlar" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntegKodlar", propOrder = {
    "entegKodlar"
})
public class ArrayOfEntegKodlar {

    @XmlElement(name = "EntegKodlar", nillable = true)
    protected List<EntegKodlar> entegKodlar;

    /**
     * Gets the value of the entegKodlar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entegKodlar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntegKodlar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntegKodlar }
     * 
     * 
     */
    public List<EntegKodlar> getEntegKodlar() {
        if (entegKodlar == null) {
            entegKodlar = new ArrayList<EntegKodlar>();
        }
        return this.entegKodlar;
    }

}
