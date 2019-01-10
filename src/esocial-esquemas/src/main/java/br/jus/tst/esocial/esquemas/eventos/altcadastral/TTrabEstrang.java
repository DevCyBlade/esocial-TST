//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:23 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.altcadastral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Informa\u00e7\u00f5es do Trabalhador Estrangeiro
 * 
 * <p>Java class for TTrabEstrang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTrabEstrang">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtChegada" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="classTrabEstrang">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d{1,2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="casadoBr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[N|S]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="filhosBr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[N|S]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTrabEstrang", namespace = "http://www.esocial.gov.br/schema/evt/evtAltCadastral/v02_05_00", propOrder = {
    "dtChegada",
    "classTrabEstrang",
    "casadoBr",
    "filhosBr"
})
public class TTrabEstrang {

    protected XMLGregorianCalendar dtChegada;
    protected byte classTrabEstrang;
    @XmlElement(required = true)
    protected String casadoBr;
    @XmlElement(required = true)
    protected String filhosBr;

    /**
     * Gets the value of the dtChegada property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtChegada() {
        return dtChegada;
    }

    /**
     * Sets the value of the dtChegada property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtChegada(XMLGregorianCalendar value) {
        this.dtChegada = value;
    }

    /**
     * Gets the value of the classTrabEstrang property.
     * 
     */
    public byte getClassTrabEstrang() {
        return classTrabEstrang;
    }

    /**
     * Sets the value of the classTrabEstrang property.
     * 
     */
    public void setClassTrabEstrang(byte value) {
        this.classTrabEstrang = value;
    }

    /**
     * Gets the value of the casadoBr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasadoBr() {
        return casadoBr;
    }

    /**
     * Sets the value of the casadoBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasadoBr(String value) {
        this.casadoBr = value;
    }

    /**
     * Gets the value of the filhosBr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilhosBr() {
        return filhosBr;
    }

    /**
     * Sets the value of the filhosBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilhosBr(String value) {
        this.filhosBr = value;
    }

}
