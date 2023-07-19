package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testEmailException {

	@Test

	public void testValidEmail() {
		String email = "balajis@gmail.com";
		try {
			boolean vaild = EmailValidator.validEmail(email);
			Assertions.assertTrue(vaild);
		} catch (InvalidEmailException e) {
			Assertions.fail("Valid email should not throw an exception");
		}

	}

}
