//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 04:27:19 PM PST 
//


package org.enernoc.open.oadr2.app;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OASISReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OASISReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AS_RESULTS"/>
 *     &lt;enumeration value="AS_OP_RSRV"/>
 *     &lt;enumeration value="AS_REQ"/>
 *     &lt;enumeration value="BIDS_PUBLIC"/>
 *     &lt;enumeration value="CMMT_RA_MLC"/>
 *     &lt;enumeration value="CMMT_RMR"/>
 *     &lt;enumeration value="CRR_CLEARING"/>
 *     &lt;enumeration value="CRR_INVENTORY"/>
 *     &lt;enumeration value="ENE_EA"/>
 *     &lt;enumeration value="ENE_SLRS"/>
 *     &lt;enumeration value="ENE_HASP"/>
 *     &lt;enumeration value="ENE_IFM"/>
 *     &lt;enumeration value="ENE_MPM"/>
 *     &lt;enumeration value="ATL_PEAK_ON_OFF"/>
 *     &lt;enumeration value="ENE_RTM"/>
 *     &lt;enumeration value="ENE_RUC"/>
 *     &lt;enumeration value="ENE_LOSS"/>
 *     &lt;enumeration value="ENE_DISP"/>
 *     &lt;enumeration value="PRC_INTVL_AS"/>
 *     &lt;enumeration value="PRC_FUEL"/>
 *     &lt;enumeration value="PRC_LMP"/>
 *     &lt;enumeration value="PRC_HASP_LMP"/>
 *     &lt;enumeration value="PRC_AS"/>
 *     &lt;enumeration value="PRC_CNSTR"/>
 *     &lt;enumeration value="PRC_NOMOGRAM"/>
 *     &lt;enumeration value="PRC_INTVL_LMP"/>
 *     &lt;enumeration value="PRC_HRLY_CNSTR"/>
 *     &lt;enumeration value="PRC_INTVL_CNSTR"/>
 *     &lt;enumeration value="PRC_CURR_LMP"/>
 *     &lt;enumeration value="PRC_CURR_HUB_LMP"/>
 *     &lt;enumeration value="PRC_ADV_LMP"/>
 *     &lt;enumeration value="PRC_RTM_FLOWGATE"/>
 *     &lt;enumeration value="PRC_RTM_NOMOGRAM"/>
 *     &lt;enumeration value="PRC_ADV_LMP"/>
 *     &lt;enumeration value="SLD_FCST"/>
 *     &lt;enumeration value="SLD_FCST_PEAK"/>
 *     &lt;enumeration value="SLD_MKTS"/>
 *     &lt;enumeration value="TRNS_ATC"/>
 *     &lt;enumeration value="TRNS_OUTAGE"/>
 *     &lt;enumeration value="TRNS_USAGE"/>
 *     &lt;enumeration value="TRNS_CURR_USAGE"/>
 *     &lt;enumeration value="PRC_DS_REF"/>
 *     &lt;enumeration value="ENE_CB_AWARDS"/>
 *     &lt;enumeration value="ENE_CB_CLR_AWARDS"/>
 *     &lt;enumeration value="ENE_CB_MKT_SUM"/>
 *     &lt;enumeration value="PRC_REF_PRICES"/>
 *     &lt;enumeration value="CB_NODAL_GRP_CNSTR_PRC"/>
 *     &lt;enumeration value="CB_NODAL_LIMITS"/>
 *     &lt;enumeration value="PRC_FLEX_RAMP"/>
 *     &lt;enumeration value="PRC_CD_INTVL_LMP"/>
 *     &lt;enumeration value="PRC_CD_RTM_FLOWGATE"/>
 *     &lt;enumeration value="PRC_CD_RTM_NOMOGRAM"/>
 *     &lt;enumeration value="ENE_CD_SLRS"/>
 *     &lt;enumeration value="PRC_MPM_CNSTR"/>
 *     &lt;enumeration value="PRC_MPM_CNSTR_CMP"/>
 *     &lt;enumeration value="PRC_MPM_NOMOGRAM"/>
 *     &lt;enumeration value="PRC_MPM_NOMOGRAM_CMP"/>
 *     &lt;enumeration value="PRC_MPM_RTM_FLOWGATE"/>
 *     &lt;enumeration value="PRC_MPM_RTM_FLOWGATE_CMP"/>
 *     &lt;enumeration value="PRC_MPM_LMP"/>
 *     &lt;enumeration value="PRC_MPM_RTM_LMP"/>
 *     &lt;enumeration value="PRC_MPM_RTM_NOMOGRAM"/>
 *     &lt;enumeration value="PRC_MPM_RTM_NOMOGRAM_CMP"/>
 *     &lt;enumeration value="PRC_MPM_RTM_REF_BUS"/>
 *     &lt;enumeration value="PRC_MPM_REF_BUS"/>
 *     &lt;enumeration value="PUB_CRR_BID"/>
 *     &lt;enumeration value="SLD_REN_FCST"/>
 *     &lt;enumeration value="AGGR_OUTAGE_SCH"/>
 *     &lt;enumeration value="PRC_GHG_ALLOWANCE"/>
 *     &lt;enumeration value="AS_MILEAGE_CALC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OASISReportType")
@XmlEnum
public enum OASISReportType {

    AS_RESULTS,
    AS_OP_RSRV,
    AS_REQ,
    BIDS_PUBLIC,
    CMMT_RA_MLC,
    CMMT_RMR,
    CRR_CLEARING,
    CRR_INVENTORY,
    ENE_EA,
    ENE_SLRS,
    ENE_HASP,
    ENE_IFM,
    ENE_MPM,
    ATL_PEAK_ON_OFF,
    ENE_RTM,
    ENE_RUC,
    ENE_LOSS,
    ENE_DISP,
    PRC_INTVL_AS,
    PRC_FUEL,
    PRC_LMP,
    PRC_HASP_LMP,
    PRC_AS,
    PRC_CNSTR,
    PRC_NOMOGRAM,
    PRC_INTVL_LMP,
    PRC_HRLY_CNSTR,
    PRC_INTVL_CNSTR,
    PRC_CURR_LMP,
    PRC_CURR_HUB_LMP,
    PRC_ADV_LMP,
    PRC_RTM_FLOWGATE,
    PRC_RTM_NOMOGRAM,
    SLD_FCST,
    SLD_FCST_PEAK,
    SLD_MKTS,
    TRNS_ATC,
    TRNS_OUTAGE,
    TRNS_USAGE,
    TRNS_CURR_USAGE,
    PRC_DS_REF,
    ENE_CB_AWARDS,
    ENE_CB_CLR_AWARDS,
    ENE_CB_MKT_SUM,
    PRC_REF_PRICES,
    CB_NODAL_GRP_CNSTR_PRC,
    CB_NODAL_LIMITS,
    PRC_FLEX_RAMP,
    PRC_CD_INTVL_LMP,
    PRC_CD_RTM_FLOWGATE,
    PRC_CD_RTM_NOMOGRAM,
    ENE_CD_SLRS,
    PRC_MPM_CNSTR,
    PRC_MPM_CNSTR_CMP,
    PRC_MPM_NOMOGRAM,
    PRC_MPM_NOMOGRAM_CMP,
    PRC_MPM_RTM_FLOWGATE,
    PRC_MPM_RTM_FLOWGATE_CMP,
    PRC_MPM_LMP,
    PRC_MPM_RTM_LMP,
    PRC_MPM_RTM_NOMOGRAM,
    PRC_MPM_RTM_NOMOGRAM_CMP,
    PRC_MPM_RTM_REF_BUS,
    PRC_MPM_REF_BUS,
    PUB_CRR_BID,
    SLD_REN_FCST,
    AGGR_OUTAGE_SCH,
    PRC_GHG_ALLOWANCE,
    AS_MILEAGE_CALC;

    public String value() {
        return name();
    }

    public static OASISReportType fromValue(String v) {
        return valueOf(v);
    }

}