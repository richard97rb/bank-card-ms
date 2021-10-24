package com.bank.card.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cards")
public class Card {
	
	@Id
	private String id;
	private String cardNumber;
	private String cardName;
	private String cvv;
	private float year;
	private float month;
	private boolean isExpired;
	private boolean isActive;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public float getYear() {
		return year;
	}
	public void setYear(float year) {
		this.year = year;
	}
	public float getMonth() {
		return month;
	}
	public void setMonth(float month) {
		this.month = month;
	}
	public boolean isExpired() {
		return isExpired;
	}
	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Card(String id, String cardNumber, String cardName, String cvv, float year, float month, boolean isExpired,
			boolean isActive) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.cvv = cvv;
		this.year = year;
		this.month = month;
		this.isExpired = isExpired;
		this.isActive = isActive;
	}
	
	public Card() {
		
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", cardNumber=" + cardNumber + ", cardName=" + cardName + ", cvv=" + cvv + ", year="
				+ year + ", month=" + month + ", isExpired=" + isExpired + ", isActive=" + isActive + "]";
	}
	
	
		
}