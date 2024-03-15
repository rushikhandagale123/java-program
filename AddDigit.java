import java.util.Scanner;
class AddDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number between 0 and 1000");
		int number=sc.nextInt();
	if(number<0 || number>1000)
	{
		System.out.println("invalid number please enter the number between 0 and 1000");
	}
	    int sum = 0;
        int originalNumber = number;
        while (number != 0) 
        {
            int digit = number % 10;
            sum = sum+digit;
            number =number/10;
        }
System.out.println("The sum of all digits in " + originalNumber + " is: " + sum);
        

}

}