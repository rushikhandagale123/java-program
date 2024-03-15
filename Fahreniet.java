import java.util.Scanner;
class Fahreniet
{
	 public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
		  System.out.println("enetr a value");
          double celsius =sc.nextDouble();
          double fahrenheit=9.0/5*celsius+32;
          System.out.println( +celsius+ " celsius is " +fahrenheit+  "in fahreniet");
}
}