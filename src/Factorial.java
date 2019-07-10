public class Factorial {
    public static int factorial(int i)
    {
        /* Termination Condition */
        if(i <= 1)
            return 1;
        /* Body, Recursive Expansion */
        return i * factorial(i - 1);
    }

    //Print base 10 integers
    public static void printInt1(int number)
    {
        char digit = (char) (number % 10 + '0');
        number = number / 10;
        if (number != 0)
            printInt1(number/10);
        System.out.print(" " + digit);
    }

    //print any base integers
    public static void printInt2(int number, final int base)
    {
        String conversion = "0123456789ABCDEF";
        char digit = (char) (number % base) ;
        number = number / base;
        if (number != 0)
            printInt2(number,base);
        System.out.print(" " + conversion.charAt(digit));
    }
}
