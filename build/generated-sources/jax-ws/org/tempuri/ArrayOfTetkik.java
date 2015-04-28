
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTetkik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTetkik">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tetkik" type="{http://tempuri.org/}Tetkik" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTetkik", propOrder = {
    "tetkik"
})
public class ArrayOfTetkik {

    @XmlElement(name = "Tetkik", nillable = true)
    protected List<Tetkik> tetkik;

    /**
     * Gets the value of the tetkik property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tetkik property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTetkik().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tetkik }
     * 
     * 
     */
    public List<Tetkik> getTetkik() {
        if (tetkik == null) {
            tetkik = new ArrayList<Tetkik>();
        }
        return this.tetkik;
    }

}
