package Basics;
import java.util.*;


public class RupeeToUsd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ruppes to Us Dollar Conversion ");
        System.out.println("Ente the Amount in Ruppes = ");
        float rs = sc.nextFloat();

        double dollars = rs/0.012;
        System.out.println(String.format("%.2f",dollars));
    }

}
