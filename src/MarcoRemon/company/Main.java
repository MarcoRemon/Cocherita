package MarcoRemon.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        Map<String, String> languages = new HashMap<>();
//
//        languages.put("java", "welp, esto lo recuerdo");
//        languages.put("sql", "ahora tocaria ir recordando sql");
//        languages.put("spring", "ir aprendiendo spring");
//
//        System.out.println(languages.get("java"));


        Cochera<Mercedes> cochera= new Cochera<>("El gringo",3);

        Mercedes a = new Mercedes("XL2","Rojo","OjalaYo","XYZ-202");
        Mercedes b = new Mercedes("BZ9","Negro","Ramona","GOG-444");
        Mercedes c = new Mercedes("R8G","Azul","Otrora","EEG-271");
        Mercedes d = new Mercedes("RGB","RGB","Antanho","RGB-777");

        cochera.addCar(a.getPatente(),a);
        cochera.addCar(b.getPatente(),b);
        cochera.addCar(c.getPatente(),c);
        cochera.addCar(d.getPatente(),d);


        cochera.getCars();



    }
}