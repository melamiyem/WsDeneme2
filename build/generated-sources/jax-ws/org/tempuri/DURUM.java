
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DURUM.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DURUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LABORATUVARA_BEKLENIYOR"/>
 *     &lt;enumeration value="KAN_ALINDI"/>
 *     &lt;enumeration value="KABUL_EDILDI"/>
 *     &lt;enumeration value="REDDEDILDI"/>
 *     &lt;enumeration value="CIHAZA_GONDERILDI"/>
 *     &lt;enumeration value="SONUC_DOLU_ONAY_BEKLENIYOR"/>
 *     &lt;enumeration value="ONAYLANDI"/>
 *     &lt;enumeration value="RAPORLANDI"/>
 *     &lt;enumeration value="DURUM_BULUNAMADI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DURUM")
@XmlEnum
public enum DURUM {

    LABORATUVARA_BEKLENIYOR,
    KAN_ALINDI,
    KABUL_EDILDI,
    REDDEDILDI,
    CIHAZA_GONDERILDI,
    SONUC_DOLU_ONAY_BEKLENIYOR,
    ONAYLANDI,
    RAPORLANDI,
    DURUM_BULUNAMADI;

    public String value() {
        return name();
    }

    public static DURUM fromValue(String v) {
        return valueOf(v);
    }

}
