
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CINSIYET_TIPI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CINSIYET_TIPI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KADIN"/>
 *     &lt;enumeration value="ERKEK"/>
 *     &lt;enumeration value="BILINMIYOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CINSIYET_TIPI")
@XmlEnum
public enum CINSIYETTIPI {

    KADIN,
    ERKEK,
    BILINMIYOR;

    public String value() {
        return name();
    }

    public static CINSIYETTIPI fromValue(String v) {
        return valueOf(v);
    }

}
