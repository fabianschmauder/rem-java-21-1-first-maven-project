public class CheckStringLengthApp {


    public static void main(String[] args) {
        String textToCheck = "Hallo";
        System.out.println("Text greater than 20: " + greaterThan20(textToCheck));
    }


    public static boolean greaterThan20(String text){
        return text.length() > 20;
    }
}
