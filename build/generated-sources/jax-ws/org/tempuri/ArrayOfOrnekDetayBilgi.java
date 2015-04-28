
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrnekDetayBilgi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrnekDetayBilgi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrnekDetayBilgi" type="{http://tempuri.org/}OrnekDetayBilgi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrnekDetayBilgi", propOrder = {
    "ornekDetayBilgi"
})
public class ArrayOfOrnekDetayBilgi {

    @XmlElement(name = "OrnekDetayBilgi", nillable = true)
    protected List<OrnekDetayBilgi> ornekDetayBilgi;

    /**
     * Gets the value of the ornekDetayBilgi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ornekDetayBilgi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrnekDetayBilgi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrnekDetayBilgi }
     * 
     * 
     */
    public List<OrnekDetayBilgi> getOrnekDetayBilgi() {
        if (ornekDetayBilgi == null) {
            ornekDetayBilgi = new ArrayList<OrnekDetayBilgi>();
        }
        return this.ornekDetayBilgi;
    }

}
