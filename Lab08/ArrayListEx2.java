package Lab08;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Ahmed");
        list.add("Khaled");
        list.add("Ali");
        System.out.println(list.toString());

        list.set(0, "Fahad");
        System.out.println(list.toString());
    }
}
