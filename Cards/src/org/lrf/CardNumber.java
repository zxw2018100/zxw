package org.lrf;

public class CardNumber implements Comparable<CardNumber>{
	
	public CardNumber() {}
	
	public CardNumber(int number,String displayNumber) {
		this.number = number;
		this.displayNumber = displayNumber;
	}
	
	public CardNumber(int number,String displayNumber,CARD_TYPE cardType) {
		this(number,displayNumber);
		this.cardType = cardType;
	}
	
	private int number;
	private String displayNumber;
	private CARD_TYPE cardType;
	
	
	
	
	public CARD_TYPE getCardType() {
		return cardType;
	}

	public void setCardType(CARD_TYPE cardType) {
		this.cardType = cardType;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDisplayNumber() {
		return displayNumber;
	}

	public void setDisplayNumber(String displayNumber) {
		this.displayNumber = displayNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(this.cardType == null)
			return this.displayNumber;
		else
			return this.cardType.toString()+this.displayNumber;
	}

	@Override
	public int compareTo(CardNumber other) {
		return this.number - other.number;
	}
	
}
