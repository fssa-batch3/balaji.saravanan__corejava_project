package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserValidatorTest {

	@Test
	void testRegister() {
		User user1 = new User(1, "b2hack", "b2hack@gmai.com");
		User user2 = new User(2, "john", "john@gmail.com");
		User user3 = new User(3, "emma", "emma@gmail.com");

		Assertions.assertTrue(UserValidator.register(user1));

		try {
			UserValidator.register(null);
		} catch (UserAlreadyExistsException e) {
			Assertions.assertEquals("User Object Cannot be Null", e.getMessage());
		}

		Assertions.assertTrue(UserValidator.register(user3));
	}
}