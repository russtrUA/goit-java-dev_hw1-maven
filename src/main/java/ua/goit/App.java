package ua.goit;

import com.google.gson.Gson;
import ua.goit.person.Person;

public class App {
    public static void main(String[] args) {
        System.out.println(new Gson().toJson(new Person("Ruslan", "Strynzha")));
    }
}
