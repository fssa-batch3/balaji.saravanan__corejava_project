package day05.practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BankDetailsTest {
	
	Account account;
	
	@Test
	public void basicValue() {
		account= new Account("567890", 1100388);
		
	}

}
