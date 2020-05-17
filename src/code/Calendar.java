package code;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] maxdaysOftheMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public int getMaxdaysOftheMonth(int month) {
		return maxdaysOftheMonth[month - 1];
	}
	
	public static void printSampleCalendar() {
		
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		System.out.println("============================");
		System.out.println(" 1   2   3   4   5   6  7");
		System.out.println(" 8   9  10  11  12  13  14");
		System.out.println("15  16  17  18  19  20  21");
		System.out.println("22  23  24  25  26  27  28");

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type the month : ");
		int month = scanner.nextInt();
		scanner.close();
		
		Calendar cal = new Calendar();
		System.out.printf("The biggest dates of the month %d is %d \n", month, cal.getMaxdaysOftheMonth(month));
		

	}

}
