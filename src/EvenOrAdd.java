public class EvenOrAdd {
        public static void main(String[] args) {

            // Step 1: Generate a random number between 1 and 100
            int randomNumber = (int)(Math.random() * 100) + 1 ; //I added the +1 since the numbers need to be in between 1-100 and not show zero
            System.out.println("Generated random number: " + randomNumber);

        }
    }

