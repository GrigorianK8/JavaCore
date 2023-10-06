package classwork.chapter8.box;

import classwork.chapter8.box.Shipment;

public class DemoShipment {

    public static void main(String[] args) {
        Shipment shipment = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.076, 1.28);
        double vol;

        vol = shipment.volume();
        System.out.println("The volume of Shipment equals to " + vol);
        System.out.println("The weight of Shipment equals to " + shipment.weight);
        System.out.println("Delivery cost: $" + shipment.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("The volume of Shipment2 equals to " + vol);
        System.out.println("The weight of Shipment equals to " + shipment2.weight);
        System.out.println("Delivery cost: $" + shipment2.cost);
    }
}