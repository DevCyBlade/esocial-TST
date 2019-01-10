//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:46 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.tabprocesso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informa\u00e7\u00f5es de Identifica\u00e7\u00e3o do Processo e Validade das Informa\u00e7\u00f5es
 * 
 * <p>Java class for TIdeProcesso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIdeProcesso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpProc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;pattern value="\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nrProc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="21"/>
 *               &lt;whiteSpace value="preserve"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="iniValid">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fimValid" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[2]{1}\d{3}-(1[0-2]|0[1-9])"/>
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
@XmlType(name = "TIdeProcesso", namespace = "http://www.esocial.gov.br/schema/evt/evtTabProcesso/v02_05_00", propOrder = {
    "tpProc",
    "nrProc",
    "iniValid",
    "fimValid"
})
public class TIdeProcesso {

    protected byte tpProc;
    @XmlElement(required = true)
    protected String nrProc;
    @XmlElement(required = true)
    protected String iniValid;
    protected String fimValid;

    /**
     * Gets the value of the tpProc property.
     * 
     */
    public byte getTpProc() {
        return tpProc;
    }

    /**
     * Sets the value of the tpProc property.
     * 
     */
    public void setTpProc(byte value) {
        this.tpProc = value;
    }

    /**
     * Gets the value of the nrProc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProc() {
        return nrProc;
    }

    /**
     * Sets the value of the nrProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProc(String value) {
        this.nrProc = value;
    }

    /**
     * Gets the value of the iniValid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIniValid() {
        return iniValid;
    }

    /**
     * Sets the value of the iniValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIniValid(String value) {
        this.iniValid = value;
    }

    /**
     * Gets the value of the fimValid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFimValid() {
        return fimValid;
    }

    /**
     * Sets the value of the fimValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFimValid(String value) {
        this.fimValid = value;
    }

}
