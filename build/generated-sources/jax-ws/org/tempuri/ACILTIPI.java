
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACIL_TIPI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ACIL_TIPI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACIL"/>
 *     &lt;enumeration value="RUTIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ACIL_TIPI")
@XmlEnum
public enum ACILTIPI {

    ACIL,
    RUTIN;

    public String value() {
        return name();
    }

    public static ACILTIPI fromValue(String v) {
        return valueOf(v);
    }

}
