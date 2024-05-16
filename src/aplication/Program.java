package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/mm/yyyy):");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-Out date (dd/mm/yyyy):");
		Date checkOut = sdf.parse(sc.next());
		
		
		Reservation reservation = new Reservation(number, checkIn, checkOut);

		String error = reservation.updateDates(checkIn, checkOut);

		if (error != null) {
			System.out.println("Error in reservation:" +error );
		} else {

			System.out.println("Reservation" + reservation);
			System.out.println();
			System.out.println("Enter data to update the reservation:");

			System.out.println("Check-in date (dd/mm/yyyy):");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-Out date (dd/mm/yyyy):");
			checkOut = sdf.parse(sc.next());

			reservation.updateDates(checkIn, checkOut);

			System.out.println("Reservation " + reservation);
		}
		sc.close();

	}

}
