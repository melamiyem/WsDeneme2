
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SKRS_SGK.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SKRS_SGK">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SGK"/>
 *     &lt;enumeration value="SSK"/>
 *     &lt;enumeration value="BAGKUR"/>
 *     &lt;enumeration value="EMEKLI_SANDIGI"/>
 *     &lt;enumeration value="TSK"/>
 *     &lt;enumeration value="MUHASEBAT"/>
 *     &lt;enumeration value="OZEL_SIGORTA"/>
 *     &lt;enumeration value="YESILKART"/>
 *     &lt;enumeration value="DIGER"/>
 *     &lt;enumeration value="BELIRTILMEMIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SKRS_SGK")
@XmlEnum
public enum SKRSSGK {

    SGK,
    SSK,
    BAGKUR,
    EMEKLI_SANDIGI,
    TSK,
    MUHASEBAT,
    OZEL_SIGORTA,
    YESILKART,
    DIGER,
    BELIRTILMEMIS;

    public String value() {
        return name();
    }

    public static SKRSSGK fromValue(String v) {
        return valueOf(v);
    }

}
