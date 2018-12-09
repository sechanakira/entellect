package com.shingirai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BlackJackImpl implements BlackJack {

    @Override
    public void playBlackJack(List<Player> players) {
        List<Player> winners = new ArrayList<>();
        List<Player> losers = new ArrayList<>();
        Player dealer = players.stream()
                .filter(player -> player.getName().equals("Dealer"))
                .collect(Collectors.toList())
                .get(0);
        players.remove(dealer);
        for(Player player : players){
            if(player.getHand() >= dealer.getHand() && player.getHand() <= 21){
                winners.add(player);
            }
            if(player.getCards().size() == 5 && player.getHand() <= 21){
                winners.add(player);
            }
            else {
                losers.add(player);
            }
        }
        System.out.println("NAME: " + dealer.getName() + " HAND: " + dealer.getHand() + " Cards: " + dealer.getCards());
        winners.forEach(winner->System.out.println("NAME: " + winner.getName() + " HAND: " + winner.getHand() + " RESULT: beats dealer" + " Cards: " + winner.getCards()));
        losers.forEach(loser->System.out.println("NAME: " + loser.getName() + " HAND: " + loser.getHand() + " RESULT: losses"  + " Cards: " + loser.getCards()));
    }
}
