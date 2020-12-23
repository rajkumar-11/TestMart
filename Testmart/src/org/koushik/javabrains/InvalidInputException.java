package org.koushik.javabrains;

public class InvalidInputException extends Exception {

	private String errorDetails;
	
	public InvalidInputException(String reason, String errorDetails) {
		super(reason);
		this.errorDetails = errorDetails;

		//Testing
		
	}
	
	public String getFaultInfo() {
		return errorDetails;
	}
	
}
