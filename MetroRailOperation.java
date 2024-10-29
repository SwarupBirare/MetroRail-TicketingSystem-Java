public class MetroRailOperation
{
	MetroRail m=new MetroRail();
	public void displayAll(MetroRail arr[])
	{
		System.out.println("***DISPLAY-TICKET's***");
		for(int i=0;i<arr.length;++i){
    	System.out.println("Id: "+arr[i].getTicketID());
    	System.out.println("Name: "+arr[i].getPassengerName());
    	System.out.println("Depart: "+arr[i].getDepartureStation());
    	System.out.println("Arrive: "+arr[i].getArrivalStation());
    	System.out.println("SeatType: "+arr[i].getSeatType());
    	System.out.println("PricePerTkt: "+arr[i].getPricePerTicket());
    	System.out.println("No. of Tkts: "+arr[i].getNumberOfTickets());
    	System.out.println("Total Fare: "+arr[i].getTotalFare());
		System.out.println("---------------------");
		}

	}

	
}