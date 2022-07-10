package itvdn_collection_framework.hw_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NameDoubler {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Type in 5 different names: ");

        for (int i = 0; i < 5; i++) {
            names.add(reader.readLine());
        }

        System.out.println("The list of each name printed out twice: ");

        ArrayList<String> result = doubleValues(names);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues (ArrayList<String> list) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < 5; i++) {
            list.add(x, list.get(y));
            x += 2;
            y += 2;
        }
        return list;
    }
}
