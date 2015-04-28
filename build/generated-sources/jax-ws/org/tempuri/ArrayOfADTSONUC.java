
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfADTSONUC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfADTSONUC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADTSONUC" type="{http://tempuri.org/}ADTSONUC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfADTSONUC", propOrder = {
    "adtsonuc"
})
public class ArrayOfADTSONUC {

    @XmlElement(name = "ADTSONUC", nillable = true)
    protected List<ADTSONUC> adtsonuc;

    /**
     * Gets the value of the adtsonuc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adtsonuc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADTSONUC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADTSONUC }
     * 
     * 
     */
    public List<ADTSONUC> getADTSONUC() {
        if (adtsonuc == null) {
            adtsonuc = new ArrayList<ADTSONUC>();
        }
        return this.adtsonuc;
    }

}
