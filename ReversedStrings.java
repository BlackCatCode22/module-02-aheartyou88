public class ReversedStrings {
    public static void main(String[] args) {

        // This creates a string message
        String message ="I like Java";

        // This prints the string message above
        System.out.println(message);

        // This is the value of the variable result
        String result = "";

        for (int i = message.length()-1; i>-1; i--)
            result += message.charAt(i);

        // This line prints out the result
        System.out.println(result);
    }
}