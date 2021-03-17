package MarcoRemon.company;

import java.util.HashMap;
import java.util.Map;

public class Cochera<T extends Auto> {

    private final String cocheraName;
    private final int limit;

    public String getCocheraName() {
        return cocheraName;
    }

    public int getLimit() {
        return limit;
    }

    public int getActualNumber() {
        return actualNumber;
    }

    private int actualNumber;

    private Map<String, T> cochera = new HashMap<>();

    public void addCar(String patente, T auto) {
        if (actualNumber + 1 == limit + 1) {
            System.out.println("Sorry. no more espacio amigo");
        } else {
            cochera.put(patente, auto);
            System.out.println(auto.getPatente());
            actualNumber++;

        }

    }

    public Cochera(String cocheraName, int limit) {
        this.cocheraName = cocheraName;
        this.limit = limit;
        this.actualNumber = 0;
    }

    public void getCars(){
        System.out.println("Cars in the cocherita are:");

            System.out.print(cochera.keySet());

    }
}
