package itvdn_collection_framework.hw_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindMinNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Input 10 random numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.valueOf(reader.readLine()));
        }

        int min = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (min > numbers.get(i)){
                min = numbers.get(i);
            }
        }

        System.out.println("The minimum number out from the input list of numbers is - " + min);
    }
}
