import java.util.*;
public class Test{
	static void inputPassenger(MetroRail arr[])
		{
			Scanner sc = new Scanner (System.in);
		for(int i=0; i<arr.length; i++)
		{
			MetroRail mr=new MetroRail ();

			mr.setTicketID((i));
			System.out.println("Enter the Name:");
			mr.setPassengerName(sc.nextLine());
			System.out.println("Enter the no of Tickets:");
			mr.setNumberOfTickets(sc.nextInt());

			sc.nextLine();

			System.out.println("---**Departure-Station**---");
			mr.chooseDeparture();
			System.out.println("---**Arrival-Station**---");
			mr.chooseArrival();
			System.out.println("---**Seat-Type**---");
			mr.chooseSeat();

			int price=mr.priceTicket();
			System.out.println("---**Price-per-Ticket**---\n"+price);

			int totalFare=mr.total();
			System.out.println("---**Total-Fare**---\n"+totalFare);


			System.out.println("----------------------\n");
			arr[i]=mr;
		}
			sc.close();
		}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int size;
		System.out.println("------------------------");
		System.out.println("WELCOME-TO-METRO_RAIL");
		System.out.println("------------------------");
		System.out.println("Enter the size: ");
		size=sc.nextInt();
		MetroRail arr[]=new MetroRail[size];
		inputPassenger(arr);
		//MetroRail m= new MetroRail();
		MetroRailOperation mro=new MetroRailOperation();

		mro.displayAll(arr);
		sc.close();
	}
}