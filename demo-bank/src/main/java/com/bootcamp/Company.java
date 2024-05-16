package com.bootcamp;

public class Company extends AccountHolder {
	private String companyName;
	

	public Company(String companyName, int taxId) {
		super(taxId);
		
		// complete the function
		
		this.companyName=companyName;
		
		
	}

	public String getCompanyName() {
		// complete the function
		if(this.companyName.equals(null)){
			return null;
		}
		return this.companyName;
		
	}
}
