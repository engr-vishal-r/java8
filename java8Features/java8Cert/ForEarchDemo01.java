package java8Cert;

import java.util.ArrayList;
import java.util.List;

public class ForEarchDemo01 {

    public static void main(String[] args) {
        List gamesList = new ArrayList();
        gamesList.add(1, "Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.addAll(null);
        gamesList.stream().forEachOrdered(System.out::println);
    }

}
