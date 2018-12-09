package com.shingirai;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BlackJack blackJack = new BlackJackImpl();

        Player dealer = new Player();
        dealer.setName("Dealer");
        dealer.setCards(new Card(Suit.SPADES,Value.JACK), new Card(Suit.HEARTS, Value.NINE));

        Player andrew = new Player();
        andrew.setName("Andrew");
        andrew.setCards(new Card(Suit.DIAMONDS,Value.KING), new Card(Suit.SPADES,Value.FOUR),new Card(Suit.CLUBS,Value.FOUR));

        Player billy = new Player();
        billy.setName("Billy");
        billy.setCards(new Card(Suit.SPADES,Value.TWO),new Card(Suit.DIAMONDS,Value.TWO),new Card(Suit.HEARTS,Value.TWO),new Card(Suit.DIAMONDS,Value.FOUR),new Card(Suit.CLUBS,Value.FIVE));

        Player carla = new Player();
        carla.setName("Carla");
        carla.setCards(new Card(Suit.CLUBS,Value.QUEEN),new Card(Suit.SPADES,Value.SIX),new Card(Suit.DIAMONDS,Value.NINE));

        Player lemmy = new Player();
        lemmy.setName("Lemmy");
        lemmy.setCards(new Card(Suit.SPADES,Value.ACE),new Card(Suit.HEARTS,Value.SEVEN),new Card(Suit.DIAMONDS,Value.ACE));

        List<Player> players = new ArrayList<>();
        players.add(dealer);
        players.add(andrew);
        players.add(billy);
        players.add(carla);
        players.add(lemmy);

        blackJack.playBlackJack(players);

    }

}
