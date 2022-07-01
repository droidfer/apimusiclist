package com.fjmg.listmusic.elements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MusicItem {
		
		@Id @GeneratedValue
		private Long id;
		private String useremail;
		private String musicname;
			
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUseremail() {
			return useremail;
		}
		public void setUseremail(String useremail) {
			this.useremail = useremail;
		}
		public String getMusicname() {
			return musicname;
		}
		public void setMusicname(String musicname) {
			this.musicname = musicname;
		}
		
		public void setMusicItem(String musicname, String useremail) {
			this.musicname = musicname;
			this.useremail = useremail;
		}
		
		
}
