package org.tat.gginl.api.common.emumdata;

public enum AgentCommissionEntryType {

	UNDERWRITING("Underwriting"), 
	ENDORSEMENT("Endorsement"), 
	RENEWAL("Renewal"),
	RENEWAL_FIRST("Renewal First");

	private String label;

	private AgentCommissionEntryType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
