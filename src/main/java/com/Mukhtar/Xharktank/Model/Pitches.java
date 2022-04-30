package com.Mukhtar.Xharktank.Model;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.transaction.Transactional;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
@Transactional
@Entity
public class Pitches {
	
	  
	  
	
	
	@Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	   private  int id;
	  @NonNull
	private   String entrepreneur;
	  @NonNull
	private   String pitchTitle;
	  @NonNull
	 @Column(length = 65555)
	private   String pitchIdea;
	  @NonNull
	private   int askAmount;
	  @NonNull
	private   float equity;
	@OneToMany(mappedBy = "pitch", cascade = CascadeType.ALL, orphanRemoval = true)
	 
 
	 private List<Offer> offers=new ArrayList<>();
	 
 
	 
 
	
	 
	public List<Offer> getOffers() {
		return offers;
	}
	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}
	public String getEntrepreneur() {
		return entrepreneur;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEntrepreneur(String entrepreneur) {
		this.entrepreneur = entrepreneur;
	}
	public String getPitchTitle() {
		return pitchTitle;
	}
	public void setPitchTitle(String pitchTitle) {
		this.pitchTitle = pitchTitle;
	}
	public String getPitchIdea() {
		return pitchIdea;
	}
	public void setPitchIdea(String pitchIdea) {
		this.pitchIdea = pitchIdea;
	}
	public int getAskAmount() {
		return askAmount;
	}
	public void setAskAmount(int askAmount) {
		this.askAmount = askAmount;
	}
	public float getEquity() {
		return equity;
	}
	public void setEquity(float equity) {
		this.equity = equity;
	}
	
	

}
