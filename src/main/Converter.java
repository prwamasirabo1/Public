package main;

import java.util.Scanner;

public class Converter{
	private static final String KiloMeters = null;
	private static Scanner input;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please select an option");
		System.out.println();

		//Creating Menu
		while(true){
			System.out.println("To convert Cups to Teaspoons, Enter 1");
			System.out.println("To Convert Miles to Kilometers, Enter 2");
			System.out.println("To Convert US Gallons to Imperial Gallons, Enter 3");
			System.out.println("To quit, Enter 4");
			
			System.out.println();
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("Conversion from cups to Teaspoons");
			cupstoTeaspoons();
			break;
			case 2: System.out.println("Conversion from Miles to Kilometers");
			milestoKilometers();
			break;
			case 3: System.out.println("Conversion US Gallons to Imperial Gallons");
			usgallonstoImperialgallons();
			break;
			case 4: System.out.println("Thank you for converting from our option. Visit again");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}

	}

	public static void cupstoTeaspoons(){
		
		int cups, teaspoons= 48 ; 
				 
		System.out.println("Enter a number of cups: ");
        Scanner input = new Scanner(System.in);
        cups = input.nextInt();
        teaspoons = cups*48 ;
        System.out.println("The number of teaspoons : " + teaspoons);		
	}

	public static void milestoKilometers(){
		
		double kiloMeters, miles = 0; 
		double conversionFactor= 1.609344; 
		 
		System.out.println("Enter distance value in Kilometers : ");
        Scanner input = new Scanner(System.in);
        kiloMeters = input.nextDouble();
         miles = kiloMeters / conversionFactor;
        System.out.println("The distance in Miles : " + miles);
	}

	public static void usgallonstoImperialgallons(){
		double usaliquidGallon, imperial = 0; 
		double conversionFormula= 0.832674; 
		 
		System.out.println("Enter distance value in Kilometers : ");
        Scanner input = new Scanner(System.in);
        usaliquidGallon = input.nextDouble();
        imperial = usaliquidGallon * conversionFormula;
        System.out.println("The distance in Miles : " + imperial);
		//System.out.println("You get:");
	
	}

	
	}


     

