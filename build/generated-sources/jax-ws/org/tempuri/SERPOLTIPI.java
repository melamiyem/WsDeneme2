
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SERPOL_TIPI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SERPOL_TIPI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POLIKLINIK"/>
 *     &lt;enumeration value="SERVIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SERPOL_TIPI")
@XmlEnum
public enum SERPOLTIPI {

    POLIKLINIK,
    SERVIS;

    public String value() {
        return name();
    }

    public static SERPOLTIPI fromValue(String v) {
        return valueOf(v);
    }

}
