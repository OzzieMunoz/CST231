/*
 * Title: CST231-Lab1A
 * Abstract: This porogram will generate ten random integers, and then it will sort those integers and print them.
 * Author: Ozzie Munoz, Jonathan Gastelum
 * Email: ozmunoz, jgastelum
 * Estimate: 1 hour
 * Date: 1/24/2024
 */

package lab1b;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        Random r = new Random();
        int [] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = Math.abs(r.nextInt()%(size*2)) - size;
            System.out.print(data[i] + " ");
        }
        System.out.println("\nsorted:");
        sort(data, size);
        for(int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    static void sort(int [] data, int size) {
        for(int i = 0; i < size - 1; i++) {
            int min_index = i;
            for (int k = i + 1; k < size; k++) {
                if (data[k] < data[min_index]) {
                    min_index = k;
                }
            }
            if(min_index != i) {
                int temp = data[min_index];
                data[min_index] = data[i];
                data[i] = temp;
            }
        }
    }
}