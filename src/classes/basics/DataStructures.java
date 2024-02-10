package classes.basics;

import java.util.ArrayList;

@SuppressWarnings("all")
public class DataStructures {

    private String businessDay(boolean isBusinessDay) {
        return isBusinessDay ? "Business Day" : "Not a Business Day";
    }

    public void arrays() {
        //boolean[] businessDay = {false, true, true, true, true, true, false};
        //or I can do like this
        boolean[] businessDay = new boolean[7];
        businessDay[0] = false;
        businessDay[1] = true;
        businessDay[2] = true;
        businessDay[3] = true;
        businessDay[4] = true;
        businessDay[5] = true;
        businessDay[6] = false;

        System.out.println("===Arrays===");
        System.out.println("Sunday: " + businessDay(businessDay[0]));
        System.out.println("Monday: " + businessDay(businessDay[1]));
        System.out.println("Tuesday: " + businessDay(businessDay[2]));
        System.out.println("Wednesday: " + businessDay(businessDay[3]));
        System.out.println("Thursday: " + businessDay(businessDay[4]));
        System.out.println("Friday: " + businessDay(businessDay[5]));
        System.out.println("Saturday: " + businessDay(businessDay[6]));
    }

    public void arrayLists() {
        ArrayList<String> entrants = new ArrayList<String>();
        //add values
        entrants.add("Davi Bacalhau");
        entrants.add("Flávia Helena");
        entrants.add("Fernanda Kiper");
        entrants.add("Guilherme Grilo");
        entrants.add("Judson Santiago");

        //edit a value
        entrants.set(2, "Fernanda Kipper");

        //remove a value
        entrants.remove("Guilherme Grilo");

        System.out.println("===Array Lists===");
        System.out.println("Entrant #01: " + entrants.get(0));
        System.out.println("Entrant #02: " + entrants.get(1));
        System.out.println("Entrant #03: " + entrants.get(2));
        System.out.println("Entrant #04: " + entrants.get(3));

    }
}
