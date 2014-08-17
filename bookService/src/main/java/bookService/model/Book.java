package bookService.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {
	 @NotNull
	 private String title;
	 @NotNull @Min(2)
	 private Float price;
	 @Size(max = 2000)
	 private String description;
	 private String isbn;
	 private Integer nbOfPage;
	 private String number;
	
	
	public Book(String title, Float price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return description +","+number+","+title;
	}
	
	
	
}
