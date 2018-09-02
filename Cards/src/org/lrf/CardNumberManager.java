package org.lrf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardNumberManager {
	
	public CardNumberManager() {
		createCardNumbers();
		shuffleTheCards();
	}
	
	private final String[] ALL_CARD_NUMBERS = {"3","4","5","6","7","8","9","10","J","Q","K","A","2","🚄","✈️"};
	private List<CardNumber> cardNumbers = new ArrayList<>();
	private List<CardNumber> shuffledCards;
	
	private void createCardNumbers() {
		for(CARD_TYPE ct : CARD_TYPE.values()) {
			for (int i = 0; i < ALL_CARD_NUMBERS.length; i++) {
				if(ALL_CARD_NUMBERS[i].equals("🚄") || ALL_CARD_NUMBERS[i].equals("✈️")) {
					continue;
				}
				cardNumbers.add(new CardNumber(i+1, ALL_CARD_NUMBERS[i],ct));
			}
		}
		cardNumbers.add(new CardNumber(ALL_CARD_NUMBERS.length-1, ALL_CARD_NUMBERS[ALL_CARD_NUMBERS.length-2]));
		cardNumbers.add(new CardNumber(ALL_CARD_NUMBERS.length, ALL_CARD_NUMBERS[ALL_CARD_NUMBERS.length-1]));
	}
	
	public void showAllCards() {
		for (CardNumber cardNumber : cardNumbers) {
			System.out.print(cardNumber+" ");
		}
	}
	
	public void shuffleTheCards() {
		shuffledCards = new ArrayList<>();
		
		List<Integer> indexes = getAllCardsIndex();
		Random random = new Random();
		
		for (int i = 0; i < cardNumbers.size(); i++) {

			int randomIndex = random.nextInt(indexes.size());
			
			
			shuffledCards.add(cardNumbers.get(indexes.get(randomIndex)));			
			indexes.remove(randomIndex);
		}
	}
	
	private List getAllCardsIndex(){
		List<Integer> cardIndexs = new ArrayList<>();
		for (int i = 0; i < cardNumbers.size(); i++) {
			cardIndexs.add(i);
		}
		return cardIndexs;
	}
	
	public static void main(String[] args) {
		for(CardNumber cn : new CardNumberManager().shuffledCards) {
			System.out.println(cn + " ");
		}
	}
	
}
