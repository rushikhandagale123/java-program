import java.util.Scanner;
class CalculateTip
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a subtotal");
		double subTotal=sc.nextDouble();
		System.out.println("enter a gratuity");
		double gt =sc.nextDouble();
		double g=subTotal/100*15;
	    System.out.println("the gratuity is :" +g);
		double total=subTotal+g;
		System.out.println("the total is :"+total);
		
	}
}