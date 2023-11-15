/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashsetexample;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hp
 */
public class CoinTestDriver {

    public static void main(String[] args) {
        HashSet<Coin> bagOfCoins = new HashSet<Coin>();

        //create coin object
        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        Coin coin20 = new Coin(20);
        Coin coin50 = new Coin(50);
        Coin coin100 = new Coin(100);

        //add the coins to the bag
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin20);
        bagOfCoins.add(coin50);
        //bagOfCoins.add(coin100);

        //Add coin10 to the HashSet twice
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin10);

        System.out.println("Content of bagOfCoins Hashset :");
        for (Coin coin : bagOfCoins) {
            System.out.println(coin.getdenomination());
        }

        // Call the findCoin() method to search for a coin in the HashSet bagOfCoins
        findCoin(bagOfCoins, coin5);
        findCoin(bagOfCoins, coin100);

        // Call the displayBagContents() method to display the contents of the HashSet bagOfCoins
        displayBagContents(bagOfCoins);

        // Call the displayBagDetails() method to display the details of the HashSet bagOfCoins
        displayBagDetails(bagOfCoins);

        // Remove all elements from the HashSet bagOfCoins
        bagOfCoins.clear();

        // Call the displayBagDetails() method again to display the details of the empty HashSet bagOfCoins
        displayBagDetails(bagOfCoins);

    }

    public static void findCoin(HashSet<Coin> bagOfCoins, Coin coin) {
        // Check if the bag contains the coin
        if (bagOfCoins.contains(coin)) {
            System.out.println("The coin " + coin.getdenomination() + " is in the bag.");
        } else {
            System.out.println("The coin " + coin.getdenomination() + " is not in the bag.");
        }
    }

    public static void displayBagContents(HashSet<Coin> bagOfCoins) {
        // Iterate over the HashSet using an enhanced for loop
        for (Coin coin : bagOfCoins) {
            // Print the denomination value of the coin
            System.out.println(coin.getdenomination());
        }
    }

    public static void displayBagDetails(HashSet<Coin> bagOfCoins) {
        // Check if the HashSet is empty
        if (bagOfCoins.isEmpty()) {
            System.out.println("The bag is empty.");
        } else {
            // Print the number of coins in the HashSet
            System.out.println("The bag contains " + bagOfCoins.size() + " coins.");
        }
    }
}
