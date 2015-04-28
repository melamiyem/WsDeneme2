
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfORGANIZMASONUC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfORGANIZMASONUC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ORGANIZMASONUC" type="{http://tempuri.org/}ORGANIZMASONUC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfORGANIZMASONUC", propOrder = {
    "organizmasonuc"
})
public class ArrayOfORGANIZMASONUC {

    @XmlElement(name = "ORGANIZMASONUC", nillable = true)
    protected List<ORGANIZMASONUC> organizmasonuc;

    /**
     * Gets the value of the organizmasonuc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizmasonuc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORGANIZMASONUC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORGANIZMASONUC }
     * 
     * 
     */
    public List<ORGANIZMASONUC> getORGANIZMASONUC() {
        if (organizmasonuc == null) {
            organizmasonuc = new ArrayList<ORGANIZMASONUC>();
        }
        return this.organizmasonuc;
    }

}
