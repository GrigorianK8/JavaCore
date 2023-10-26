package classwork.chapter11;

public enum Apple {

    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    Apple() {
        price = -1;
    }

//    int getPrice() {
//        return price;
//    }
}