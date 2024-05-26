package com.book.spring.angular;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.spring.angular.example.dto.Book;

@SpringBootApplication
@RestController
public class BookApplication {
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/findAllBooks")
	public List<Book> getBooks() {
		return Stream.of(new Book(101, "Java", 115),
				new Book(102, "Spring", 1155), new Book(103, "Hibernate", 450), 
				new Book(104, "JPA", 380),new Book(105, "Angular", 888)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

}
