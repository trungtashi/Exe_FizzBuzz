public class FizzBuzz {
    static boolean limitNumber(int number){
        return number > 0 && number < 100;
    }
    static String checkFizzBuzz(int number){
        if (limitNumber(number)){
            if (number % 15 == 0)
                return "FizzBuzz";
            else if (number% 3 == 0)
                return "Fizz";
            else if (number % 5 ==0)
                return "Buzz";
            else return readNumber(number/10) + " " + readNumber(number%10);
        }
        else return "Uncountable";
    }
    static String readNumber(int number){
        return switch (number) {
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> "3";
            case 4 -> "4";
            case 5 -> "5";
            case 6 -> "6";
            case 7 -> "7";
            case 8 -> "8";
            case 9 -> "9";
            case 0 -> "10";
            default -> "False";
        };
    }
}
