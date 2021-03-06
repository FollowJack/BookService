package bookService.integration;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;

import bookService.model.Address;

public class AddressIntegrationTest {
	@Test
	public void shouldRaiseConstraintViolationCauseInvalidZipCode() {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		
		Address address = new Address("233 Spring Street", "New York", "NY",
				"DummyZip", "USA");
		Set<ConstraintViolation<Address>> violations = validator
				.validate(address);
		assertEquals(1, violations.size());
		((Object) validatorFactory).close();
	}
}
