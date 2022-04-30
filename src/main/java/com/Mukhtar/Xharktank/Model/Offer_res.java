package com.Mukhtar.Xharktank.Model;

public class Offer_res {
	private  String id;

	 
	 
	
	private String investor;
 
	private int amount ;
 
	private float equity;
	private String comment;
	public Offer_res(Offer o)
	{
		this.amount=o.getAmount();
		this.id=""+o.getId();
		this.comment=o.getComment();
		this.equity=o.getEquity();
		this.investor=o.getInvestor();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
