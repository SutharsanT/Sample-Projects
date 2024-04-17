package SmapleProject;
import java.util.Scanner;

public class Car_Rental
{
	static
	{
		System.out.println("       ****** CAR RENTAL APPLICATION ******   ");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		details();
		cars();
	}
	public static void details()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Name : ");
		String name =sc.nextLine();
		System.out.print("Enter The Aadhar Number : ");
		long AadharNo =sc.nextLong();
		System.out.print("Enter The Mobile Number : ");
		long MobileNo =sc.nextLong();
	}
	
	public static void cars()
	{		
		System.out.println("----------------------------");
		System.out.println("Enter the vechile Type");
		System.out.println("press 1 is Sedan");
		System.out.println("press 2 is Coupe");
		System.out.println("press 3 is Hatchback");
		System.out.println("press 4 is Offroad");
		System.out.println("press 5 is SUV");
		System.out.println("press 6 is Luxury");
		
		Scanner sc = new Scanner(System.in);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			amountValidation1();
			break;
		case 2:
			amountValidation3();
			break;
		case 3:
			amountValidation3();
			break;
		case 4:
			amountValidation4();
			break;
		case 5:
			amountValidation5();
			break;
		case 6:
			amountValidation6();
			break;
		default:
			System.out.println("!! INVALIDE INPUT ");
			break;
		}
		sc.close();
	}
	public static void amountValidation1()
	{
		// SEDAN
		System.out.print("Enter The Number Of Person : ");
		Scanner sc = new Scanner(System.in);
		int NoOfPerson =sc.nextInt();
		if (NoOfPerson <= 4)
		{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter The Number Of Killometers : ");
		int Kilometers =sc1.nextInt();
		int kilo =  Kilometers * 5;
		System.out.println("The Price of Rental car is : "+kilo);
		System.out.println();
		System.out.println("  ***Press 1 to Book || 2 to Cancle***   ");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("  Booked :) ");
		break;
		case 2:System.out.println("  Cancle :( ");
		break;
		default:System.out.println("INVALID INPUT !!!");
		}
		sc1.close();
		}
		else
		{
			System.out.println("Only 0 to 4 Person Can Booking");
		}
		sc.close();
	}
	
	public static void amountValidation2()
	{
		//COUPE
		System.out.print("Enter The Number Of Person : ");
		Scanner sc = new Scanner(System.in);
		int NoOfPerson =sc.nextInt();
		if (NoOfPerson <=2)
		{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter The Number Of Killometers : ");
		int Kilometers =sc1.nextInt();
		int kilo =  Kilometers * 5;
		System.out.println("The Price of Rental car is : "+kilo);
		System.out.println();
		System.out.println("  ***Press 1 to Book || 2 to Cancle***   ");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("  Booked :) ");
		break;
		case 2:System.out.println("  Cancle :( ");
		break;
		default:System.out.println("INVALID INPUT !!!");
		}
		sc1.close();
		}
		else
		{
			System.out.println("Only 0 to 2 Person Can Booking");
		}
		sc.close();
	}
	
	public static void amountValidation3()
	{
		//HATCHBACK
		System.out.print("Enter The Number Of Person : ");
		Scanner sc = new Scanner(System.in);
		int NoOfPerson =sc.nextInt();
		if (NoOfPerson <= 4)
		{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter The Number Of Killometers : ");
		int Kilometers =sc1.nextInt();
		int kilo =  Kilometers * 5;
		System.out.println("The Price of Rental car is : "+kilo);
		System.out.println();
		System.out.println("  ***Press 1 to Book || 2 to Cancle***   ");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("  Booked :) ");
		break;
		case 2:System.out.println("  Cancle :( ");
		break;
		default:System.out.println("INVALID INPUT !!!");
		}
		sc1.close();
		}
		else
		{
			System.out.println("Only 0 to 4 Person Can Booking");
		}
		sc.close();
	}
	
	public static void amountValidation4()
	{
		//OFFROAD
		System.out.print("Enter The Number Of Person : ");
		Scanner sc = new Scanner(System.in);
		int NoOfPerson =sc.nextInt();
		if (NoOfPerson <= 5)
		{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter The Number Of Killometers : ");
		int Kilometers =sc1.nextInt();
		int kilo =  Kilometers * 7;
		System.out.println("The Price of Rental car is : "+kilo);
		System.out.println();
		System.out.println("  ***Press 1 to Book || 2 to Cancle***   ");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("  Booked :) ");
		break;
		case 2:System.out.println("  Cancle :( ");
		break;
		default:System.out.println("INVALID INPUT !!!");
		}
		sc1.close();
		}
		else
		{
			System.out.println("Only 0 to 5 Person Can Booking");
		}
		sc.close();
	}
	
	public static void amountValidation5()
	{
		//SUV
		System.out.print("Enter The Number Of Person : ");
		Scanner sc = new Scanner(System.in);
		int NoOfPerson =sc.nextInt();
		if (NoOfPerson <= 8)
		{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter The Number Of Killometers : ");
		int Kilometers =sc1.nextInt();
		int kilo =  Kilometers * 9;
		System.out.println("The Price of Rental car is : "+kilo);
		System.out.println();
		System.out.println("  ***Press 1 to Book || 2 to Cancle***   ");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("  Booked :) ");
		break;
		case 2:System.out.println("  Cancle :( ");
		break;
		default:System.out.println("INVALID INPUT !!!");
		}
		sc1.close();
		}
		else
		{
			System.out.println("Only 0 to 8 Person Can Booking");
		}
		sc.close();
	}
	
	public static void amountValidation6()
	{
		//LUXURY
		System.out.print("Enter The Number Of Person : ");
		Scanner sc = new Scanner(System.in);
		int NoOfPerson =sc.nextInt();
		if (NoOfPerson <= 4)
		{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter The Number Of Killometers : ");
		int Kilometers =sc1.nextInt();
		int kilo =  Kilometers * 13;
		System.out.println("The Price of Rental car is : "+kilo);
		System.out.println();
		System.out.println("  ***Press 1 to Book || 2 to Cancle***   ");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("  Booked :) ");
		break;
		case 2:System.out.println("  Cancle :( ");
		break;
		default:System.out.println("INVALID INPUT !!!");
		}
		sc1.close();
		}
		else
		{
			System.out.println("Only 0 to 4 Person Can Booking");
		}
		sc.close();
	}
}