package com.Mukhtar.Xharktank.Repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.Mukhtar.Xharktank.Model.Offer;
import com.Mukhtar.Xharktank.Model.Pitches;

public interface OfferRepo extends CrudRepository<Offer, Integer>  {
	

	Optional<Pitches> findAllById(int id);
	

}
