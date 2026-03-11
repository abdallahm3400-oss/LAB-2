public class EvenOrAdd {
        public static void main(String[] args) {

            // Step 1: Generate a random number between 1 and 100
            int randomNumber = (int)(Math.random() * 100) + 1 ; //I added the +1 since the numbers need to be in between 1-100 and not show zero
            System.out.println("Generated random number: " + randomNumber);
            // Step 2: Use modulo to find the remainder so that we can check if it's even or odd
            int remainder = randomNumber % 2;
            System.out.println("Remainder after dividing by 2: " + remainder);

            // Step 3: Check if even or odd
            if (remainder == 0) {
                System.out.println("The number " + randomNumber + " is EVEN");
            } else {
                System.out.println("The number " + randomNumber + " is ODD");
            }
        }
    }

