public class LegoContainers {
        public static void main(String[] args) {

            // Step 1: Declare variables
            int amountOfBricks = 76;       // odd number between 50-100
            int containerCapacity = 7;     // even number between 5-10
            System.out.println("Total bricks: " + amountOfBricks);
            System.out.println("Container capacity: " + containerCapacity);

            // Step 2: Full containers (integer division, ignores remainder)
            int fullContainers = amountOfBricks / containerCapacity;
            System.out.println("Number of FULL containers: " + fullContainers);

            // Step 3: Leftover bricks using modulo
            int leftoverBricks = amountOfBricks % containerCapacity;
            System.out.println("Leftover bricks: " + leftoverBricks);

            int totalContainers = fullContainers + (leftoverBricks > 0 ? 1 : 0);
            System.out.println("Total containers needed: " + totalContainers);
        }
    }

