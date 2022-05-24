import java.util.Scanner;
public class ArrayChallenges
	{

		public static void main(String[] args)
			{
			challenge1();
			challenge2();
			challenge3();
			challenge4();
			}
		public static void challenge1()
			{
			//sweets
			Scanner userIntInput = new Scanner(System.in);
			System.out.println("How many favorite sweets do you like?");
			int sweetNumber = userIntInput.nextInt();
			String [] sweets = new String[sweetNumber];
			
			for(int i=0; i < sweets.length; i++)
				{
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("Input a favorite sweet");	
				String newSweet = userStringInput.nextLine();
				sweets[i] = newSweet;
				
				}
			for(int i=0; i < sweets.length; i++)
				{
				System.out.println(sweets[i]);	
				}
			}			
		public static void challenge2()
			{
			int [] numbersArray = new int[8];
			int oddNumber = 0;
			int evenNumber = 0;
			
			Scanner userIntInput = new Scanner(System.in);
			for(int i=0; i < numbersArray.length; i++)
				{
				System.out.println("Give me a number");
				numbersArray[i] = userIntInput.nextInt();				
				
				if((numbersArray[i] % 2) == 0)
					{
					evenNumber = evenNumber + numbersArray[i];
					
					}
				else if((numbersArray[i] % 2) == 1)
					{
					oddNumber = oddNumber + numbersArray[i];
					}
				}
			System.out.println("The sum of the even numbers is " + evenNumber);
			System.out.println("The sum of the odd numbers is " + oddNumber);
			}			
		public static void challenge3()
			{
			int [] random = new int [5];
			for(int i = random.length -1; i>= 0; i-- )	
				{
				random[i] = ((int)(Math.random() *91) + 10);
				
				}
			for(int n: random)
				{
				System.out.println(n);	
				}
			}
		public static void challenge4()
			{
			int [] quad = new int [4];
			Scanner userIntInput = new Scanner(System.in);
			System.out.println("Give me a 4 digit number please");
			int number = userIntInput.nextInt();
			for(int i = 0; i < quad.length; i++)
				{
				quad[i] = number % 10;
				number = number/10;
				}
			for(int n: quad)
				{
				System.out.println(n);
				}
			}
		public static void challenge5()
			{
				
			}
	}
