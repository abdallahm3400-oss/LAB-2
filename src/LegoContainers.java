import java.util.concurrent.atomic.AtomicInteger;

public class LegoContainers {
    public static void main(String[] args) {

        int amountOfBricks = 76;
        int containerCapacity = 7;
        System.out.println("Total bricks: " + amountOfBricks);
        System.out.println("Container capacity: " + containerCapacity);

        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Number of FULL containers: " + fullContainers);

        int leftoverBricks = amountOfBricks % containerCapacity;
        System.out.println("Leftover bricks: " + leftoverBricks);

        int totalContainers = fullContainers + (leftoverBricks > 0 ? 1 : 0);
        System.out.println("Total containers needed: " + totalContainers);

//            int f = 10;
//
//            AtomicInteger g = new AtomicInteger(10);
//            valueTest(f,g);
//
//            System.out.println("f =" + f);
//            System.out.println("g = " + g);
//        }
//        private static void valueTest (int f, AtomicInteger g) {
//            f = 20;
//            g.set(20);
//        }


    }
}

