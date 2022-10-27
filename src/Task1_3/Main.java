package Task1_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Card cards = new Card();
        cards.addCard("King", 1);
        cards.addCard("Ace", 3);
        cards.addCard("Jack", 2);
        cards.addCard("Queen", 4);
        cards.addCard("King", 1);
        System.out.println(cards);

    }

    public static class Card {
        private  final Map<String, Integer> cardMap = new HashMap<>();
        public  void addCard(String key, Integer value) throws RuntimeException{
            if (cardMap.containsKey(key) && cardMap.get(key).equals(value)) {
                throw new RuntimeException("Такой объект уже есть");
            } else {
                cardMap.put(key, value);
            }
        }

        @Override
        public String toString() {
            return "Card{" +
                    "cardMap=" + cardMap +
                    '}';
        }


    }

}
