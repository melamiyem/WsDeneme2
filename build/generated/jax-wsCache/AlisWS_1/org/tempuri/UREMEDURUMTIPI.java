
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UREME_DURUM_TIPI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UREME_DURUM_TIPI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UREME_YOK"/>
 *     &lt;enumeration value="UREME_VAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UREME_DURUM_TIPI")
@XmlEnum
public enum UREMEDURUMTIPI {

    UREME_YOK,
    UREME_VAR;

    public String value() {
        return name();
    }

    public static UREMEDURUMTIPI fromValue(String v) {
        return valueOf(v);
    }

}
