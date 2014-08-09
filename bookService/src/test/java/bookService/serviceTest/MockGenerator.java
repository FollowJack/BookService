package bookService.serviceTest;

import java.util.Random;
import java.util.logging.Logger;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import bookService.service.numberGenerator.NumberGenerator;
import bookService.util.quaifier.Loggable;
import bookService.util.quaifier.ThirteenDigits;

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator{
	@Inject
	private Logger logger;
	
	@Loggable
	public String generateNumber() {
		String mock = "MOCK-"+Math.abs(new Random().nextInt());
		logger.info("Generated Mock : "+mock);
		return mock;
	}
}
