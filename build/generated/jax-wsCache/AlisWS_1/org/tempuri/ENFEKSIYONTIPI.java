
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ENFEKSIYON_TIPI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ENFEKSIYON_TIPI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENFEKSIYON_YOK"/>
 *     &lt;enumeration value="OLASI_ENFEKSIYON"/>
 *     &lt;enumeration value="KESIN_ENFEKSIYON"/>
 *     &lt;enumeration value="HASTANE_ENFEKSIYON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ENFEKSIYON_TIPI")
@XmlEnum
public enum ENFEKSIYONTIPI {

    ENFEKSIYON_YOK,
    OLASI_ENFEKSIYON,
    KESIN_ENFEKSIYON,
    HASTANE_ENFEKSIYON;

    public String value() {
        return name();
    }

    public static ENFEKSIYONTIPI fromValue(String v) {
        return valueOf(v);
    }

}
