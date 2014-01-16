//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 04:27:19 PM PST 
//


package org.enernoc.open.oadr2.app;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.enernoc.open.oadr2.app package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OASISReport_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "OASISReport");
    private final static QName _REPORTHEADEROASISUOM_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "UOM");
    private final static QName _REPORTHEADEROASISCRRMKTNAME_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "CRR_MKT_NAME");
    private final static QName _REPORTHEADEROASISEXECUTIONTYPE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "EXECUTION_TYPE");
    private final static QName _REPORTHEADEROASISMKTTYPE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "MKT_TYPE");
    private final static QName _ERRORERRDESC_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "ERR_DESC");
    private final static QName _ERRORERRCODE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "ERR_CODE");
    private final static QName _REPORTDATAOASISSTATUSTYPE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "STATUS_TYPE");
    private final static QName _REPORTDATAOASISPUBLISHTIME_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "PUBLISH_TIME");
    private final static QName _REPORTDATAOASISINVENTORYDATETIME_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "INVENTORY_DATE_TIME");
    private final static QName _REPORTDATAOASISOPRDATE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "OPR_DATE");
    private final static QName _REPORTDATAOASISLIMITTYPE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "LIMIT_TYPE");
    private final static QName _REPORTDATAOASISOUTAGEHOUR_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "OUTAGE_HOUR");
    private final static QName _REPORTDATAOASISSTARTDATE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "START_DATE");
    private final static QName _REPORTDATAOASISPHYSICALTYPE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "PHYSICAL_TYPE");
    private final static QName _REPORTDATAOASISENDDATETIME_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "END_DATE_TIME");
    private final static QName _REPORTDATAOASISMKTSTARTHE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "MKT_START_HE");
    private final static QName _REPORTDATAOASISEFFQTRENDDT_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "EFF_QTR_END_DT");
    private final static QName _REPORTDATAOASISCONSTRAINTGROUPNAME_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "CONSTRAINT_GROUP_NAME");
    private final static QName _REPORTDATAOASISSTARTHE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "START_HE");
    private final static QName _REPORTDATAOASISINTERVALNUM_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "INTERVAL_NUM");
    private final static QName _REPORTDATAOASISSVALUE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "SVALUE");
    private final static QName _REPORTDATAOASISREASON_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "REASON");
    private final static QName _REPORTDATAOASISINTSTARTTIME_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "INT_START_TIME");
    private final static QName _REPORTDATAOASISSINK_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "SINK");
    private final static QName _REPORTDATAOASISMKTRUNSTARTTIME_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "MKT_RUN_START_TIME");
    private final static QName _REPORTDATAOASISNOTES_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "NOTES");
    private final static QName _REPORTDATAOASISGASFLOWDATE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "GAS_FLOW_DATE");
    private final static QName _REPORTDATAOASISCRROPTION_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "CRR_OPTION");
    private final static QName _REPORTDATAOASISCATEGORY_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "CATEGORY");
    private final static QName _REPORTDATAOASISMINIMUMLIMIT_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "MINIMUM_LIMIT");
    private final static QName _REPORTDATAOASISMAXIMUMLIMIT_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "MAXIMUM_LIMIT");
    private final static QName _REPORTDATAOASISSOURCE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "SOURCE");
    private final static QName _REPORTDATAOASISSTARTDATETIME_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "START_DATE_TIME");
    private final static QName _REPORTDATAOASISENDHE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "END_HE");
    private final static QName _REPORTDATAOASISVALUE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "VALUE");
    private final static QName _REPORTDATAOASISRESOURCENAME_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "RESOURCE_NAME");
    private final static QName _REPORTDATAOASISINTOPRHR_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "INT_OPR_HR");
    private final static QName _REPORTDATAOASISCRRSEGMENT_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "CRR_SEGMENT");
    private final static QName _REPORTDATAOASISCRRNSR_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "CRR_NSR");
    private final static QName _REPORTDATAOASISDIRECTION_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "DIRECTION");
    private final static QName _REPORTDATAOASISOPTION_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "OPTION");
    private final static QName _REPORTDATAOASISEFFQTRSTARTDT_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "EFF_QTR_START_DT");
    private final static QName _REPORTDATAOASISENDDATE_QNAME = new QName("http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", "END_DATE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.enernoc.open.oadr2.app
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OASISReport }
     * 
     */
    public OASISReport createOASISReport() {
        return new OASISReport();
    }

    /**
     * Create an instance of {@link DISCLAIMERITEMRq }
     * 
     */
    public DISCLAIMERITEMRq createDISCLAIMERITEMRq() {
        return new DISCLAIMERITEMRq();
    }

    /**
     * Create an instance of {@link MessagePayload }
     * 
     */
    public MessagePayload createMessagePayload() {
        return new MessagePayload();
    }

    /**
     * Create an instance of {@link RTO }
     * 
     */
    public RTO createRTO() {
        return new RTO();
    }

    /**
     * Create an instance of {@link REPORTITEM }
     * 
     */
    public REPORTITEM createREPORTITEM() {
        return new REPORTITEM();
    }

    /**
     * Create an instance of {@link REPORTDATAOASIS }
     * 
     */
    public REPORTDATAOASIS createREPORTDATAOASIS() {
        return new REPORTDATAOASIS();
    }

    /**
     * Create an instance of {@link REPORTHEADEROASIS }
     * 
     */
    public REPORTHEADEROASIS createREPORTHEADEROASIS() {
        return new REPORTHEADEROASIS();
    }

    /**
     * Create an instance of {@link ERROR }
     * 
     */
    public ERROR createERROR() {
        return new ERROR();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OASISReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "OASISReport")
    public JAXBElement<OASISReport> createOASISReport(OASISReport value) {
        return new JAXBElement<OASISReport>(_OASISReport_QNAME, OASISReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "UOM", scope = REPORTHEADEROASIS.class)
    public JAXBElement<String> createREPORTHEADEROASISUOM(String value) {
        return new JAXBElement<String>(_REPORTHEADEROASISUOM_QNAME, String.class, REPORTHEADEROASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "CRR_MKT_NAME", scope = REPORTHEADEROASIS.class)
    public JAXBElement<String> createREPORTHEADEROASISCRRMKTNAME(String value) {
        return new JAXBElement<String>(_REPORTHEADEROASISCRRMKTNAME_QNAME, String.class, REPORTHEADEROASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "EXECUTION_TYPE", scope = REPORTHEADEROASIS.class)
    public JAXBElement<String> createREPORTHEADEROASISEXECUTIONTYPE(String value) {
        return new JAXBElement<String>(_REPORTHEADEROASISEXECUTIONTYPE_QNAME, String.class, REPORTHEADEROASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "MKT_TYPE", scope = REPORTHEADEROASIS.class)
    public JAXBElement<String> createREPORTHEADEROASISMKTTYPE(String value) {
        return new JAXBElement<String>(_REPORTHEADEROASISMKTTYPE_QNAME, String.class, REPORTHEADEROASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OASISErrDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "ERR_DESC", scope = ERROR.class)
    public JAXBElement<OASISErrDescription> createERRORERRDESC(OASISErrDescription value) {
        return new JAXBElement<OASISErrDescription>(_ERRORERRDESC_QNAME, OASISErrDescription.class, ERROR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "ERR_CODE", scope = ERROR.class)
    public JAXBElement<String> createERRORERRCODE(String value) {
        return new JAXBElement<String>(_ERRORERRCODE_QNAME, String.class, ERROR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "STATUS_TYPE", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISSTATUSTYPE(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISSTATUSTYPE_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "PUBLISH_TIME", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISPUBLISHTIME(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISPUBLISHTIME_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "INVENTORY_DATE_TIME", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISINVENTORYDATETIME(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISINVENTORYDATETIME_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "OPR_DATE", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISOPRDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISOPRDATE_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "LIMIT_TYPE", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISLIMITTYPE(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISLIMITTYPE_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "OUTAGE_HOUR", scope = REPORTDATAOASIS.class)
    public JAXBElement<BigInteger> createREPORTDATAOASISOUTAGEHOUR(BigInteger value) {
        return new JAXBElement<BigInteger>(_REPORTDATAOASISOUTAGEHOUR_QNAME, BigInteger.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "START_DATE", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISSTARTDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISSTARTDATE_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "PHYSICAL_TYPE", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISPHYSICALTYPE(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISPHYSICALTYPE_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "END_DATE_TIME", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISENDDATETIME(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISENDDATETIME_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "MKT_START_HE", scope = REPORTDATAOASIS.class)
    public JAXBElement<BigInteger> createREPORTDATAOASISMKTSTARTHE(BigInteger value) {
        return new JAXBElement<BigInteger>(_REPORTDATAOASISMKTSTARTHE_QNAME, BigInteger.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "EFF_QTR_END_DT", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISEFFQTRENDDT(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISEFFQTRENDDT_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "CONSTRAINT_GROUP_NAME", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISCONSTRAINTGROUPNAME(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISCONSTRAINTGROUPNAME_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "START_HE", scope = REPORTDATAOASIS.class)
    public JAXBElement<BigInteger> createREPORTDATAOASISSTARTHE(BigInteger value) {
        return new JAXBElement<BigInteger>(_REPORTDATAOASISSTARTHE_QNAME, BigInteger.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "INTERVAL_NUM", scope = REPORTDATAOASIS.class)
    public JAXBElement<BigInteger> createREPORTDATAOASISINTERVALNUM(BigInteger value) {
        return new JAXBElement<BigInteger>(_REPORTDATAOASISINTERVALNUM_QNAME, BigInteger.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "SVALUE", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISSVALUE(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISSVALUE_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "REASON", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISREASON(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISREASON_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "INT_START_TIME", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISINTSTARTTIME(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISINTSTARTTIME_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "SINK", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISSINK(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISSINK_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "MKT_RUN_START_TIME", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISMKTRUNSTARTTIME(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISMKTRUNSTARTTIME_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "NOTES", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISNOTES(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISNOTES_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "GAS_FLOW_DATE", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISGASFLOWDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISGASFLOWDATE_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "CRR_OPTION", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISCRROPTION(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISCRROPTION_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "CATEGORY", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISCATEGORY(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISCATEGORY_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "MINIMUM_LIMIT", scope = REPORTDATAOASIS.class)
    public JAXBElement<Double> createREPORTDATAOASISMINIMUMLIMIT(Double value) {
        return new JAXBElement<Double>(_REPORTDATAOASISMINIMUMLIMIT_QNAME, Double.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "MAXIMUM_LIMIT", scope = REPORTDATAOASIS.class)
    public JAXBElement<Double> createREPORTDATAOASISMAXIMUMLIMIT(Double value) {
        return new JAXBElement<Double>(_REPORTDATAOASISMAXIMUMLIMIT_QNAME, Double.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "SOURCE", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISSOURCE(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISSOURCE_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "START_DATE_TIME", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISSTARTDATETIME(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISSTARTDATETIME_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "END_HE", scope = REPORTDATAOASIS.class)
    public JAXBElement<BigInteger> createREPORTDATAOASISENDHE(BigInteger value) {
        return new JAXBElement<BigInteger>(_REPORTDATAOASISENDHE_QNAME, BigInteger.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "VALUE", scope = REPORTDATAOASIS.class)
    public JAXBElement<Double> createREPORTDATAOASISVALUE(Double value) {
        return new JAXBElement<Double>(_REPORTDATAOASISVALUE_QNAME, Double.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "RESOURCE_NAME", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISRESOURCENAME(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISRESOURCENAME_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "INT_OPR_HR", scope = REPORTDATAOASIS.class)
    public JAXBElement<BigInteger> createREPORTDATAOASISINTOPRHR(BigInteger value) {
        return new JAXBElement<BigInteger>(_REPORTDATAOASISINTOPRHR_QNAME, BigInteger.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "CRR_SEGMENT", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISCRRSEGMENT(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISCRRSEGMENT_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "CRR_NSR", scope = REPORTDATAOASIS.class)
    public JAXBElement<Double> createREPORTDATAOASISCRRNSR(Double value) {
        return new JAXBElement<Double>(_REPORTDATAOASISCRRNSR_QNAME, Double.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "DIRECTION", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISDIRECTION(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISDIRECTION_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "OPTION", scope = REPORTDATAOASIS.class)
    public JAXBElement<String> createREPORTDATAOASISOPTION(String value) {
        return new JAXBElement<String>(_REPORTDATAOASISOPTION_QNAME, String.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "EFF_QTR_START_DT", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISEFFQTRSTARTDT(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISEFFQTRSTARTDT_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oasis.caiso.com/mrtu-oasis/xsd/OASISReport.xsd", name = "END_DATE", scope = REPORTDATAOASIS.class)
    public JAXBElement<XMLGregorianCalendar> createREPORTDATAOASISENDDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_REPORTDATAOASISENDDATE_QNAME, XMLGregorianCalendar.class, REPORTDATAOASIS.class, value);
    }

}
