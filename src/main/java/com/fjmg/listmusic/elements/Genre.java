package com.fjmg.listmusic.elements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genre {
		
		@Id @GeneratedValue
		private Long id;
		private String genre;
		
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
					
}
