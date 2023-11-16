package classwork.chapter13;

public class BoundedWildcard {

    static void showXY(Coords<?> c) {
        System.out.println("X, U coordinates:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
            System.out.println();
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X, U, Z coordinates");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
            System.out.println();
        }
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("X, U, Z, T coordinates");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " "
                    + c.coords[i].z + " " + c.coords[i].t);
            System.out.println();
        }
    }

    public static void main(String args[]) {

        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23)
        };

        Coords<TwoD> tdlocs = new Coords<TwoD>(td);

        System.out.println("The contents of the tdlocs object.");
        showXY(tdlocs);  // That's right, it's a TwoD type
//        showXYZ(tdlocs); Error, it's not a ThreeD type
//        showAll(tdlocs); Error, it's not a FourD type

//        and now create several objects like FourD

        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17),
        };

        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        System.out.println("The contents of the fdlocs object.");

        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}