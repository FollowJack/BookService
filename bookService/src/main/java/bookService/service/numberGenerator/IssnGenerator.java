package bookService.service.numberGenerator;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;

import bookService.util.quaifier.EightDigits;
import bookService.util.quaifier.Loggable;

@EightDigits
public class IssnGenerator implements NumberGenerator{
	@Inject
	private Logger logger;
	
	@Loggable
	public String generateNumber() {
		String issn = "8-"+Math.abs(new Random().nextInt());
		logger.info("Generated ISSN : "+issn);
		return issn;
	}

}
