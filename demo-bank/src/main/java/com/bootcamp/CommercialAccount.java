package com.bootcamp;

import java.util.ArrayList;
import java.util.List;

/**
 * Account implementation for commercial (business) customers.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #authorizedUsers}: List&lt;Person&gt;<br>
 */
public class CommercialAccount extends Account {
	private List<Person> authorizedUsers;
	
	public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
		super(company, accountNumber, pin, startingDeposit);
		this.authorizedUsers=new ArrayList<>();
		
// complete the function
	}

	/**
	 * @param person The authorized user to add to the account.
	 */
	protected void addAuthorizedUser(Person person) {
		this.authorizedUsers.add(person);
		// complete the function
	}

	/**
	 * @param person
	 * @return true if person matches an authorized user in
	 *         {@link #authorizedUsers}; otherwise, false.
	 */
	public boolean isAuthorizedUser(Person person) {
		// complete the function
		for(int i=0;i<this.authorizedUsers.size();i++){
			if(person.equals(this.authorizedUsers.get(i))){
				return true;
			}
		}
		return false;
	}
}
