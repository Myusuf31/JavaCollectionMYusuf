/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashfruits;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class HashMapExample {

    public static void main(String[] args) {
        // Initialize a HashMap named fruitBowl
        HashMap<String, String> fruitBowl = new HashMap<String, String>();
        addElements(fruitBowl);
        displayElements(fruitBowl);
    }

    public static void addElements(HashMap<String, String> fruitBowl) {
        // Add an apple using the put() function of the HashMap collection
        fruitBowl.put("Apple", "Red");
        fruitBowl.put("Cherry", "Red");
        fruitBowl.put("Orange", "Orange");
        fruitBowl.put("Banana", "Yellow");
        fruitBowl.put("Apple", "Green");

        //mencari key
        findElement(fruitBowl, "Pisang");

    }

    static void displayElements(HashMap<String, String> fruitbowl) {
        for (HashMap.Entry<String, String> fruit : fruitbowl.entrySet()) {
            System.out.println("Fruit: " + fruit.getKey() + " - Color : " + fruit.getValue());
        }
    }

    static void findElement(HashMap<String, String> fruitBowl, String fruit) {
        if (fruitBowl.containsKey(fruit)) {
            System.out.println("The " + fruit + " is " + fruitBowl.get(fruit));
        } else {
            System.out.println("There is no " + fruit + " in the bowl");
        }
    }

}
