package com.reporting.webapi.response.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "reportByACAEligibleCount")
public class ReportsByACAEligibleCountVO implements Serializable{

	private static final long serialVersionUID = 1534318064993488021L;
	
	@XmlElement(name = "controlGroup")
	private String CONTROL_GROUP;
	@XmlElement(name = "mostRecentProductionCompany")
	private String MOST_RECENT_PRODUCTION_COMPANY;
	@XmlElement(name = "mostRecentProject")
	private String MOST_RECENT_PROJECT;
	@XmlElement(name = "ssnNumber")
	private String SSN_NUMBER;
	@XmlElement(name = "firstName")
	private String FIRST_NAME;
	@XmlElement(name = "lastName")
	private String LAST_NAME;
	@XmlElement(name = "lastWorkedDate")
	private String LAST_WORKED_DATE;
	@XmlElement(name = "hireDate")
	private String HIRE_DATE;
	@XmlElement(name = "unionType")
	private String UNION_NON_UNION;
	@XmlElement(name = "payrollSource")
	private String PAYROLL_SOURCE;
	@XmlElement(name = "avgHours")
	private String AVERAGE_HOURS;
	@XmlElement(name = "totalHours")
	private String TOTAL_HOURS_WEEKS;
	public String getCONTROL_GROUP() {
		return CONTROL_GROUP;
	}
	public void setCONTROL_GROUP(String cONTROL_GROUP) {
		CONTROL_GROUP = cONTROL_GROUP;
	}
	public String getMOST_RECENT_PRODUCTION_COMPANY() {
		return MOST_RECENT_PRODUCTION_COMPANY;
	}
	public void setMOST_RECENT_PRODUCTION_COMPANY(String mOST_RECENT_PRODUCTION_COMPANY) {
		MOST_RECENT_PRODUCTION_COMPANY = mOST_RECENT_PRODUCTION_COMPANY;
	}
	public String getMOST_RECENT_PROJECT() {
		return MOST_RECENT_PROJECT;
	}
	public void setMOST_RECENT_PROJECT(String mOST_RECENT_PROJECT) {
		MOST_RECENT_PROJECT = mOST_RECENT_PROJECT;
	}
	public String getSSN_NUMBER() {
		return SSN_NUMBER;
	}
	public void setSSN_NUMBER(String sSN_NUMBER) {
		SSN_NUMBER = sSN_NUMBER;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getLAST_WORKED_DATE() {
		return LAST_WORKED_DATE;
	}
	public void setLAST_WORKED_DATE(String lAST_WORKED_DATE) {
		LAST_WORKED_DATE = lAST_WORKED_DATE;
	}
	public String getHIRE_DATE() {
		return HIRE_DATE;
	}
	public void setHIRE_DATE(String hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}
	public String getUNION_NON_UNION() {
		return UNION_NON_UNION;
	}
	public void setUNION_NON_UNION(String uNION_NON_UNION) {
		UNION_NON_UNION = uNION_NON_UNION;
	}
	public String getPAYROLL_SOURCE() {
		return PAYROLL_SOURCE;
	}
	public void setPAYROLL_SOURCE(String pAYROLL_SOURCE) {
		PAYROLL_SOURCE = pAYROLL_SOURCE;
	}
	public String getAVERAGE_HOURS() {
		return AVERAGE_HOURS;
	}
	public void setAVERAGE_HOURS(String aVERAGE_HOURS) {
		AVERAGE_HOURS = aVERAGE_HOURS;
	}
	public String getTOTAL_HOURS_WEEKS() {
		return TOTAL_HOURS_WEEKS;
	}
	public void setTOTAL_HOURS_WEEKS(String tOTAL_HOURS_WEEKS) {
		TOTAL_HOURS_WEEKS = tOTAL_HOURS_WEEKS;
	}
	
	
}
