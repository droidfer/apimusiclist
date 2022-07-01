package com.fjmg.listmusic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fjmg.listmusic.elements.Genre;
import com.fjmg.listmusic.elements.GenreRepository;


@SpringBootApplication
public class ApilistmusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApilistmusicApplication.class, args);
	}
	

	@Bean
	CommandLineRunner runner (GenreRepository repository) {
		return args->{
			
			//On start configure the genres in the DB			
			String[] strGenres=new String[] {"Rock", "Jazz", "Clasica"};
			
			for(String strGenre : strGenres) {
		    	Genre genre = new Genre();
		    	genre.setGenre(strGenre);
				repository.save(genre);
			}
						
		};
		
	}

}
