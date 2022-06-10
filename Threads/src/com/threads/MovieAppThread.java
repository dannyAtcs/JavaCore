package com.threads;

class MovieApp
{
	int AvailableSeats=10;
	
	synchronized void BookSeats(int seats)
	{
		if(seats>AvailableSeats)
		{
			System.out.println(seats + " Seats are not available");
			System.out.println("Only " + AvailableSeats + " seats are available");
		}
		else
		{
			System.out.println(seats + " Seats Booked Successfully");
			AvailableSeats = AvailableSeats - seats;
			System.out.println("Remaining Seats " + AvailableSeats);
		}
		
	}
}

public class MovieAppThread extends Thread
{
	static MovieApp m;
	int seats;
	public void run()
	{
		m.BookSeats(seats);
	}
	public static void main(String[] args) {
		
		m = new MovieApp();
		MovieAppThread t1 = new MovieAppThread();
		t1.seats = 4;
		t1.start();
		MovieAppThread t2 = new MovieAppThread();
		t2.seats = 5;
		t2.start();
		MovieAppThread t3 = new MovieAppThread();
		t3.seats = 2;
		t3.start();
	
	}
}