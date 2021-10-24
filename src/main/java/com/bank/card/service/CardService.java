package com.bank.card.service;

import java.util.List;

import com.bank.card.document.Card;


public interface CardService {
	List<Card> getCard();
	Card saveCard(Card card);
	Card editCard(Card card);
	boolean deletedCard(String id);
}
