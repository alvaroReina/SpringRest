package com.formal.bookmarks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringestApplication.class, args);
	}

	@Bean
	CommandLineRunner init(AccountRepository accountRepository, BookmarkRepository bookmarkRepository){
		return (evt) -> Arrays.asList(
				"JohnCena,JeffFromTheOverwatchTeam,BobEsponja,Echenique".split(",")
		).forEach(a -> {
			Account account = accountRepository.save(new Account(a, "password"));
			bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/1/" + a, "Una descripcion"));
			bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/2/" + a, "A descripcion"));
		});
	}

}
