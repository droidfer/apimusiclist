package com.fjmg.listmusic.elements;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicItemRepository extends CrudRepository< MusicItem , Long >{
	long countByMusicname(String musicname);
}
