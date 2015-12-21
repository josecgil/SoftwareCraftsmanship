import cucumber.api.java8.En;

import static org.junit.Assert.*;

public class DepositStepDefinitions implements En {

	private Account account=null;
	
	public DepositStepDefinitions() {
		Given("^a User has no money in their account$", () -> {
	        account=new Account();
        });
		
		Given("^a User has (\\d+)€ in their account$", (Integer initialAmount) -> {
	        account=new Account(initialAmount);
        });
		
		
		When("^(\\d+)€ is deposited in to the account$", (Integer amount) -> {
	        account.deposit(amount);
        });

		Then("^the balance should be (\\d+)€$", (Integer balance) -> {
			assertEquals(balance.intValue(),account.getBalance());
        });

	}
}