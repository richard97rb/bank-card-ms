package com.bank.card.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.card.document.Card;
import com.bank.card.repository.CardRepository;

@Service
public class CardServiceImpl {
	@Autowired
	private CardRepository cardRepository;

	
	public List<Card> getCard() {
		return cardRepository.findAll();
	}

	public Card saveCard(Card card) {
		return cardRepository.save(card);
	}

	public Card editCard(Card card) {
		return cardRepository.save(card);
	}

	public boolean deletedCard(String id) {
		boolean deleted = false;
		try {
			cardRepository.deleteById(id);
			deleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleted;
	}
}
