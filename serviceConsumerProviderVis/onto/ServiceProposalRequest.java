package serviceConsumerProviderVis.onto;

import jade.content.Predicate;

public class ServiceProposalRequest implements Predicate {
	
	private static final long serialVersionUID = 1L;
	
	private String serviceName;

	public String getFirstCondition() {
		return firstCondition;
	}

	public void setFirstCondition(String firstCondition) {
		this.firstCondition = firstCondition;
	}

	public String getSecondCondition() {
		return secondCondition;
	}

	public void setSecondCondition(String secondCondition) {
		this.secondCondition = secondCondition;
	}

	public String getThirdCondition() {
		return thirdCondition;
	}

	public void setThirdCondition(String thirdCondition) {
		this.thirdCondition = thirdCondition;
	}

	private String firstCondition;
	private String secondCondition;
	private String thirdCondition;

	public ServiceProposalRequest() {
	}
	
	public ServiceProposalRequest(String serviceName, String firstCondition, String secondCondition, String thirdCondition) {
		this.serviceName = serviceName;
		this.firstCondition = firstCondition;
		this.secondCondition = secondCondition;
		this.thirdCondition = thirdCondition;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
