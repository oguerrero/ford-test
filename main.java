
class Main {
    public static void main(String[] args) {
        int number = 1111;

        System.out.println(intToRoman(number));

    }

    public static String intToRoman(int number){
        String result = "";
        // 10 % 10 = X, I, IV, V, IX
        // 349 -> 349 / 100 = 3 -> CCC
        // 349  -> 349 % 100 = 49

        while (number > 0) {
            // 1490 -> 490
            result += "M".repeat(number / 1000); // -> 1000
            number = number % 1000; // -> 490

            result.concat("D".repeat(number / 500)); // -> 490
            number = number % 500; // -> 490

            result.concat("C".repeat(number / 100)); // -> 400
            number = number % 100; // -> 90

            result.concat("C".repeat(number / 10)); // -> 400
            number = number % 100; // -> 90
            
            result.concat("I".repeat(number / 1)); // -> 400
            number = number % 1; // -> 90

        }

        return result;
    }

    // private static String[] converter(String numberRepresentation, int numericValue) {
    //     result.concat(numberRepresentation.repeat(numericValue / 1000));
    //     numericValue = numericValue % 1000;
    // }

}