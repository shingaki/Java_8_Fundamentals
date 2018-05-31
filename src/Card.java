// Card.java
// Card class represents a playing card.

public class Card
{
   private final String face; // face of card ("Ace", "Deuce", ...)
   private final String suit; // suit of card ("Hearts", "Diamonds", ...)

   // two-argument constants initializes card's face and suit
   public Card(String face, String suit)
   {
      this.face = face;
      this.suit = suit;
   }

   public String toString()
   {
      return face + " of " + suit;
   }
} // end class Card
