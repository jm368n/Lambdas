package set;

import java.util.Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HasMapTest {

    public static void main(String[] args) {

        Map<Integer, String> diccionario = new HashMap<Integer, String>();

        diccionario.put(20, "ID");
        diccionario.put(30, "NAME");
        diccionario.put(40, "LASNAME");

        System.out.println(diccionario.size());

        for (Entry<Integer, String> e : diccionario.entrySet()) {
            System.out.println("Llave " + e.getKey() + " :: " + "Valor: " + e.getValue());
        }
    }
}
