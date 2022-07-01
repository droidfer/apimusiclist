package com.fjmg.listmusic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fjmg.listmusic.elements.Genre;
import com.fjmg.listmusic.elements.GenrePojoDropdown;
import com.fjmg.listmusic.elements.GenreRepository;
import com.fjmg.listmusic.elements.MusicItem;
import com.fjmg.listmusic.elements.MusicItemRepository;
import com.fjmg.listmusic.elements.StatsMusic;

@Service
public class ServiceApilistMusic {
	
    private final MusicItemRepository mrepository;
    private final GenreRepository grepository;

    public ServiceApilistMusic(MusicItemRepository mrepository, GenreRepository grepository) {
        this.mrepository = mrepository;
        this.grepository = grepository;
    }    
    
    public MusicItem addMusicItem(MusicItem musicItem) {
        return mrepository.save(musicItem);
    }
    
    public List<StatsMusic> countGenre() {
    	
    	//Se obtienen todos los generos
    	List<Genre> listGenres = new ArrayList<>();
    	grepository.findAll().forEach(listGenres::add);
    	
    	//Se inicializa el pojo con los nombres de los generos
    	List<StatsMusic> liststatsMusic = new ArrayList<>();
    	for(Genre gen : listGenres) {
        	StatsMusic m = new StatsMusic();
        	m.setMusicname(gen.getGenre());        	
        	liststatsMusic.add(m);	
    	}
    	
    	//Luego se cuentan los generos en el Pojo
    	for(StatsMusic m : liststatsMusic) {
    		m.setCount(mrepository.countByMusicname(m.getMusicname()));
    	}
    	
        return liststatsMusic;
    }
    
    public List<GenrePojoDropdown> listGenres() {
    	
    	//Se obtienen todos los generos
    	List<Genre> listGenres = new ArrayList<>();
    	grepository.findAll().forEach(listGenres::add);
    	
    	//Se inicializa el pojo con los nombres de los generos
    	List<GenrePojoDropdown> listPojoGenres = new ArrayList<>();
    	for(Genre gen : listGenres) {
    		GenrePojoDropdown m = new GenrePojoDropdown();    		
        	m.setLabel(gen.getGenre());
        	m.setValue(gen.getGenre());
        	listPojoGenres.add(m);	
    	}
    	
        return listPojoGenres;
    }
}
