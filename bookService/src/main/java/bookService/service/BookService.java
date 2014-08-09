package bookService.service;

import javax.inject.Inject;

import bookService.model.Book;
import bookService.service.numberGenerator.NumberGenerator;
import bookService.util.quaifier.Loggable;
import bookService.util.quaifier.ThirteenDigits;


@Loggable
public class BookService {
	
	@Inject @ThirteenDigits
	private NumberGenerator numberGenerator;
	
	public Book createBook(String title, Float price, String description){
		Book book = new Book(title,price,description);
		book.setNumber(numberGenerator.generateNumber());
		return book;
	}
}
