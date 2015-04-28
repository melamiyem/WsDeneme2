
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EVET_HAYIR.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EVET_HAYIR">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HAYIR"/>
 *     &lt;enumeration value="EVET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EVET_HAYIR")
@XmlEnum
public enum EVETHAYIR {

    HAYIR,
    EVET;

    public String value() {
        return name();
    }

    public static EVETHAYIR fromValue(String v) {
        return valueOf(v);
    }

}
