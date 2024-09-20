package testando;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.math.BigInteger;

public class Testando {

public static void main(String[] args) throws IOException { 
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    String n = reader.readLine();

    try {
        BigInteger bint = new BigInteger(n);
        System.out.println(bint.isProbablePrime(100)?"prime":"not prime");
    }catch (NumberFormatException e) {
        System.err.println("Please enter the integer digits only: "+e.getMessage());
    }
} 
}
