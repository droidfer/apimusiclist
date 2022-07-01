package com.fjmg.listmusic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fjmg.listmusic.elements.GenrePojoDropdown;
import com.fjmg.listmusic.elements.MusicItem;
import com.fjmg.listmusic.elements.StatsMusic;


@RestController
public class ControllerApilistMusic {
		
	@Autowired private ServiceApilistMusic mService;
     

    @RequestMapping(value="/addmusic", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
    public MusicItem addMusic(String email, String genre) {
    	MusicItem music = new MusicItem();
    	music.setMusicItem(genre, email);
        return mService.addMusicItem(music);
    }
    
	@RequestMapping(value="/stats", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<StatsMusic> getStats() {
		return mService.countGenre();
	}
	
	@RequestMapping(value="/listgenre", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<GenrePojoDropdown> getListGenre() {
		return mService.listGenres();
	}
    
	@RequestMapping(value="/test", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String gethello() {
		return "REST Connect Sucess ";
	}
	
}
