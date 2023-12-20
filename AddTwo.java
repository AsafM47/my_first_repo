public class AddTwo {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);   // Declares an integer variable and sets it to the first number the user inserts
        int num2 = Integer.parseInt(args[1]);   // Declares an integer variable and sets it to the second number the user inserts
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
}