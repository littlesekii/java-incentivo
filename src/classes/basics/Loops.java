package classes.basics;

import java.util.ArrayList;

@SuppressWarnings("all")
public class Loops {
    public void forLoop() {

        System.out.println("===For Loop===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void whileLoop() {

        ArrayList<Integer> forecasts = new ArrayList<Integer>();
        forecasts.add(2025);
        forecasts.add(2026);
        forecasts.add(2027);
        forecasts.add(2028);
        forecasts.add(2029);
        forecasts.add(2030);

        System.out.println("===While Loop===");
        Integer year = forecasts.get(0);
        while (year < 2028) {
            forecasts.remove(year);
            System.out.println(year);

            year = forecasts.get(0);
        }
    }
}
