public class EvenOrAdd {
        public static void main(String[] args) {

            int randomNumber = (int)(Math.random() * 100) + 1 ;
            System.out.println("Generated random number: " + randomNumber);

            int remainder = randomNumber % 2;
            System.out.println("Remainder after dividing by 2: " + remainder);

            if (remainder == 0) {
                System.out.println("The number " + randomNumber + " is EVEN");
            } else {
                System.out.println("The number " + randomNumber + " is ODD");
            }
        }
    }

