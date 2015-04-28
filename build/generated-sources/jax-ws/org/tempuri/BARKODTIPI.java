
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BARKOD_TIPI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BARKOD_TIPI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="YOK"/>
 *     &lt;enumeration value="CODE_39"/>
 *     &lt;enumeration value="INT_2OF5"/>
 *     &lt;enumeration value="CODE_128"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BARKOD_TIPI")
@XmlEnum
public enum BARKODTIPI {

    YOK("YOK"),
    CODE_39("CODE_39"),
    @XmlEnumValue("INT_2OF5")
    INT_2_OF_5("INT_2OF5"),
    CODE_128("CODE_128");
    private final String value;

    BARKODTIPI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BARKODTIPI fromValue(String v) {
        for (BARKODTIPI c: BARKODTIPI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
