package com.Mukhtar.Xharktank.Model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.transaction.Transactional;

import org.hibernate.annotations.ValueGenerationType;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Transactional
@Entity
 
public class Offer {
 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private  int id;

 
 
	private String investor;
 
	private int amount ;
 
	private float equity;
	private String comment;
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY )
	@JoinColumn(name="pitch_id" )
	 
	private Pitches pitch;

	 
	
	 
 

	 

	public Pitches getPitch() {
		return pitch;
	}

	public void setPitch(Pitches pitch) {
		this.pitch = pitch;
	}

	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
	public String getInvestor() {
		return investor;
	}
	public void setInvestor(String investor) {
		this.investor = investor;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public float getEquity() {
		return equity;
	}
	public void setEquity(float equity) {
		this.equity = equity;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
