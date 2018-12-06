
package bean;

public class Plan {
	private String planId;
	private String planName;
	private String type;
	private String planType;
	private String planSubType;
	private String amount;
	private String validity;
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public void setPlanSubType(String planSubType) {
		this.planSubType = planSubType;
	}
	public void setAmount(String string) {
		this.amount = string;
	}
	public void setValidity(String string) {
		this.validity = string;
	}
	public String getPlanId() {
		return planId;
	}
	public String getPlanName() {
		return planName;
	}
	public String getType() {
		return type;
	}
	public String getPlanType() {
		return planType;
	}
	public String getPlanSubType() {
		return planSubType;
	}
	public String getAmount() {
		return amount;
	}
	public String getValidity() {
		return validity;
	}

}
