// gitpackage  27Aug;

import java.util.Scanner;

public class RailwayReservationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int seatCapacity = 5;  
        int bookedSeats = 0;
        int waitingList = 0;

        System.out.println("Welcome to Railway Reservation System ");

        
        do {
            System.out.println("\nChoose Train no:");
            System.out.println("1. Rajdhani Express ");
            System.out.println("2. Shatabdi Express ");
            System.out.println("3. Duronto Express ");
           System.out.println("Enter your train no");
            int choice = sc.nextInt();

            int fare = 0;
            String trainName = "";
            switch (choice) {
                case 1:
                    trainName = "Rajdhani Express";
                    fare = 1500;
                    break;
                case 2:
                    trainName = "Shatabdi Express";
                    fare = 1200;
                    break;
                case 3:
                    trainName = "Duronto Express";
                    fare = 1000;
                    break;
                default:
                    System.out.println("Default to Duronto Express.");
                    trainName = "Duronto Express";
                    fare = 1000;
            }

           
            System.out.print("Enter number of passengers to book: ");
            int numPassengers = sc.nextInt();

            for (int i = 1; i <= numPassengers; i++) {
                if (bookedSeats < seatCapacity) {  // seat available
                    bookedSeats++;
                    System.out.println("Passenger " + i + " booked on " + trainName + " | Fare: " + fare);
                } else {  // no seat → waiting list
                    waitingList++;
                    System.out.println("Passenger " + i + " added to WAITING LIST.");
                }
            }

            // Continue booking until train is full
            System.out.print("\nDo you want to book more tickets? (y/n): ");
            char moreBooking = sc.next().charAt(0);

            if (moreBooking == 'n' || bookedSeats >= seatCapacity) {
                break;
            }

        } while (true);

        System.out.println("Total Seats: " + seatCapacity);
        System.out.println("Seats Booked: " + bookedSeats);
        System.out.println("Waiting List: " + waitingList);

        sc.close();
    }
}

