package com.Mukhtar.Xharktank.Repos;

 

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Mukhtar.Xharktank.Model.Pitches;


public interface Repo extends  CrudRepository<Pitches, Integer> {

 
	List<Pitches> findAllByOrderByIdDesc();
	Pitches findById(int id);
	Pitches findById(String id);
	
	 
	 
    
	 
	

}