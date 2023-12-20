public class linearEq {
    public static void main(String[] args) {
        /* define integers from users input Receiving variables from the user 
        in order to solve an equation in the following format:  𝑎 ⋅ 𝑥 + 𝑏 = 𝑐. */

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        System.out.println(a + " * x + " + b + " = " + c);

        double x = (c-b)/a; //define x as the the solution of the equation

        System.out.println("X = " + x);
    }
}