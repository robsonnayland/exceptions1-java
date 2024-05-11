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
		int number =  sc.nextInt();
		System.out.println("Check-in date (dd/mm/yyyy):");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check-Out date (dd/mm/yyyy):");
		Date checkOut = sdf.parse(sc.next());
		
		String error = reservation.updateDates(checkIn,checkOut);
		
		if (error != null) {
			System.out.println("error in reservation"+ error);
		}else {
			System.out.println("Reservation"+ reservation);
		}
		
		
		
		
		
		sc.close();

	}

} 
