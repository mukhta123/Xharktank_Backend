package com.Mukhtar.Xharktank.Model;

import java.util.ArrayList;
import java.util.List;


import org.springframework.lang.NonNull;

public class Pitch_res {
	private  String id;
	   
	private   String entrepreneur;
	 
	private   String pitchTitle;
	   
	private   String pitchIdea;
	   
	private   int askAmount;
	   
	private   float equity;
	 
	 

	 private List<Offer_res> offers=new ArrayList<>();



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getEntrepreneur() {
		return entrepreneur;
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



	public List<Offer_res> getOffers() {
		return offers;
	}



	public void setOffers(List<Offer_res> offers) {
		this.offers = offers;
	}
	 public Pitch_res(Pitches p)
	 {
		 this.id=""+p.getId();
		 this.entrepreneur=p.getEntrepreneur();
		 this.pitchTitle=p.getPitchTitle();
		 this.pitchIdea=p.getPitchIdea();
		 this.equity=p.getEquity();
		 this.askAmount=p.getAskAmount();
		 List<Offer> o=p.getOffers();

		 for(int i=0;i<o.size();i++)
		 {
			 this.offers.add(new Offer_res(o.get(i)));
		 }
	 }

}
