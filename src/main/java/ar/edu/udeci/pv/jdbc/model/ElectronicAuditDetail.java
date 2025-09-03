package ar.edu.udeci.pv.jdbc.model;

import java.sql.Timestamp;

public class ElectronicAuditDetail {

	private String terminalId;
	private Integer transactionId;
	private String userId;
	private String detailed;
	private String description;
	private String code;
	private String process;
	private String subProcess;
	private String stackTrace;
	private Timestamp timestamp;


	public ElectronicAuditDetail(String terminalId, String userId, String details, String auditType, String dateAudi, String transactionNumber, String auditCode, String auditProcess, String auditSubProcess, String stackTrace) {
		this.terminalId = terminalId;
		this.userId = userId;
		this.detailed = detailed;
		this.description = description;
		this.code = code;
		this.process = process;
		this.subProcess = subProcess;
		this.timestamp = timestamp;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDetailed() {
		return detailed;
	}

	public void setDetailed(String detailed) {
		this.detailed = detailed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getSubProcess() {
		return subProcess;
	}

	public void setSubProcess(String subProcess) {
		this.subProcess = subProcess;
	}

	public String getStackTrace() {
		return stackTrace;
	}

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}
