//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 04:27:19 PM PST 
//


package org.enernoc.open.oadr2.app;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ERROR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ERROR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ERR_CODE" type="{http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd}OASISErrCode" minOccurs="0"/>
 *         &lt;element name="ERR_DESC" type="{http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd}OASISErrDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ERROR", propOrder = {
    "errcode",
    "errdesc"
})
@Entity(name = "ERROR")
@Table(name = "ERROR")
@Inheritance(strategy = InheritanceType.JOINED)
public class ERROR implements Equals, HashCode, ToString
{

    @XmlElementRef(name = "ERR_CODE", namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", type = JAXBElement.class)
    protected JAXBElement<String> errcode;
    @XmlElementRef(name = "ERR_DESC", namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", type = JAXBElement.class)
    protected JAXBElement<OASISErrDescription> errdesc;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Default no-arg constructor
     * 
     */
    public ERROR() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ERROR(final JAXBElement<String> errcode, final JAXBElement<OASISErrDescription> errdesc) {
        this.errcode = errcode;
        this.errdesc = errdesc;
    }

    /**
     * Gets the value of the errcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Transient
    public JAXBElement<String> getERRCODE() {
        return errcode;
    }

    /**
     * Sets the value of the errcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setERRCODE(JAXBElement<String> value) {
        this.errcode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the errdesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OASISErrDescription }{@code >}
     *     
     */
    @Transient
    public JAXBElement<OASISErrDescription> getERRDESC() {
        return errdesc;
    }

    /**
     * Sets the value of the errdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OASISErrDescription }{@code >}
     *     
     */
    public void setERRDESC(JAXBElement<OASISErrDescription> value) {
        this.errdesc = ((JAXBElement<OASISErrDescription> ) value);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            JAXBElement<String> theERRCODE;
            theERRCODE = this.getERRCODE();
            strategy.appendField(locator, this, "errcode", buffer, theERRCODE);
        }
        {
            JAXBElement<OASISErrDescription> theERRDESC;
            theERRDESC = this.getERRDESC();
            strategy.appendField(locator, this, "errdesc", buffer, theERRDESC);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ERROR)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ERROR that = ((ERROR) object);
        {
            JAXBElement<String> lhsERRCODE;
            lhsERRCODE = this.getERRCODE();
            JAXBElement<String> rhsERRCODE;
            rhsERRCODE = that.getERRCODE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errcode", lhsERRCODE), LocatorUtils.property(thatLocator, "errcode", rhsERRCODE), lhsERRCODE, rhsERRCODE)) {
                return false;
            }
        }
        {
            JAXBElement<OASISErrDescription> lhsERRDESC;
            lhsERRDESC = this.getERRDESC();
            JAXBElement<OASISErrDescription> rhsERRDESC;
            rhsERRDESC = that.getERRDESC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errdesc", lhsERRDESC), LocatorUtils.property(thatLocator, "errdesc", rhsERRDESC), lhsERRDESC, rhsERRDESC)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            JAXBElement<String> theERRCODE;
            theERRCODE = this.getERRCODE();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errcode", theERRCODE), currentHashCode, theERRCODE);
        }
        {
            JAXBElement<OASISErrDescription> theERRDESC;
            theERRDESC = this.getERRDESC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errdesc", theERRDESC), currentHashCode, theERRDESC);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public ERROR withERRCODE(JAXBElement<String> value) {
        setERRCODE(value);
        return this;
    }

    public ERROR withERRDESC(JAXBElement<OASISErrDescription> value) {
        setERRDESC(value);
        return this;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @Basic
    @Column(name = "ERRCODEITEM", length = 255)
    public String getERRCODEItem() {
        return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends String> ) this.getERRCODE()));
    }

    public void setERRCODEItem(String target) {
        setERRCODE(XmlAdapterUtils.marshallJAXBElement(String.class, new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "ERR_CODE"), ERROR.class, target));
    }

    @Basic
    @Column(name = "ERRDESCITEM", length = 255)
    @Enumerated(EnumType.STRING)
    public OASISErrDescription getERRDESCItem() {
        return XmlAdapterUtils.unmarshallJAXBElement(((JAXBElement<? extends OASISErrDescription> ) this.getERRDESC()));
    }

    public void setERRDESCItem(OASISErrDescription target) {
        setERRDESC(XmlAdapterUtils.marshallJAXBElement(OASISErrDescription.class, new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "ERR_DESC"), ERROR.class, target));
    }

}
