
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BarkodTanim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BarkodTanim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TANIM_NO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TANIM_ACIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA1XKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA1YKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA2XKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA2YKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMAACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMADUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMAFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMAYATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMAYAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANGLEOFBARKOD" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B1BARCODEHEIGHT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B1BARCODEINCDECTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B1BARCODEINCDECVALUE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B1BARCODEUNDERPRINT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B1CHECKDIGITTYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B1ONEMODULEWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B2BARCODEHEIGHT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B2BARCODEINCDECTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2BARCODEINCDECVALUE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B2BARCODEUNDERPRINT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B2CHECKDIGITTYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B2CHTOCHSPACEWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B2NARROWBARWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B2NARROWSPACEWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B2STARTSTOPCODEATTACH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2SUPPRESSEDZERONO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B2WIDEBARWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B2WIDESPACEWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B3ECCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B3FORMATID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B3ONRCELLWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B4BARHEIGHT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B4NUMBEROFCOLUMNS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B4ONEMODULEWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B4SECURITYLEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B5ERRORCORRECTIONLEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B5MODESELECTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B5ONECELLWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="B6MODESELECTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B7ECCLEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B7NOOFCHARBITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B7ONRCELLWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BARCODEKOORX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BARCODEKOORY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BARCODETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BARKODNUMARASIACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BNUMDUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BARKODNUMARASIFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BARKODNUMARASIXKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BNUMYATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BARKODNUMARASIYAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BARKODNUMARASIYKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BASILACAKETIKETSAYISI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BASKIHIZI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BASKIMODU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BOUDRATE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="COMPORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DARKERLIGHTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATABIT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EFFECTIVEPRINTLENGTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EFFECTIVEPRINTWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FORWARDREVERSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KAGITKESMEARALIGI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LABELHEIGHT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LABELWIDTH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUMBEROFLABELCOL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUMBEROFLABELLINE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PAPERFEED" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PARITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PITCHLENGHTOFLABEL" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PRINTDENSITY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RIBBON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENSORTIPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA4ACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA4DUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA4FONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA4XKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA4YATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA4YAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA4YKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA3ACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA3DUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA3FONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA3XKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA3YATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA3YAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA3YKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="STOPBIT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="THERMAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA2ACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA2DUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA2FONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA2YATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA2YAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BARKOD_YAZICISI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA5ACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA5DUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA5FONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA5XKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA5YATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA5YAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA5YKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA6ACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA6DUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA6FONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA6XKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA6YATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA6YAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA6YKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA7XKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA7YKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA7FONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA7YATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA7DUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA7ACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA7YAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA8XKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA8YKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA8FONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA8YATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA8DUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA8ACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA8YAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA9XKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA9YKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA9FONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA9YATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA9DUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA9ACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA9YAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA10XKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA10YKOOR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACIKLAMA10FONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA10YATAYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA10DUSEYBUYUTME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA10ACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIKLAMA10YAZDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BARKODNOREVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIK1REVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIK2REVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIK3REVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIK4REVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIK5REVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIK6REVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIK7REVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIK8REVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIK9REVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACIK10REVFONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YAZICI_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YAZICI_PORT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BASKI_ONCESI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BASKI_SONRASI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="islemSonuc" type="{http://tempuri.org/}IslemSonuc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarkodTanim", propOrder = {
    "tanimno",
    "tanimacik",
    "aciklama1XKOOR",
    "aciklama1YKOOR",
    "aciklama2XKOOR",
    "aciklama2YKOOR",
    "aciklamaaci",
    "aciklamaduseybuyutme",
    "aciklamafont",
    "aciklamayataybuyutme",
    "aciklamayazdir",
    "angleofbarkod",
    "b1BARCODEHEIGHT",
    "b1BARCODEINCDECTYPE",
    "b1BARCODEINCDECVALUE",
    "b1BARCODEUNDERPRINT",
    "b1CHECKDIGITTYPE",
    "b1ONEMODULEWIDTH",
    "b2BARCODEHEIGHT",
    "b2BARCODEINCDECTYPE",
    "b2BARCODEINCDECVALUE",
    "b2BARCODEUNDERPRINT",
    "b2CHECKDIGITTYPE",
    "b2CHTOCHSPACEWIDTH",
    "b2NARROWBARWIDTH",
    "b2NARROWSPACEWIDTH",
    "b2STARTSTOPCODEATTACH",
    "b2SUPPRESSEDZERONO",
    "b2WIDEBARWIDTH",
    "b2WIDESPACEWIDTH",
    "b3ECCTYPE",
    "b3FORMATID",
    "b3ONRCELLWIDTH",
    "b4BARHEIGHT",
    "b4NUMBEROFCOLUMNS",
    "b4ONEMODULEWIDTH",
    "b4SECURITYLEVEL",
    "b5ERRORCORRECTIONLEVEL",
    "b5MODESELECTION",
    "b5ONECELLWIDTH",
    "b6MODESELECTION",
    "b7ECCLEVEL",
    "b7NOOFCHARBITS",
    "b7ONRCELLWIDTH",
    "barcodekoorx",
    "barcodekoory",
    "barcodetype",
    "barkodnumarasiaci",
    "bnumduseybuyutme",
    "barkodnumarasifont",
    "barkodnumarasixkoor",
    "bnumyataybuyutme",
    "barkodnumarasiyazdir",
    "barkodnumarasiykoor",
    "basilacaketiketsayisi",
    "baskihizi",
    "baskimodu",
    "boudrate",
    "comport",
    "darkerlighter",
    "databit",
    "effectiveprintlength",
    "effectiveprintwidth",
    "forwardreverse",
    "kagitkesmearaligi",
    "labelheight",
    "labelwidth",
    "numberoflabelcol",
    "numberoflabelline",
    "paperfeed",
    "parity",
    "pitchlenghtoflabel",
    "printdensity",
    "ribbon",
    "sensortipi",
    "aciklama4ACI",
    "aciklama4DUSEYBUYUTME",
    "aciklama4FONT",
    "aciklama4XKOOR",
    "aciklama4YATAYBUYUTME",
    "aciklama4YAZDIR",
    "aciklama4YKOOR",
    "aciklama3ACI",
    "aciklama3DUSEYBUYUTME",
    "aciklama3FONT",
    "aciklama3XKOOR",
    "aciklama3YATAYBUYUTME",
    "aciklama3YAZDIR",
    "aciklama3YKOOR",
    "stopbit",
    "thermal",
    "aciklama2ACI",
    "aciklama2DUSEYBUYUTME",
    "aciklama2FONT",
    "aciklama2YATAYBUYUTME",
    "aciklama2YAZDIR",
    "barkodyazicisi",
    "aciklama5ACI",
    "aciklama5DUSEYBUYUTME",
    "aciklama5FONT",
    "aciklama5XKOOR",
    "aciklama5YATAYBUYUTME",
    "aciklama5YAZDIR",
    "aciklama5YKOOR",
    "aciklama6ACI",
    "aciklama6DUSEYBUYUTME",
    "aciklama6FONT",
    "aciklama6XKOOR",
    "aciklama6YATAYBUYUTME",
    "aciklama6YAZDIR",
    "aciklama6YKOOR",
    "aciklama7XKOOR",
    "aciklama7YKOOR",
    "aciklama7FONT",
    "aciklama7YATAYBUYUTME",
    "aciklama7DUSEYBUYUTME",
    "aciklama7ACI",
    "aciklama7YAZDIR",
    "aciklama8XKOOR",
    "aciklama8YKOOR",
    "aciklama8FONT",
    "aciklama8YATAYBUYUTME",
    "aciklama8DUSEYBUYUTME",
    "aciklama8ACI",
    "aciklama8YAZDIR",
    "aciklama9XKOOR",
    "aciklama9YKOOR",
    "aciklama9FONT",
    "aciklama9YATAYBUYUTME",
    "aciklama9DUSEYBUYUTME",
    "aciklama9ACI",
    "aciklama9YAZDIR",
    "aciklama10XKOOR",
    "aciklama10YKOOR",
    "aciklama10FONT",
    "aciklama10YATAYBUYUTME",
    "aciklama10DUSEYBUYUTME",
    "aciklama10ACI",
    "aciklama10YAZDIR",
    "barkodnorevfont",
    "acik1REVFONT",
    "acik2REVFONT",
    "acik3REVFONT",
    "acik4REVFONT",
    "acik5REVFONT",
    "acik6REVFONT",
    "acik7REVFONT",
    "acik8REVFONT",
    "acik9REVFONT",
    "acik10REVFONT",
    "yaziciip",
    "yaziciport",
    "baskioncesi",
    "baskisonrasi",
    "islemSonuc"
})
public class BarkodTanim {

    @XmlElement(name = "TANIM_NO")
    protected int tanimno;
    @XmlElement(name = "TANIM_ACIK")
    protected String tanimacik;
    @XmlElement(name = "ACIKLAMA1XKOOR")
    protected int aciklama1XKOOR;
    @XmlElement(name = "ACIKLAMA1YKOOR")
    protected int aciklama1YKOOR;
    @XmlElement(name = "ACIKLAMA2XKOOR")
    protected int aciklama2XKOOR;
    @XmlElement(name = "ACIKLAMA2YKOOR")
    protected int aciklama2YKOOR;
    @XmlElement(name = "ACIKLAMAACI")
    protected String aciklamaaci;
    @XmlElement(name = "ACIKLAMADUSEYBUYUTME")
    protected String aciklamaduseybuyutme;
    @XmlElement(name = "ACIKLAMAFONT")
    protected String aciklamafont;
    @XmlElement(name = "ACIKLAMAYATAYBUYUTME")
    protected String aciklamayataybuyutme;
    @XmlElement(name = "ACIKLAMAYAZDIR")
    protected String aciklamayazdir;
    @XmlElement(name = "ANGLEOFBARKOD")
    protected int angleofbarkod;
    @XmlElement(name = "B1BARCODEHEIGHT")
    protected int b1BARCODEHEIGHT;
    @XmlElement(name = "B1BARCODEINCDECTYPE")
    protected String b1BARCODEINCDECTYPE;
    @XmlElement(name = "B1BARCODEINCDECVALUE")
    protected int b1BARCODEINCDECVALUE;
    @XmlElement(name = "B1BARCODEUNDERPRINT")
    protected int b1BARCODEUNDERPRINT;
    @XmlElement(name = "B1CHECKDIGITTYPE")
    protected int b1CHECKDIGITTYPE;
    @XmlElement(name = "B1ONEMODULEWIDTH")
    protected int b1ONEMODULEWIDTH;
    @XmlElement(name = "B2BARCODEHEIGHT")
    protected int b2BARCODEHEIGHT;
    @XmlElement(name = "B2BARCODEINCDECTYPE")
    protected String b2BARCODEINCDECTYPE;
    @XmlElement(name = "B2BARCODEINCDECVALUE")
    protected int b2BARCODEINCDECVALUE;
    @XmlElement(name = "B2BARCODEUNDERPRINT")
    protected int b2BARCODEUNDERPRINT;
    @XmlElement(name = "B2CHECKDIGITTYPE")
    protected int b2CHECKDIGITTYPE;
    @XmlElement(name = "B2CHTOCHSPACEWIDTH")
    protected int b2CHTOCHSPACEWIDTH;
    @XmlElement(name = "B2NARROWBARWIDTH")
    protected int b2NARROWBARWIDTH;
    @XmlElement(name = "B2NARROWSPACEWIDTH")
    protected int b2NARROWSPACEWIDTH;
    @XmlElement(name = "B2STARTSTOPCODEATTACH")
    protected String b2STARTSTOPCODEATTACH;
    @XmlElement(name = "B2SUPPRESSEDZERONO")
    protected int b2SUPPRESSEDZERONO;
    @XmlElement(name = "B2WIDEBARWIDTH")
    protected int b2WIDEBARWIDTH;
    @XmlElement(name = "B2WIDESPACEWIDTH")
    protected int b2WIDESPACEWIDTH;
    @XmlElement(name = "B3ECCTYPE")
    protected String b3ECCTYPE;
    @XmlElement(name = "B3FORMATID")
    protected String b3FORMATID;
    @XmlElement(name = "B3ONRCELLWIDTH")
    protected int b3ONRCELLWIDTH;
    @XmlElement(name = "B4BARHEIGHT")
    protected int b4BARHEIGHT;
    @XmlElement(name = "B4NUMBEROFCOLUMNS")
    protected int b4NUMBEROFCOLUMNS;
    @XmlElement(name = "B4ONEMODULEWIDTH")
    protected int b4ONEMODULEWIDTH;
    @XmlElement(name = "B4SECURITYLEVEL")
    protected String b4SECURITYLEVEL;
    @XmlElement(name = "B5ERRORCORRECTIONLEVEL")
    protected String b5ERRORCORRECTIONLEVEL;
    @XmlElement(name = "B5MODESELECTION")
    protected String b5MODESELECTION;
    @XmlElement(name = "B5ONECELLWIDTH")
    protected int b5ONECELLWIDTH;
    @XmlElement(name = "B6MODESELECTION")
    protected String b6MODESELECTION;
    @XmlElement(name = "B7ECCLEVEL")
    protected String b7ECCLEVEL;
    @XmlElement(name = "B7NOOFCHARBITS")
    protected String b7NOOFCHARBITS;
    @XmlElement(name = "B7ONRCELLWIDTH")
    protected int b7ONRCELLWIDTH;
    @XmlElement(name = "BARCODEKOORX")
    protected int barcodekoorx;
    @XmlElement(name = "BARCODEKOORY")
    protected int barcodekoory;
    @XmlElement(name = "BARCODETYPE")
    protected String barcodetype;
    @XmlElement(name = "BARKODNUMARASIACI")
    protected String barkodnumarasiaci;
    @XmlElement(name = "BNUMDUSEYBUYUTME")
    protected String bnumduseybuyutme;
    @XmlElement(name = "BARKODNUMARASIFONT")
    protected String barkodnumarasifont;
    @XmlElement(name = "BARKODNUMARASIXKOOR")
    protected int barkodnumarasixkoor;
    @XmlElement(name = "BNUMYATAYBUYUTME")
    protected String bnumyataybuyutme;
    @XmlElement(name = "BARKODNUMARASIYAZDIR")
    protected String barkodnumarasiyazdir;
    @XmlElement(name = "BARKODNUMARASIYKOOR")
    protected int barkodnumarasiykoor;
    @XmlElement(name = "BASILACAKETIKETSAYISI")
    protected int basilacaketiketsayisi;
    @XmlElement(name = "BASKIHIZI")
    protected int baskihizi;
    @XmlElement(name = "BASKIMODU")
    protected String baskimodu;
    @XmlElement(name = "BOUDRATE")
    protected int boudrate;
    @XmlElement(name = "COMPORT")
    protected String comport;
    @XmlElement(name = "DARKERLIGHTER")
    protected String darkerlighter;
    @XmlElement(name = "DATABIT")
    protected int databit;
    @XmlElement(name = "EFFECTIVEPRINTLENGTH")
    protected int effectiveprintlength;
    @XmlElement(name = "EFFECTIVEPRINTWIDTH")
    protected int effectiveprintwidth;
    @XmlElement(name = "FORWARDREVERSE")
    protected String forwardreverse;
    @XmlElement(name = "KAGITKESMEARALIGI")
    protected int kagitkesmearaligi;
    @XmlElement(name = "LABELHEIGHT")
    protected int labelheight;
    @XmlElement(name = "LABELWIDTH")
    protected int labelwidth;
    @XmlElement(name = "NUMBEROFLABELCOL")
    protected int numberoflabelcol;
    @XmlElement(name = "NUMBEROFLABELLINE")
    protected int numberoflabelline;
    @XmlElement(name = "PAPERFEED")
    protected int paperfeed;
    @XmlElement(name = "PARITY")
    protected String parity;
    @XmlElement(name = "PITCHLENGHTOFLABEL")
    protected int pitchlenghtoflabel;
    @XmlElement(name = "PRINTDENSITY")
    protected int printdensity;
    @XmlElement(name = "RIBBON")
    protected String ribbon;
    @XmlElement(name = "SENSORTIPI")
    protected String sensortipi;
    @XmlElement(name = "ACIKLAMA4ACI")
    protected String aciklama4ACI;
    @XmlElement(name = "ACIKLAMA4DUSEYBUYUTME")
    protected String aciklama4DUSEYBUYUTME;
    @XmlElement(name = "ACIKLAMA4FONT")
    protected String aciklama4FONT;
    @XmlElement(name = "ACIKLAMA4XKOOR")
    protected int aciklama4XKOOR;
    @XmlElement(name = "ACIKLAMA4YATAYBUYUTME")
    protected String aciklama4YATAYBUYUTME;
    @XmlElement(name = "ACIKLAMA4YAZDIR")
    protected String aciklama4YAZDIR;
    @XmlElement(name = "ACIKLAMA4YKOOR")
    protected int aciklama4YKOOR;
    @XmlElement(name = "ACIKLAMA3ACI")
    protected String aciklama3ACI;
    @XmlElement(name = "ACIKLAMA3DUSEYBUYUTME")
    protected String aciklama3DUSEYBUYUTME;
    @XmlElement(name = "ACIKLAMA3FONT")
    protected String aciklama3FONT;
    @XmlElement(name = "ACIKLAMA3XKOOR")
    protected int aciklama3XKOOR;
    @XmlElement(name = "ACIKLAMA3YATAYBUYUTME")
    protected String aciklama3YATAYBUYUTME;
    @XmlElement(name = "ACIKLAMA3YAZDIR")
    protected String aciklama3YAZDIR;
    @XmlElement(name = "ACIKLAMA3YKOOR")
    protected int aciklama3YKOOR;
    @XmlElement(name = "STOPBIT")
    protected int stopbit;
    @XmlElement(name = "THERMAL")
    protected String thermal;
    @XmlElement(name = "ACIKLAMA2ACI")
    protected String aciklama2ACI;
    @XmlElement(name = "ACIKLAMA2DUSEYBUYUTME")
    protected String aciklama2DUSEYBUYUTME;
    @XmlElement(name = "ACIKLAMA2FONT")
    protected String aciklama2FONT;
    @XmlElement(name = "ACIKLAMA2YATAYBUYUTME")
    protected String aciklama2YATAYBUYUTME;
    @XmlElement(name = "ACIKLAMA2YAZDIR")
    protected String aciklama2YAZDIR;
    @XmlElement(name = "BARKOD_YAZICISI")
    protected String barkodyazicisi;
    @XmlElement(name = "ACIKLAMA5ACI")
    protected String aciklama5ACI;
    @XmlElement(name = "ACIKLAMA5DUSEYBUYUTME")
    protected String aciklama5DUSEYBUYUTME;
    @XmlElement(name = "ACIKLAMA5FONT")
    protected String aciklama5FONT;
    @XmlElement(name = "ACIKLAMA5XKOOR")
    protected int aciklama5XKOOR;
    @XmlElement(name = "ACIKLAMA5YATAYBUYUTME")
    protected String aciklama5YATAYBUYUTME;
    @XmlElement(name = "ACIKLAMA5YAZDIR")
    protected String aciklama5YAZDIR;
    @XmlElement(name = "ACIKLAMA5YKOOR")
    protected int aciklama5YKOOR;
    @XmlElement(name = "ACIKLAMA6ACI")
    protected String aciklama6ACI;
    @XmlElement(name = "ACIKLAMA6DUSEYBUYUTME")
    protected String aciklama6DUSEYBUYUTME;
    @XmlElement(name = "ACIKLAMA6FONT")
    protected String aciklama6FONT;
    @XmlElement(name = "ACIKLAMA6XKOOR")
    protected int aciklama6XKOOR;
    @XmlElement(name = "ACIKLAMA6YATAYBUYUTME")
    protected String aciklama6YATAYBUYUTME;
    @XmlElement(name = "ACIKLAMA6YAZDIR")
    protected String aciklama6YAZDIR;
    @XmlElement(name = "ACIKLAMA6YKOOR")
    protected int aciklama6YKOOR;
    @XmlElement(name = "ACIKLAMA7XKOOR")
    protected int aciklama7XKOOR;
    @XmlElement(name = "ACIKLAMA7YKOOR")
    protected int aciklama7YKOOR;
    @XmlElement(name = "ACIKLAMA7FONT")
    protected String aciklama7FONT;
    @XmlElement(name = "ACIKLAMA7YATAYBUYUTME")
    protected String aciklama7YATAYBUYUTME;
    @XmlElement(name = "ACIKLAMA7DUSEYBUYUTME")
    protected String aciklama7DUSEYBUYUTME;
    @XmlElement(name = "ACIKLAMA7ACI")
    protected String aciklama7ACI;
    @XmlElement(name = "ACIKLAMA7YAZDIR")
    protected String aciklama7YAZDIR;
    @XmlElement(name = "ACIKLAMA8XKOOR")
    protected int aciklama8XKOOR;
    @XmlElement(name = "ACIKLAMA8YKOOR")
    protected int aciklama8YKOOR;
    @XmlElement(name = "ACIKLAMA8FONT")
    protected String aciklama8FONT;
    @XmlElement(name = "ACIKLAMA8YATAYBUYUTME")
    protected String aciklama8YATAYBUYUTME;
    @XmlElement(name = "ACIKLAMA8DUSEYBUYUTME")
    protected String aciklama8DUSEYBUYUTME;
    @XmlElement(name = "ACIKLAMA8ACI")
    protected String aciklama8ACI;
    @XmlElement(name = "ACIKLAMA8YAZDIR")
    protected String aciklama8YAZDIR;
    @XmlElement(name = "ACIKLAMA9XKOOR")
    protected int aciklama9XKOOR;
    @XmlElement(name = "ACIKLAMA9YKOOR")
    protected int aciklama9YKOOR;
    @XmlElement(name = "ACIKLAMA9FONT")
    protected String aciklama9FONT;
    @XmlElement(name = "ACIKLAMA9YATAYBUYUTME")
    protected String aciklama9YATAYBUYUTME;
    @XmlElement(name = "ACIKLAMA9DUSEYBUYUTME")
    protected String aciklama9DUSEYBUYUTME;
    @XmlElement(name = "ACIKLAMA9ACI")
    protected String aciklama9ACI;
    @XmlElement(name = "ACIKLAMA9YAZDIR")
    protected String aciklama9YAZDIR;
    @XmlElement(name = "ACIKLAMA10XKOOR")
    protected int aciklama10XKOOR;
    @XmlElement(name = "ACIKLAMA10YKOOR")
    protected int aciklama10YKOOR;
    @XmlElement(name = "ACIKLAMA10FONT")
    protected String aciklama10FONT;
    @XmlElement(name = "ACIKLAMA10YATAYBUYUTME")
    protected String aciklama10YATAYBUYUTME;
    @XmlElement(name = "ACIKLAMA10DUSEYBUYUTME")
    protected String aciklama10DUSEYBUYUTME;
    @XmlElement(name = "ACIKLAMA10ACI")
    protected String aciklama10ACI;
    @XmlElement(name = "ACIKLAMA10YAZDIR")
    protected String aciklama10YAZDIR;
    @XmlElement(name = "BARKODNOREVFONT")
    protected String barkodnorevfont;
    @XmlElement(name = "ACIK1REVFONT")
    protected String acik1REVFONT;
    @XmlElement(name = "ACIK2REVFONT")
    protected String acik2REVFONT;
    @XmlElement(name = "ACIK3REVFONT")
    protected String acik3REVFONT;
    @XmlElement(name = "ACIK4REVFONT")
    protected String acik4REVFONT;
    @XmlElement(name = "ACIK5REVFONT")
    protected String acik5REVFONT;
    @XmlElement(name = "ACIK6REVFONT")
    protected String acik6REVFONT;
    @XmlElement(name = "ACIK7REVFONT")
    protected String acik7REVFONT;
    @XmlElement(name = "ACIK8REVFONT")
    protected String acik8REVFONT;
    @XmlElement(name = "ACIK9REVFONT")
    protected String acik9REVFONT;
    @XmlElement(name = "ACIK10REVFONT")
    protected String acik10REVFONT;
    @XmlElement(name = "YAZICI_IP")
    protected String yaziciip;
    @XmlElement(name = "YAZICI_PORT")
    protected int yaziciport;
    @XmlElement(name = "BASKI_ONCESI")
    protected String baskioncesi;
    @XmlElement(name = "BASKI_SONRASI")
    protected String baskisonrasi;
    protected IslemSonuc islemSonuc;

    /**
     * Gets the value of the tanimno property.
     * 
     */
    public int getTANIMNO() {
        return tanimno;
    }

    /**
     * Sets the value of the tanimno property.
     * 
     */
    public void setTANIMNO(int value) {
        this.tanimno = value;
    }

    /**
     * Gets the value of the tanimacik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTANIMACIK() {
        return tanimacik;
    }

    /**
     * Sets the value of the tanimacik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTANIMACIK(String value) {
        this.tanimacik = value;
    }

    /**
     * Gets the value of the aciklama1XKOOR property.
     * 
     */
    public int getACIKLAMA1XKOOR() {
        return aciklama1XKOOR;
    }

    /**
     * Sets the value of the aciklama1XKOOR property.
     * 
     */
    public void setACIKLAMA1XKOOR(int value) {
        this.aciklama1XKOOR = value;
    }

    /**
     * Gets the value of the aciklama1YKOOR property.
     * 
     */
    public int getACIKLAMA1YKOOR() {
        return aciklama1YKOOR;
    }

    /**
     * Sets the value of the aciklama1YKOOR property.
     * 
     */
    public void setACIKLAMA1YKOOR(int value) {
        this.aciklama1YKOOR = value;
    }

    /**
     * Gets the value of the aciklama2XKOOR property.
     * 
     */
    public int getACIKLAMA2XKOOR() {
        return aciklama2XKOOR;
    }

    /**
     * Sets the value of the aciklama2XKOOR property.
     * 
     */
    public void setACIKLAMA2XKOOR(int value) {
        this.aciklama2XKOOR = value;
    }

    /**
     * Gets the value of the aciklama2YKOOR property.
     * 
     */
    public int getACIKLAMA2YKOOR() {
        return aciklama2YKOOR;
    }

    /**
     * Sets the value of the aciklama2YKOOR property.
     * 
     */
    public void setACIKLAMA2YKOOR(int value) {
        this.aciklama2YKOOR = value;
    }

    /**
     * Gets the value of the aciklamaaci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMAACI() {
        return aciklamaaci;
    }

    /**
     * Sets the value of the aciklamaaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMAACI(String value) {
        this.aciklamaaci = value;
    }

    /**
     * Gets the value of the aciklamaduseybuyutme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMADUSEYBUYUTME() {
        return aciklamaduseybuyutme;
    }

    /**
     * Sets the value of the aciklamaduseybuyutme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMADUSEYBUYUTME(String value) {
        this.aciklamaduseybuyutme = value;
    }

    /**
     * Gets the value of the aciklamafont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMAFONT() {
        return aciklamafont;
    }

    /**
     * Sets the value of the aciklamafont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMAFONT(String value) {
        this.aciklamafont = value;
    }

    /**
     * Gets the value of the aciklamayataybuyutme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMAYATAYBUYUTME() {
        return aciklamayataybuyutme;
    }

    /**
     * Sets the value of the aciklamayataybuyutme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMAYATAYBUYUTME(String value) {
        this.aciklamayataybuyutme = value;
    }

    /**
     * Gets the value of the aciklamayazdir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMAYAZDIR() {
        return aciklamayazdir;
    }

    /**
     * Sets the value of the aciklamayazdir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMAYAZDIR(String value) {
        this.aciklamayazdir = value;
    }

    /**
     * Gets the value of the angleofbarkod property.
     * 
     */
    public int getANGLEOFBARKOD() {
        return angleofbarkod;
    }

    /**
     * Sets the value of the angleofbarkod property.
     * 
     */
    public void setANGLEOFBARKOD(int value) {
        this.angleofbarkod = value;
    }

    /**
     * Gets the value of the b1BARCODEHEIGHT property.
     * 
     */
    public int getB1BARCODEHEIGHT() {
        return b1BARCODEHEIGHT;
    }

    /**
     * Sets the value of the b1BARCODEHEIGHT property.
     * 
     */
    public void setB1BARCODEHEIGHT(int value) {
        this.b1BARCODEHEIGHT = value;
    }

    /**
     * Gets the value of the b1BARCODEINCDECTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB1BARCODEINCDECTYPE() {
        return b1BARCODEINCDECTYPE;
    }

    /**
     * Sets the value of the b1BARCODEINCDECTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB1BARCODEINCDECTYPE(String value) {
        this.b1BARCODEINCDECTYPE = value;
    }

    /**
     * Gets the value of the b1BARCODEINCDECVALUE property.
     * 
     */
    public int getB1BARCODEINCDECVALUE() {
        return b1BARCODEINCDECVALUE;
    }

    /**
     * Sets the value of the b1BARCODEINCDECVALUE property.
     * 
     */
    public void setB1BARCODEINCDECVALUE(int value) {
        this.b1BARCODEINCDECVALUE = value;
    }

    /**
     * Gets the value of the b1BARCODEUNDERPRINT property.
     * 
     */
    public int getB1BARCODEUNDERPRINT() {
        return b1BARCODEUNDERPRINT;
    }

    /**
     * Sets the value of the b1BARCODEUNDERPRINT property.
     * 
     */
    public void setB1BARCODEUNDERPRINT(int value) {
        this.b1BARCODEUNDERPRINT = value;
    }

    /**
     * Gets the value of the b1CHECKDIGITTYPE property.
     * 
     */
    public int getB1CHECKDIGITTYPE() {
        return b1CHECKDIGITTYPE;
    }

    /**
     * Sets the value of the b1CHECKDIGITTYPE property.
     * 
     */
    public void setB1CHECKDIGITTYPE(int value) {
        this.b1CHECKDIGITTYPE = value;
    }

    /**
     * Gets the value of the b1ONEMODULEWIDTH property.
     * 
     */
    public int getB1ONEMODULEWIDTH() {
        return b1ONEMODULEWIDTH;
    }

    /**
     * Sets the value of the b1ONEMODULEWIDTH property.
     * 
     */
    public void setB1ONEMODULEWIDTH(int value) {
        this.b1ONEMODULEWIDTH = value;
    }

    /**
     * Gets the value of the b2BARCODEHEIGHT property.
     * 
     */
    public int getB2BARCODEHEIGHT() {
        return b2BARCODEHEIGHT;
    }

    /**
     * Sets the value of the b2BARCODEHEIGHT property.
     * 
     */
    public void setB2BARCODEHEIGHT(int value) {
        this.b2BARCODEHEIGHT = value;
    }

    /**
     * Gets the value of the b2BARCODEINCDECTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB2BARCODEINCDECTYPE() {
        return b2BARCODEINCDECTYPE;
    }

    /**
     * Sets the value of the b2BARCODEINCDECTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB2BARCODEINCDECTYPE(String value) {
        this.b2BARCODEINCDECTYPE = value;
    }

    /**
     * Gets the value of the b2BARCODEINCDECVALUE property.
     * 
     */
    public int getB2BARCODEINCDECVALUE() {
        return b2BARCODEINCDECVALUE;
    }

    /**
     * Sets the value of the b2BARCODEINCDECVALUE property.
     * 
     */
    public void setB2BARCODEINCDECVALUE(int value) {
        this.b2BARCODEINCDECVALUE = value;
    }

    /**
     * Gets the value of the b2BARCODEUNDERPRINT property.
     * 
     */
    public int getB2BARCODEUNDERPRINT() {
        return b2BARCODEUNDERPRINT;
    }

    /**
     * Sets the value of the b2BARCODEUNDERPRINT property.
     * 
     */
    public void setB2BARCODEUNDERPRINT(int value) {
        this.b2BARCODEUNDERPRINT = value;
    }

    /**
     * Gets the value of the b2CHECKDIGITTYPE property.
     * 
     */
    public int getB2CHECKDIGITTYPE() {
        return b2CHECKDIGITTYPE;
    }

    /**
     * Sets the value of the b2CHECKDIGITTYPE property.
     * 
     */
    public void setB2CHECKDIGITTYPE(int value) {
        this.b2CHECKDIGITTYPE = value;
    }

    /**
     * Gets the value of the b2CHTOCHSPACEWIDTH property.
     * 
     */
    public int getB2CHTOCHSPACEWIDTH() {
        return b2CHTOCHSPACEWIDTH;
    }

    /**
     * Sets the value of the b2CHTOCHSPACEWIDTH property.
     * 
     */
    public void setB2CHTOCHSPACEWIDTH(int value) {
        this.b2CHTOCHSPACEWIDTH = value;
    }

    /**
     * Gets the value of the b2NARROWBARWIDTH property.
     * 
     */
    public int getB2NARROWBARWIDTH() {
        return b2NARROWBARWIDTH;
    }

    /**
     * Sets the value of the b2NARROWBARWIDTH property.
     * 
     */
    public void setB2NARROWBARWIDTH(int value) {
        this.b2NARROWBARWIDTH = value;
    }

    /**
     * Gets the value of the b2NARROWSPACEWIDTH property.
     * 
     */
    public int getB2NARROWSPACEWIDTH() {
        return b2NARROWSPACEWIDTH;
    }

    /**
     * Sets the value of the b2NARROWSPACEWIDTH property.
     * 
     */
    public void setB2NARROWSPACEWIDTH(int value) {
        this.b2NARROWSPACEWIDTH = value;
    }

    /**
     * Gets the value of the b2STARTSTOPCODEATTACH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB2STARTSTOPCODEATTACH() {
        return b2STARTSTOPCODEATTACH;
    }

    /**
     * Sets the value of the b2STARTSTOPCODEATTACH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB2STARTSTOPCODEATTACH(String value) {
        this.b2STARTSTOPCODEATTACH = value;
    }

    /**
     * Gets the value of the b2SUPPRESSEDZERONO property.
     * 
     */
    public int getB2SUPPRESSEDZERONO() {
        return b2SUPPRESSEDZERONO;
    }

    /**
     * Sets the value of the b2SUPPRESSEDZERONO property.
     * 
     */
    public void setB2SUPPRESSEDZERONO(int value) {
        this.b2SUPPRESSEDZERONO = value;
    }

    /**
     * Gets the value of the b2WIDEBARWIDTH property.
     * 
     */
    public int getB2WIDEBARWIDTH() {
        return b2WIDEBARWIDTH;
    }

    /**
     * Sets the value of the b2WIDEBARWIDTH property.
     * 
     */
    public void setB2WIDEBARWIDTH(int value) {
        this.b2WIDEBARWIDTH = value;
    }

    /**
     * Gets the value of the b2WIDESPACEWIDTH property.
     * 
     */
    public int getB2WIDESPACEWIDTH() {
        return b2WIDESPACEWIDTH;
    }

    /**
     * Sets the value of the b2WIDESPACEWIDTH property.
     * 
     */
    public void setB2WIDESPACEWIDTH(int value) {
        this.b2WIDESPACEWIDTH = value;
    }

    /**
     * Gets the value of the b3ECCTYPE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB3ECCTYPE() {
        return b3ECCTYPE;
    }

    /**
     * Sets the value of the b3ECCTYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB3ECCTYPE(String value) {
        this.b3ECCTYPE = value;
    }

    /**
     * Gets the value of the b3FORMATID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB3FORMATID() {
        return b3FORMATID;
    }

    /**
     * Sets the value of the b3FORMATID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB3FORMATID(String value) {
        this.b3FORMATID = value;
    }

    /**
     * Gets the value of the b3ONRCELLWIDTH property.
     * 
     */
    public int getB3ONRCELLWIDTH() {
        return b3ONRCELLWIDTH;
    }

    /**
     * Sets the value of the b3ONRCELLWIDTH property.
     * 
     */
    public void setB3ONRCELLWIDTH(int value) {
        this.b3ONRCELLWIDTH = value;
    }

    /**
     * Gets the value of the b4BARHEIGHT property.
     * 
     */
    public int getB4BARHEIGHT() {
        return b4BARHEIGHT;
    }

    /**
     * Sets the value of the b4BARHEIGHT property.
     * 
     */
    public void setB4BARHEIGHT(int value) {
        this.b4BARHEIGHT = value;
    }

    /**
     * Gets the value of the b4NUMBEROFCOLUMNS property.
     * 
     */
    public int getB4NUMBEROFCOLUMNS() {
        return b4NUMBEROFCOLUMNS;
    }

    /**
     * Sets the value of the b4NUMBEROFCOLUMNS property.
     * 
     */
    public void setB4NUMBEROFCOLUMNS(int value) {
        this.b4NUMBEROFCOLUMNS = value;
    }

    /**
     * Gets the value of the b4ONEMODULEWIDTH property.
     * 
     */
    public int getB4ONEMODULEWIDTH() {
        return b4ONEMODULEWIDTH;
    }

    /**
     * Sets the value of the b4ONEMODULEWIDTH property.
     * 
     */
    public void setB4ONEMODULEWIDTH(int value) {
        this.b4ONEMODULEWIDTH = value;
    }

    /**
     * Gets the value of the b4SECURITYLEVEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB4SECURITYLEVEL() {
        return b4SECURITYLEVEL;
    }

    /**
     * Sets the value of the b4SECURITYLEVEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB4SECURITYLEVEL(String value) {
        this.b4SECURITYLEVEL = value;
    }

    /**
     * Gets the value of the b5ERRORCORRECTIONLEVEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB5ERRORCORRECTIONLEVEL() {
        return b5ERRORCORRECTIONLEVEL;
    }

    /**
     * Sets the value of the b5ERRORCORRECTIONLEVEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB5ERRORCORRECTIONLEVEL(String value) {
        this.b5ERRORCORRECTIONLEVEL = value;
    }

    /**
     * Gets the value of the b5MODESELECTION property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB5MODESELECTION() {
        return b5MODESELECTION;
    }

    /**
     * Sets the value of the b5MODESELECTION property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB5MODESELECTION(String value) {
        this.b5MODESELECTION = value;
    }

    /**
     * Gets the value of the b5ONECELLWIDTH property.
     * 
     */
    public int getB5ONECELLWIDTH() {
        return b5ONECELLWIDTH;
    }

    /**
     * Sets the value of the b5ONECELLWIDTH property.
     * 
     */
    public void setB5ONECELLWIDTH(int value) {
        this.b5ONECELLWIDTH = value;
    }

    /**
     * Gets the value of the b6MODESELECTION property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB6MODESELECTION() {
        return b6MODESELECTION;
    }

    /**
     * Sets the value of the b6MODESELECTION property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB6MODESELECTION(String value) {
        this.b6MODESELECTION = value;
    }

    /**
     * Gets the value of the b7ECCLEVEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB7ECCLEVEL() {
        return b7ECCLEVEL;
    }

    /**
     * Sets the value of the b7ECCLEVEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB7ECCLEVEL(String value) {
        this.b7ECCLEVEL = value;
    }

    /**
     * Gets the value of the b7NOOFCHARBITS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB7NOOFCHARBITS() {
        return b7NOOFCHARBITS;
    }

    /**
     * Sets the value of the b7NOOFCHARBITS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB7NOOFCHARBITS(String value) {
        this.b7NOOFCHARBITS = value;
    }

    /**
     * Gets the value of the b7ONRCELLWIDTH property.
     * 
     */
    public int getB7ONRCELLWIDTH() {
        return b7ONRCELLWIDTH;
    }

    /**
     * Sets the value of the b7ONRCELLWIDTH property.
     * 
     */
    public void setB7ONRCELLWIDTH(int value) {
        this.b7ONRCELLWIDTH = value;
    }

    /**
     * Gets the value of the barcodekoorx property.
     * 
     */
    public int getBARCODEKOORX() {
        return barcodekoorx;
    }

    /**
     * Sets the value of the barcodekoorx property.
     * 
     */
    public void setBARCODEKOORX(int value) {
        this.barcodekoorx = value;
    }

    /**
     * Gets the value of the barcodekoory property.
     * 
     */
    public int getBARCODEKOORY() {
        return barcodekoory;
    }

    /**
     * Sets the value of the barcodekoory property.
     * 
     */
    public void setBARCODEKOORY(int value) {
        this.barcodekoory = value;
    }

    /**
     * Gets the value of the barcodetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARCODETYPE() {
        return barcodetype;
    }

    /**
     * Sets the value of the barcodetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARCODETYPE(String value) {
        this.barcodetype = value;
    }

    /**
     * Gets the value of the barkodnumarasiaci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARKODNUMARASIACI() {
        return barkodnumarasiaci;
    }

    /**
     * Sets the value of the barkodnumarasiaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARKODNUMARASIACI(String value) {
        this.barkodnumarasiaci = value;
    }

    /**
     * Gets the value of the bnumduseybuyutme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNUMDUSEYBUYUTME() {
        return bnumduseybuyutme;
    }

    /**
     * Sets the value of the bnumduseybuyutme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNUMDUSEYBUYUTME(String value) {
        this.bnumduseybuyutme = value;
    }

    /**
     * Gets the value of the barkodnumarasifont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARKODNUMARASIFONT() {
        return barkodnumarasifont;
    }

    /**
     * Sets the value of the barkodnumarasifont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARKODNUMARASIFONT(String value) {
        this.barkodnumarasifont = value;
    }

    /**
     * Gets the value of the barkodnumarasixkoor property.
     * 
     */
    public int getBARKODNUMARASIXKOOR() {
        return barkodnumarasixkoor;
    }

    /**
     * Sets the value of the barkodnumarasixkoor property.
     * 
     */
    public void setBARKODNUMARASIXKOOR(int value) {
        this.barkodnumarasixkoor = value;
    }

    /**
     * Gets the value of the bnumyataybuyutme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNUMYATAYBUYUTME() {
        return bnumyataybuyutme;
    }

    /**
     * Sets the value of the bnumyataybuyutme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNUMYATAYBUYUTME(String value) {
        this.bnumyataybuyutme = value;
    }

    /**
     * Gets the value of the barkodnumarasiyazdir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARKODNUMARASIYAZDIR() {
        return barkodnumarasiyazdir;
    }

    /**
     * Sets the value of the barkodnumarasiyazdir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARKODNUMARASIYAZDIR(String value) {
        this.barkodnumarasiyazdir = value;
    }

    /**
     * Gets the value of the barkodnumarasiykoor property.
     * 
     */
    public int getBARKODNUMARASIYKOOR() {
        return barkodnumarasiykoor;
    }

    /**
     * Sets the value of the barkodnumarasiykoor property.
     * 
     */
    public void setBARKODNUMARASIYKOOR(int value) {
        this.barkodnumarasiykoor = value;
    }

    /**
     * Gets the value of the basilacaketiketsayisi property.
     * 
     */
    public int getBASILACAKETIKETSAYISI() {
        return basilacaketiketsayisi;
    }

    /**
     * Sets the value of the basilacaketiketsayisi property.
     * 
     */
    public void setBASILACAKETIKETSAYISI(int value) {
        this.basilacaketiketsayisi = value;
    }

    /**
     * Gets the value of the baskihizi property.
     * 
     */
    public int getBASKIHIZI() {
        return baskihizi;
    }

    /**
     * Sets the value of the baskihizi property.
     * 
     */
    public void setBASKIHIZI(int value) {
        this.baskihizi = value;
    }

    /**
     * Gets the value of the baskimodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASKIMODU() {
        return baskimodu;
    }

    /**
     * Sets the value of the baskimodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASKIMODU(String value) {
        this.baskimodu = value;
    }

    /**
     * Gets the value of the boudrate property.
     * 
     */
    public int getBOUDRATE() {
        return boudrate;
    }

    /**
     * Sets the value of the boudrate property.
     * 
     */
    public void setBOUDRATE(int value) {
        this.boudrate = value;
    }

    /**
     * Gets the value of the comport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPORT() {
        return comport;
    }

    /**
     * Sets the value of the comport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPORT(String value) {
        this.comport = value;
    }

    /**
     * Gets the value of the darkerlighter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDARKERLIGHTER() {
        return darkerlighter;
    }

    /**
     * Sets the value of the darkerlighter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDARKERLIGHTER(String value) {
        this.darkerlighter = value;
    }

    /**
     * Gets the value of the databit property.
     * 
     */
    public int getDATABIT() {
        return databit;
    }

    /**
     * Sets the value of the databit property.
     * 
     */
    public void setDATABIT(int value) {
        this.databit = value;
    }

    /**
     * Gets the value of the effectiveprintlength property.
     * 
     */
    public int getEFFECTIVEPRINTLENGTH() {
        return effectiveprintlength;
    }

    /**
     * Sets the value of the effectiveprintlength property.
     * 
     */
    public void setEFFECTIVEPRINTLENGTH(int value) {
        this.effectiveprintlength = value;
    }

    /**
     * Gets the value of the effectiveprintwidth property.
     * 
     */
    public int getEFFECTIVEPRINTWIDTH() {
        return effectiveprintwidth;
    }

    /**
     * Sets the value of the effectiveprintwidth property.
     * 
     */
    public void setEFFECTIVEPRINTWIDTH(int value) {
        this.effectiveprintwidth = value;
    }

    /**
     * Gets the value of the forwardreverse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORWARDREVERSE() {
        return forwardreverse;
    }

    /**
     * Sets the value of the forwardreverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORWARDREVERSE(String value) {
        this.forwardreverse = value;
    }

    /**
     * Gets the value of the kagitkesmearaligi property.
     * 
     */
    public int getKAGITKESMEARALIGI() {
        return kagitkesmearaligi;
    }

    /**
     * Sets the value of the kagitkesmearaligi property.
     * 
     */
    public void setKAGITKESMEARALIGI(int value) {
        this.kagitkesmearaligi = value;
    }

    /**
     * Gets the value of the labelheight property.
     * 
     */
    public int getLABELHEIGHT() {
        return labelheight;
    }

    /**
     * Sets the value of the labelheight property.
     * 
     */
    public void setLABELHEIGHT(int value) {
        this.labelheight = value;
    }

    /**
     * Gets the value of the labelwidth property.
     * 
     */
    public int getLABELWIDTH() {
        return labelwidth;
    }

    /**
     * Sets the value of the labelwidth property.
     * 
     */
    public void setLABELWIDTH(int value) {
        this.labelwidth = value;
    }

    /**
     * Gets the value of the numberoflabelcol property.
     * 
     */
    public int getNUMBEROFLABELCOL() {
        return numberoflabelcol;
    }

    /**
     * Sets the value of the numberoflabelcol property.
     * 
     */
    public void setNUMBEROFLABELCOL(int value) {
        this.numberoflabelcol = value;
    }

    /**
     * Gets the value of the numberoflabelline property.
     * 
     */
    public int getNUMBEROFLABELLINE() {
        return numberoflabelline;
    }

    /**
     * Sets the value of the numberoflabelline property.
     * 
     */
    public void setNUMBEROFLABELLINE(int value) {
        this.numberoflabelline = value;
    }

    /**
     * Gets the value of the paperfeed property.
     * 
     */
    public int getPAPERFEED() {
        return paperfeed;
    }

    /**
     * Sets the value of the paperfeed property.
     * 
     */
    public void setPAPERFEED(int value) {
        this.paperfeed = value;
    }

    /**
     * Gets the value of the parity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARITY() {
        return parity;
    }

    /**
     * Sets the value of the parity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARITY(String value) {
        this.parity = value;
    }

    /**
     * Gets the value of the pitchlenghtoflabel property.
     * 
     */
    public int getPITCHLENGHTOFLABEL() {
        return pitchlenghtoflabel;
    }

    /**
     * Sets the value of the pitchlenghtoflabel property.
     * 
     */
    public void setPITCHLENGHTOFLABEL(int value) {
        this.pitchlenghtoflabel = value;
    }

    /**
     * Gets the value of the printdensity property.
     * 
     */
    public int getPRINTDENSITY() {
        return printdensity;
    }

    /**
     * Sets the value of the printdensity property.
     * 
     */
    public void setPRINTDENSITY(int value) {
        this.printdensity = value;
    }

    /**
     * Gets the value of the ribbon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIBBON() {
        return ribbon;
    }

    /**
     * Sets the value of the ribbon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIBBON(String value) {
        this.ribbon = value;
    }

    /**
     * Gets the value of the sensortipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENSORTIPI() {
        return sensortipi;
    }

    /**
     * Sets the value of the sensortipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENSORTIPI(String value) {
        this.sensortipi = value;
    }

    /**
     * Gets the value of the aciklama4ACI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA4ACI() {
        return aciklama4ACI;
    }

    /**
     * Sets the value of the aciklama4ACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA4ACI(String value) {
        this.aciklama4ACI = value;
    }

    /**
     * Gets the value of the aciklama4DUSEYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA4DUSEYBUYUTME() {
        return aciklama4DUSEYBUYUTME;
    }

    /**
     * Sets the value of the aciklama4DUSEYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA4DUSEYBUYUTME(String value) {
        this.aciklama4DUSEYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama4FONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA4FONT() {
        return aciklama4FONT;
    }

    /**
     * Sets the value of the aciklama4FONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA4FONT(String value) {
        this.aciklama4FONT = value;
    }

    /**
     * Gets the value of the aciklama4XKOOR property.
     * 
     */
    public int getACIKLAMA4XKOOR() {
        return aciklama4XKOOR;
    }

    /**
     * Sets the value of the aciklama4XKOOR property.
     * 
     */
    public void setACIKLAMA4XKOOR(int value) {
        this.aciklama4XKOOR = value;
    }

    /**
     * Gets the value of the aciklama4YATAYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA4YATAYBUYUTME() {
        return aciklama4YATAYBUYUTME;
    }

    /**
     * Sets the value of the aciklama4YATAYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA4YATAYBUYUTME(String value) {
        this.aciklama4YATAYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama4YAZDIR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA4YAZDIR() {
        return aciklama4YAZDIR;
    }

    /**
     * Sets the value of the aciklama4YAZDIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA4YAZDIR(String value) {
        this.aciklama4YAZDIR = value;
    }

    /**
     * Gets the value of the aciklama4YKOOR property.
     * 
     */
    public int getACIKLAMA4YKOOR() {
        return aciklama4YKOOR;
    }

    /**
     * Sets the value of the aciklama4YKOOR property.
     * 
     */
    public void setACIKLAMA4YKOOR(int value) {
        this.aciklama4YKOOR = value;
    }

    /**
     * Gets the value of the aciklama3ACI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA3ACI() {
        return aciklama3ACI;
    }

    /**
     * Sets the value of the aciklama3ACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA3ACI(String value) {
        this.aciklama3ACI = value;
    }

    /**
     * Gets the value of the aciklama3DUSEYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA3DUSEYBUYUTME() {
        return aciklama3DUSEYBUYUTME;
    }

    /**
     * Sets the value of the aciklama3DUSEYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA3DUSEYBUYUTME(String value) {
        this.aciklama3DUSEYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama3FONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA3FONT() {
        return aciklama3FONT;
    }

    /**
     * Sets the value of the aciklama3FONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA3FONT(String value) {
        this.aciklama3FONT = value;
    }

    /**
     * Gets the value of the aciklama3XKOOR property.
     * 
     */
    public int getACIKLAMA3XKOOR() {
        return aciklama3XKOOR;
    }

    /**
     * Sets the value of the aciklama3XKOOR property.
     * 
     */
    public void setACIKLAMA3XKOOR(int value) {
        this.aciklama3XKOOR = value;
    }

    /**
     * Gets the value of the aciklama3YATAYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA3YATAYBUYUTME() {
        return aciklama3YATAYBUYUTME;
    }

    /**
     * Sets the value of the aciklama3YATAYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA3YATAYBUYUTME(String value) {
        this.aciklama3YATAYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama3YAZDIR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA3YAZDIR() {
        return aciklama3YAZDIR;
    }

    /**
     * Sets the value of the aciklama3YAZDIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA3YAZDIR(String value) {
        this.aciklama3YAZDIR = value;
    }

    /**
     * Gets the value of the aciklama3YKOOR property.
     * 
     */
    public int getACIKLAMA3YKOOR() {
        return aciklama3YKOOR;
    }

    /**
     * Sets the value of the aciklama3YKOOR property.
     * 
     */
    public void setACIKLAMA3YKOOR(int value) {
        this.aciklama3YKOOR = value;
    }

    /**
     * Gets the value of the stopbit property.
     * 
     */
    public int getSTOPBIT() {
        return stopbit;
    }

    /**
     * Sets the value of the stopbit property.
     * 
     */
    public void setSTOPBIT(int value) {
        this.stopbit = value;
    }

    /**
     * Gets the value of the thermal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTHERMAL() {
        return thermal;
    }

    /**
     * Sets the value of the thermal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTHERMAL(String value) {
        this.thermal = value;
    }

    /**
     * Gets the value of the aciklama2ACI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA2ACI() {
        return aciklama2ACI;
    }

    /**
     * Sets the value of the aciklama2ACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA2ACI(String value) {
        this.aciklama2ACI = value;
    }

    /**
     * Gets the value of the aciklama2DUSEYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA2DUSEYBUYUTME() {
        return aciklama2DUSEYBUYUTME;
    }

    /**
     * Sets the value of the aciklama2DUSEYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA2DUSEYBUYUTME(String value) {
        this.aciklama2DUSEYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama2FONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA2FONT() {
        return aciklama2FONT;
    }

    /**
     * Sets the value of the aciklama2FONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA2FONT(String value) {
        this.aciklama2FONT = value;
    }

    /**
     * Gets the value of the aciklama2YATAYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA2YATAYBUYUTME() {
        return aciklama2YATAYBUYUTME;
    }

    /**
     * Sets the value of the aciklama2YATAYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA2YATAYBUYUTME(String value) {
        this.aciklama2YATAYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama2YAZDIR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA2YAZDIR() {
        return aciklama2YAZDIR;
    }

    /**
     * Sets the value of the aciklama2YAZDIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA2YAZDIR(String value) {
        this.aciklama2YAZDIR = value;
    }

    /**
     * Gets the value of the barkodyazicisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARKODYAZICISI() {
        return barkodyazicisi;
    }

    /**
     * Sets the value of the barkodyazicisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARKODYAZICISI(String value) {
        this.barkodyazicisi = value;
    }

    /**
     * Gets the value of the aciklama5ACI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA5ACI() {
        return aciklama5ACI;
    }

    /**
     * Sets the value of the aciklama5ACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA5ACI(String value) {
        this.aciklama5ACI = value;
    }

    /**
     * Gets the value of the aciklama5DUSEYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA5DUSEYBUYUTME() {
        return aciklama5DUSEYBUYUTME;
    }

    /**
     * Sets the value of the aciklama5DUSEYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA5DUSEYBUYUTME(String value) {
        this.aciklama5DUSEYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama5FONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA5FONT() {
        return aciklama5FONT;
    }

    /**
     * Sets the value of the aciklama5FONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA5FONT(String value) {
        this.aciklama5FONT = value;
    }

    /**
     * Gets the value of the aciklama5XKOOR property.
     * 
     */
    public int getACIKLAMA5XKOOR() {
        return aciklama5XKOOR;
    }

    /**
     * Sets the value of the aciklama5XKOOR property.
     * 
     */
    public void setACIKLAMA5XKOOR(int value) {
        this.aciklama5XKOOR = value;
    }

    /**
     * Gets the value of the aciklama5YATAYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA5YATAYBUYUTME() {
        return aciklama5YATAYBUYUTME;
    }

    /**
     * Sets the value of the aciklama5YATAYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA5YATAYBUYUTME(String value) {
        this.aciklama5YATAYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama5YAZDIR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA5YAZDIR() {
        return aciklama5YAZDIR;
    }

    /**
     * Sets the value of the aciklama5YAZDIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA5YAZDIR(String value) {
        this.aciklama5YAZDIR = value;
    }

    /**
     * Gets the value of the aciklama5YKOOR property.
     * 
     */
    public int getACIKLAMA5YKOOR() {
        return aciklama5YKOOR;
    }

    /**
     * Sets the value of the aciklama5YKOOR property.
     * 
     */
    public void setACIKLAMA5YKOOR(int value) {
        this.aciklama5YKOOR = value;
    }

    /**
     * Gets the value of the aciklama6ACI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA6ACI() {
        return aciklama6ACI;
    }

    /**
     * Sets the value of the aciklama6ACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA6ACI(String value) {
        this.aciklama6ACI = value;
    }

    /**
     * Gets the value of the aciklama6DUSEYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA6DUSEYBUYUTME() {
        return aciklama6DUSEYBUYUTME;
    }

    /**
     * Sets the value of the aciklama6DUSEYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA6DUSEYBUYUTME(String value) {
        this.aciklama6DUSEYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama6FONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA6FONT() {
        return aciklama6FONT;
    }

    /**
     * Sets the value of the aciklama6FONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA6FONT(String value) {
        this.aciklama6FONT = value;
    }

    /**
     * Gets the value of the aciklama6XKOOR property.
     * 
     */
    public int getACIKLAMA6XKOOR() {
        return aciklama6XKOOR;
    }

    /**
     * Sets the value of the aciklama6XKOOR property.
     * 
     */
    public void setACIKLAMA6XKOOR(int value) {
        this.aciklama6XKOOR = value;
    }

    /**
     * Gets the value of the aciklama6YATAYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA6YATAYBUYUTME() {
        return aciklama6YATAYBUYUTME;
    }

    /**
     * Sets the value of the aciklama6YATAYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA6YATAYBUYUTME(String value) {
        this.aciklama6YATAYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama6YAZDIR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA6YAZDIR() {
        return aciklama6YAZDIR;
    }

    /**
     * Sets the value of the aciklama6YAZDIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA6YAZDIR(String value) {
        this.aciklama6YAZDIR = value;
    }

    /**
     * Gets the value of the aciklama6YKOOR property.
     * 
     */
    public int getACIKLAMA6YKOOR() {
        return aciklama6YKOOR;
    }

    /**
     * Sets the value of the aciklama6YKOOR property.
     * 
     */
    public void setACIKLAMA6YKOOR(int value) {
        this.aciklama6YKOOR = value;
    }

    /**
     * Gets the value of the aciklama7XKOOR property.
     * 
     */
    public int getACIKLAMA7XKOOR() {
        return aciklama7XKOOR;
    }

    /**
     * Sets the value of the aciklama7XKOOR property.
     * 
     */
    public void setACIKLAMA7XKOOR(int value) {
        this.aciklama7XKOOR = value;
    }

    /**
     * Gets the value of the aciklama7YKOOR property.
     * 
     */
    public int getACIKLAMA7YKOOR() {
        return aciklama7YKOOR;
    }

    /**
     * Sets the value of the aciklama7YKOOR property.
     * 
     */
    public void setACIKLAMA7YKOOR(int value) {
        this.aciklama7YKOOR = value;
    }

    /**
     * Gets the value of the aciklama7FONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA7FONT() {
        return aciklama7FONT;
    }

    /**
     * Sets the value of the aciklama7FONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA7FONT(String value) {
        this.aciklama7FONT = value;
    }

    /**
     * Gets the value of the aciklama7YATAYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA7YATAYBUYUTME() {
        return aciklama7YATAYBUYUTME;
    }

    /**
     * Sets the value of the aciklama7YATAYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA7YATAYBUYUTME(String value) {
        this.aciklama7YATAYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama7DUSEYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA7DUSEYBUYUTME() {
        return aciklama7DUSEYBUYUTME;
    }

    /**
     * Sets the value of the aciklama7DUSEYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA7DUSEYBUYUTME(String value) {
        this.aciklama7DUSEYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama7ACI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA7ACI() {
        return aciklama7ACI;
    }

    /**
     * Sets the value of the aciklama7ACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA7ACI(String value) {
        this.aciklama7ACI = value;
    }

    /**
     * Gets the value of the aciklama7YAZDIR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA7YAZDIR() {
        return aciklama7YAZDIR;
    }

    /**
     * Sets the value of the aciklama7YAZDIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA7YAZDIR(String value) {
        this.aciklama7YAZDIR = value;
    }

    /**
     * Gets the value of the aciklama8XKOOR property.
     * 
     */
    public int getACIKLAMA8XKOOR() {
        return aciklama8XKOOR;
    }

    /**
     * Sets the value of the aciklama8XKOOR property.
     * 
     */
    public void setACIKLAMA8XKOOR(int value) {
        this.aciklama8XKOOR = value;
    }

    /**
     * Gets the value of the aciklama8YKOOR property.
     * 
     */
    public int getACIKLAMA8YKOOR() {
        return aciklama8YKOOR;
    }

    /**
     * Sets the value of the aciklama8YKOOR property.
     * 
     */
    public void setACIKLAMA8YKOOR(int value) {
        this.aciklama8YKOOR = value;
    }

    /**
     * Gets the value of the aciklama8FONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA8FONT() {
        return aciklama8FONT;
    }

    /**
     * Sets the value of the aciklama8FONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA8FONT(String value) {
        this.aciklama8FONT = value;
    }

    /**
     * Gets the value of the aciklama8YATAYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA8YATAYBUYUTME() {
        return aciklama8YATAYBUYUTME;
    }

    /**
     * Sets the value of the aciklama8YATAYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA8YATAYBUYUTME(String value) {
        this.aciklama8YATAYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama8DUSEYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA8DUSEYBUYUTME() {
        return aciklama8DUSEYBUYUTME;
    }

    /**
     * Sets the value of the aciklama8DUSEYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA8DUSEYBUYUTME(String value) {
        this.aciklama8DUSEYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama8ACI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA8ACI() {
        return aciklama8ACI;
    }

    /**
     * Sets the value of the aciklama8ACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA8ACI(String value) {
        this.aciklama8ACI = value;
    }

    /**
     * Gets the value of the aciklama8YAZDIR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA8YAZDIR() {
        return aciklama8YAZDIR;
    }

    /**
     * Sets the value of the aciklama8YAZDIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA8YAZDIR(String value) {
        this.aciklama8YAZDIR = value;
    }

    /**
     * Gets the value of the aciklama9XKOOR property.
     * 
     */
    public int getACIKLAMA9XKOOR() {
        return aciklama9XKOOR;
    }

    /**
     * Sets the value of the aciklama9XKOOR property.
     * 
     */
    public void setACIKLAMA9XKOOR(int value) {
        this.aciklama9XKOOR = value;
    }

    /**
     * Gets the value of the aciklama9YKOOR property.
     * 
     */
    public int getACIKLAMA9YKOOR() {
        return aciklama9YKOOR;
    }

    /**
     * Sets the value of the aciklama9YKOOR property.
     * 
     */
    public void setACIKLAMA9YKOOR(int value) {
        this.aciklama9YKOOR = value;
    }

    /**
     * Gets the value of the aciklama9FONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA9FONT() {
        return aciklama9FONT;
    }

    /**
     * Sets the value of the aciklama9FONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA9FONT(String value) {
        this.aciklama9FONT = value;
    }

    /**
     * Gets the value of the aciklama9YATAYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA9YATAYBUYUTME() {
        return aciklama9YATAYBUYUTME;
    }

    /**
     * Sets the value of the aciklama9YATAYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA9YATAYBUYUTME(String value) {
        this.aciklama9YATAYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama9DUSEYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA9DUSEYBUYUTME() {
        return aciklama9DUSEYBUYUTME;
    }

    /**
     * Sets the value of the aciklama9DUSEYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA9DUSEYBUYUTME(String value) {
        this.aciklama9DUSEYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama9ACI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA9ACI() {
        return aciklama9ACI;
    }

    /**
     * Sets the value of the aciklama9ACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA9ACI(String value) {
        this.aciklama9ACI = value;
    }

    /**
     * Gets the value of the aciklama9YAZDIR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA9YAZDIR() {
        return aciklama9YAZDIR;
    }

    /**
     * Sets the value of the aciklama9YAZDIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA9YAZDIR(String value) {
        this.aciklama9YAZDIR = value;
    }

    /**
     * Gets the value of the aciklama10XKOOR property.
     * 
     */
    public int getACIKLAMA10XKOOR() {
        return aciklama10XKOOR;
    }

    /**
     * Sets the value of the aciklama10XKOOR property.
     * 
     */
    public void setACIKLAMA10XKOOR(int value) {
        this.aciklama10XKOOR = value;
    }

    /**
     * Gets the value of the aciklama10YKOOR property.
     * 
     */
    public int getACIKLAMA10YKOOR() {
        return aciklama10YKOOR;
    }

    /**
     * Sets the value of the aciklama10YKOOR property.
     * 
     */
    public void setACIKLAMA10YKOOR(int value) {
        this.aciklama10YKOOR = value;
    }

    /**
     * Gets the value of the aciklama10FONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA10FONT() {
        return aciklama10FONT;
    }

    /**
     * Sets the value of the aciklama10FONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA10FONT(String value) {
        this.aciklama10FONT = value;
    }

    /**
     * Gets the value of the aciklama10YATAYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA10YATAYBUYUTME() {
        return aciklama10YATAYBUYUTME;
    }

    /**
     * Sets the value of the aciklama10YATAYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA10YATAYBUYUTME(String value) {
        this.aciklama10YATAYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama10DUSEYBUYUTME property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA10DUSEYBUYUTME() {
        return aciklama10DUSEYBUYUTME;
    }

    /**
     * Sets the value of the aciklama10DUSEYBUYUTME property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA10DUSEYBUYUTME(String value) {
        this.aciklama10DUSEYBUYUTME = value;
    }

    /**
     * Gets the value of the aciklama10ACI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA10ACI() {
        return aciklama10ACI;
    }

    /**
     * Sets the value of the aciklama10ACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA10ACI(String value) {
        this.aciklama10ACI = value;
    }

    /**
     * Gets the value of the aciklama10YAZDIR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIKLAMA10YAZDIR() {
        return aciklama10YAZDIR;
    }

    /**
     * Sets the value of the aciklama10YAZDIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIKLAMA10YAZDIR(String value) {
        this.aciklama10YAZDIR = value;
    }

    /**
     * Gets the value of the barkodnorevfont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBARKODNOREVFONT() {
        return barkodnorevfont;
    }

    /**
     * Sets the value of the barkodnorevfont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBARKODNOREVFONT(String value) {
        this.barkodnorevfont = value;
    }

    /**
     * Gets the value of the acik1REVFONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIK1REVFONT() {
        return acik1REVFONT;
    }

    /**
     * Sets the value of the acik1REVFONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIK1REVFONT(String value) {
        this.acik1REVFONT = value;
    }

    /**
     * Gets the value of the acik2REVFONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIK2REVFONT() {
        return acik2REVFONT;
    }

    /**
     * Sets the value of the acik2REVFONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIK2REVFONT(String value) {
        this.acik2REVFONT = value;
    }

    /**
     * Gets the value of the acik3REVFONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIK3REVFONT() {
        return acik3REVFONT;
    }

    /**
     * Sets the value of the acik3REVFONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIK3REVFONT(String value) {
        this.acik3REVFONT = value;
    }

    /**
     * Gets the value of the acik4REVFONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIK4REVFONT() {
        return acik4REVFONT;
    }

    /**
     * Sets the value of the acik4REVFONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIK4REVFONT(String value) {
        this.acik4REVFONT = value;
    }

    /**
     * Gets the value of the acik5REVFONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIK5REVFONT() {
        return acik5REVFONT;
    }

    /**
     * Sets the value of the acik5REVFONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIK5REVFONT(String value) {
        this.acik5REVFONT = value;
    }

    /**
     * Gets the value of the acik6REVFONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIK6REVFONT() {
        return acik6REVFONT;
    }

    /**
     * Sets the value of the acik6REVFONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIK6REVFONT(String value) {
        this.acik6REVFONT = value;
    }

    /**
     * Gets the value of the acik7REVFONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIK7REVFONT() {
        return acik7REVFONT;
    }

    /**
     * Sets the value of the acik7REVFONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIK7REVFONT(String value) {
        this.acik7REVFONT = value;
    }

    /**
     * Gets the value of the acik8REVFONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIK8REVFONT() {
        return acik8REVFONT;
    }

    /**
     * Sets the value of the acik8REVFONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIK8REVFONT(String value) {
        this.acik8REVFONT = value;
    }

    /**
     * Gets the value of the acik9REVFONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIK9REVFONT() {
        return acik9REVFONT;
    }

    /**
     * Sets the value of the acik9REVFONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIK9REVFONT(String value) {
        this.acik9REVFONT = value;
    }

    /**
     * Gets the value of the acik10REVFONT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACIK10REVFONT() {
        return acik10REVFONT;
    }

    /**
     * Sets the value of the acik10REVFONT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACIK10REVFONT(String value) {
        this.acik10REVFONT = value;
    }

    /**
     * Gets the value of the yaziciip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYAZICIIP() {
        return yaziciip;
    }

    /**
     * Sets the value of the yaziciip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYAZICIIP(String value) {
        this.yaziciip = value;
    }

    /**
     * Gets the value of the yaziciport property.
     * 
     */
    public int getYAZICIPORT() {
        return yaziciport;
    }

    /**
     * Sets the value of the yaziciport property.
     * 
     */
    public void setYAZICIPORT(int value) {
        this.yaziciport = value;
    }

    /**
     * Gets the value of the baskioncesi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASKIONCESI() {
        return baskioncesi;
    }

    /**
     * Sets the value of the baskioncesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASKIONCESI(String value) {
        this.baskioncesi = value;
    }

    /**
     * Gets the value of the baskisonrasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASKISONRASI() {
        return baskisonrasi;
    }

    /**
     * Sets the value of the baskisonrasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASKISONRASI(String value) {
        this.baskisonrasi = value;
    }

    /**
     * Gets the value of the islemSonuc property.
     * 
     * @return
     *     possible object is
     *     {@link IslemSonuc }
     *     
     */
    public IslemSonuc getIslemSonuc() {
        return islemSonuc;
    }

    /**
     * Sets the value of the islemSonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IslemSonuc }
     *     
     */
    public void setIslemSonuc(IslemSonuc value) {
        this.islemSonuc = value;
    }

}
