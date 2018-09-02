package org.lrf;

public enum CARD_TYPE {
	
	RED_HEART(0,"♥️"),SPADE(1,"♠️"),SQUARE(2,"♦️"),PLUM_BLOSSOM(3,"♣️");
	
	private int id;
	private String type;
	
	private CARD_TYPE(int id,String type) {
		this.id = id;
		this.type = type;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.type;
	}
	
}
