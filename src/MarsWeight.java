public class MarsWeight {
    static float earthWeightAbdalla;
    static float marsWeightAbdalla;
    static double marsWeightDoubleAbdalla;
    static int marsWeightIntAbdalla;
    static char marsWeightCharAbdalla;
    static int finalValueAbdalla;
    public static void main(String[] args) {

        earthWeightAbdalla = 70.0f;
        System.out.println("Your weight on Earth: " + earthWeightAbdalla + " kg");

        marsWeightAbdalla = earthWeightAbdalla * 0.38f;
        System.out.println("Your weight on Mars (float): " + marsWeightAbdalla + " kg");

        marsWeightDoubleAbdalla = marsWeightAbdalla;
        System.out.printf("Your weight on Mars (double, 4 decimals): %.4f%n", marsWeightDoubleAbdalla);

        marsWeightIntAbdalla = (int) marsWeightDoubleAbdalla;
        System.out.println("Mars weight as int (truncated): " + marsWeightIntAbdalla);

        marsWeightCharAbdalla = (char) marsWeightIntAbdalla;
        System.out.println("Mars weight as char: " + marsWeightCharAbdalla);

        finalValueAbdalla = marsWeightCharAbdalla + 5;
        System.out.println("Char value after adding 5 (as int): " + finalValueAbdalla);
    }

    }