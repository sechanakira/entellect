package com.shingirai;

import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player> {

    private String name;
    private List<Card> cards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(Card... cards) {
        List<Card> cardList = new ArrayList<>();
        for(Card card : cards){
            cardList.add(card);
        }
        this.cards = cardList;
    }

    public Integer getHand() {
        int value = 0;
        List<Card> aces = new ArrayList<>();
        for(Card card : cards){
            if(card.getValue().equals(Value.ACE)){
                aces.add(card);
                continue;
            }
            else{
                value += card.getValue().weight;
            }
        }
        if(!aces.isEmpty()){
            for(Card ace : aces){
                if(value + 11 <= 21){
                    value += 11;
                }
                else {
                    value += 1;
                }
            }
        }
        return value;
    }

    @Override
    public int compareTo(Player other) {
        return this.getHand().compareTo(other.getHand());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                "hand=" + getHand() +
                ", cards=" + cards +
                '}';
    }
}
