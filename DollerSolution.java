import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DollerSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        String ft = String.format("%.2f", payment);
        scanner.close();
        /*Locale usa = new Locale("en", "US");
        Currency dollars = Currency.getInstance(usa);
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

        Locale ind = new Locale("en", "IN");
        Currency ru = Currency.getInstance(ind);
        NumberFormat ruFormat = NumberFormat.getCurrencyInstance(ind);

        Locale ch = new Locale("en", "CN");
        Currency Che = Currency.getInstance(ch);
        NumberFormat cFormat = NumberFormat.getCurrencyInstance(ch);
        // Write your code here.

        System.out.println("US: "+dollarFormat.format(payment) );
        System.out.println("India: " +ruFormat.format(payment));
        System.out.println("China: " + cFormat.format(payment));
        System.out.println("France: " + ft);*/

    }
}

