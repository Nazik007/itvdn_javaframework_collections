package itvdn_collection_framework.hw_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Family {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> family = new ArrayList<>();// я не знав як тут використати ArrayList


        System.out.println("Введите название города: ");
        String lastName = reader.readLine();

        switch (lastName){
            case "Москва":
                System.out.println("Там живут Ивановы");
                break;
            case "Киев":
                System.out.println("Там живут Петровы");
                break;
            case "Лондон":
                System.out.println("Там живут Абрамовичи");
                break;
            default:
                System.out.println("Нет таких в нашей базе данных");
        }
    }
}
