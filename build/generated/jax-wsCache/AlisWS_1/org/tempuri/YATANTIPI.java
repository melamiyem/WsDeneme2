
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YATAN_TIPI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YATAN_TIPI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AYAKTAN"/>
 *     &lt;enumeration value="YATAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YATAN_TIPI")
@XmlEnum
public enum YATANTIPI {

    AYAKTAN,
    YATAN;

    public String value() {
        return name();
    }

    public static YATANTIPI fromValue(String v) {
        return valueOf(v);
    }

}
