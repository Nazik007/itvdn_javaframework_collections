package itvdn_collection_framework.hw_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LinesOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        String input;

        while (true){
            input = reader.readLine();
            if (input.equals("end")){
                break;
            }
            list.add(input);
        }
        for (String s : list) {
            System.out.println(s + " ");
        }
    }
}
