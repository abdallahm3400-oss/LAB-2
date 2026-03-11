public class MarsWeight {
    // --- Variable declarations ---
    static float earthWeightAbdalla;
    static float marsWeightAbdalla;  // calculated weight on Mars (in kg)
    static double marsWeightDoubleAbdalla; // as double
    static int marsWeightIntAbdalla; // Mars weight after casting to int
    static char marsWeightCharAbdalla; //as a char
    static int finalValueAbdalla;  // result after doing math on char
    public static void main(String[] args) {
        // 1. Assign your Earth weight
        earthWeightAbdalla = 70.0f;
        System.out.println("Your weight on Earth: " + earthWeightAbdalla + " kg");

        marsWeightAbdalla = earthWeightAbdalla * 0.38f;
        System.out.println("Your weight on Mars (float): " + marsWeightAbdalla + " kg");

        // 3. Assign to a double variable
        marsWeightDoubleAbdalla = marsWeightAbdalla;
        System.out.printf("Your weight on Mars (double, 4 decimals): %.4f%n", marsWeightDoubleAbdalla);

// 4. Cast double → int
        marsWeightIntAbdalla = (int) marsWeightDoubleAbdalla;
        System.out.println("Mars weight as int (truncated): " + marsWeightIntAbdalla);

// 5. Cast int → char
        marsWeightCharAbdalla = (char) marsWeightIntAbdalla;
        System.out.println("Mars weight as char: " + marsWeightCharAbdalla);

        // 6. Do a math operation on the char (e.g. add 5)
        finalValueAbdalla = marsWeightCharAbdalla + 5;
        System.out.println("Char value after adding 5 (as int): " + finalValueAbdalla);
    }

    }