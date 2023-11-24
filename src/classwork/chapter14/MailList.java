package classwork.chapter14;

import java.util.LinkedList;
import java.util.List;

public class MailList {

    public static void main(String[] args) {

        List<Address> ml = new LinkedList<>();

        ml.add(new Address("J.V. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Charlton", "867 Elm Street", "Champaign", "IL", "61820"));

        for (Address address : ml) {
            System.out.println(address + "\n");
        }
    }
}