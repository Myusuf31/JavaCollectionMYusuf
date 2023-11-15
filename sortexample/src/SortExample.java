/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class SortExample {

    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        displayValues(numbers);
        sequentialSearch(numbers, 13);
        sequentialSearch(numbers, 7);

        selectionSort(numbers);
        displayValues(numbers);
    }

    static void displayValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Ganti "/n" menjadi System.out.println();
    }

    static void selectionSort(int[] numbers) {
        int indexMin;
        for (int i = 0; i < numbers.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[indexMin]) {
                    indexMin = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }
    }

    static void sequentialSearch(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                System.out.println("The number " + value + " is at position " + i + " in the list");
                return;
            }
        }
        System.out.println("The number " + value + " is not in the list");
    }
}
