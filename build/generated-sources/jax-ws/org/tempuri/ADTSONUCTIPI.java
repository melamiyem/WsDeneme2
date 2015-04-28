
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADTSONUC_TIPI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ADTSONUC_TIPI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEST_YOK"/>
 *     &lt;enumeration value="DUYARLI"/>
 *     &lt;enumeration value="ORTA_DUYARLI"/>
 *     &lt;enumeration value="DIRENCLI"/>
 *     &lt;enumeration value="DIGER"/>
 *     &lt;enumeration value="AZ_DUYARLI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ADTSONUC_TIPI")
@XmlEnum
public enum ADTSONUCTIPI {

    TEST_YOK,
    DUYARLI,
    ORTA_DUYARLI,
    DIRENCLI,
    DIGER,
    AZ_DUYARLI;

    public String value() {
        return name();
    }

    public static ADTSONUCTIPI fromValue(String v) {
        return valueOf(v);
    }

}
