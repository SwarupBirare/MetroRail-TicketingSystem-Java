import java.util.Scanner;
public class MetroRail
{
	private int ticketID;
	private String passengerName;
	private String departureStation;
	private String arrivalStation;
	private String seatType;
	private int pricePerTicket;
	private int numberOfTickets;
	private int totalFare;

MetroRail()
{
 	 this.ticketID=111;
     this.passengerName="Swarup Birare";
     this.departureStation="Swargate";
     this.arrivalStation="Deccan";
     this.seatType="Economy";
     this.pricePerTicket=20;
     this.numberOfTickets=1;
     this.totalFare=1;
}
MetroRail(int ticketID, String passengerName, String departureStation, String arrivalStation, 
	String seatType, int pricePerTicket, int numberOfTickets, int totalFare)
{
	this.ticketID=ticketID;
	this.passengerName=passengerName;
	this.departureStation=departureStation;
	this.arrivalStation=arrivalStation;
	this.seatType=seatType;
	this.pricePerTicket=pricePerTicket;
	this.numberOfTickets=numberOfTickets;
	this.totalFare=totalFare;

}

void setTicketID(int tID)
{
	this.ticketID=tID;
}
void setPassengerName(String pN)
{
	this.passengerName=pN;
}
void setDepartureStation(String dS)
{
	this.departureStation=dS;
}
void setArrivalStation(String aS)
{
	this.arrivalStation=aS;
}
void setSeatType(String sT)
{
	this.seatType=sT;
}
void setPricePerTicket(int pPT)
{
	this.pricePerTicket=pPT;
}
void setNumberOfTickets(int nOT)
{
	this.numberOfTickets=nOT;
}
void setTotalFare(int tF)
{
	this.totalFare=tF;
}


int getTicketID()
{
	return ticketID;
}
String getPassengerName()
{
	return passengerName;
}
String getArrivalStation()
{
	return arrivalStation;
}
String getDepartureStation()
{
	return departureStation;
}
String getSeatType()
{
	return seatType;
}
int getPricePerTicket()
{
	return pricePerTicket;
}
int getNumberOfTickets()
{
	return numberOfTickets;
}
int getTotalFare()
{
	return totalFare;
}
private int choice1;
int chooseDeparture()
{
	Scanner sc= new Scanner(System.in);
	 System.out.println("Select Departure Station:");
        System.out.println("1. Vanaz");
        System.out.println("2. Ideal Colony");
        System.out.println("3. Nal Stop");
        System.out.println("4. Garware College");
        System.out.println("5. Deccan");
        System.out.println("6. Ch. Sambhaji Maharaj Park");
        System.out.println("7. Manapa");
        System.out.println("8. Civil Court");
        System.out.println("9. Ramtekdi");
        System.out.print("Enter your choice (1-9): ");
        choice1=sc.nextInt();

        switch(choice1)
        {
        case 1: setDepartureStation("VANAZ");
        	break;
        case 2: setDepartureStation("IDEAL COLONY");
        	break;
        case 3: setDepartureStation("NAL STOP");
        	break;
        case 4: setDepartureStation("GARWARE COLLEGE");
        	break;
        case 5: setDepartureStation("DECCAN");
        	break;
        case 6: setDepartureStation("CH. SAMBHAJI MAHARAJ PARK");
        	break;
        case 7: setDepartureStation("MANAPA");
        	break;
        case 8: setDepartureStation("CIVIL COURT");
        	break;
        case 9: setDepartureStation("RAMTEKDI");
        	break;
   		default:
            System.out.println("Invalid choice. Please select a valid option.");
            System.exit(0);
            break;
        }
        System.out.println(choice1);
        return choice1;
}
private int choice2;
int chooseArrival()
{
	Scanner sc= new Scanner(System.in);
	 System.out.println("Select Departure Station:");
        System.out.println("1. Vanaz");
        System.out.println("2. Ideal Colony");
        System.out.println("3. Nal Stop");
        System.out.println("4. Garware College");
        System.out.println("5. Deccan");
        System.out.println("6. Ch. Sambhaji Maharaj Park");
        System.out.println("7. Manapa");
        System.out.println("8. Civil Court");
        System.out.println("9. Ramtekdi");
        System.out.print("Enter your choice (1-9): ");
        choice2=sc.nextInt();

        switch(choice2)
        {
        case 1: setArrivalStation("VANAZ");
        	break;
        case 2: setArrivalStation("IDEAL COLONY");
        	break;
        case 3: setArrivalStation("NAL STOP");
        	break;
        case 4: setArrivalStation("GARWARE COLLEGE");
        	break;
        case 5: setArrivalStation("DECCAN");
        	break;
        case 6: setArrivalStation("CH. SAMBHAJI MAHARAJ PARK");
        	break;
        case 7: setArrivalStation("MANAPA");
        	break;
        case 8: setArrivalStation("CIVIL COURT");
        	break;
        case 9: setArrivalStation("RAMTEKDI");
        	break;
   		default:
            System.out.println("Invalid choice. Please select a valid option.");
            System.exit(0);
            break;
        }
        System.out.println(choice2);
        return choice2;
}
private int choice;
int chooseSeat()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Select Seat Tyoe:");
		System.out.println("1. ECONOMY");
		System.out.println("2. BUSSINESS");

	choice=sc.nextInt();
	switch(choice)
	{
	case 1: setSeatType("ECONOMY");
		break;
	case 2: setSeatType("BUSINESS");
		break;
	default: 
		System.out.println("Invalid choice. Please select a valid option.");
            System.exit(0);
            break;
	}
	return choice;
}

int priceTicket()
{
	int price;
	int count=0;
	if(choice1<choice2)
	{
		count=choice2-choice1;
	}
	else
	{count=choice1-choice2;}

if (seatType.equals("BUSINESS"))
{
	if(count==1)
	{
		price=10;
	}
	else if(count==2)
	{
		price=20;
	}
	else if(count==3)
	{
		price=30;
	}
	else if(count==4)
	{
		price=40;
	}
	else if(count==5)
	{
		price=50;
	}
	else if(count==6)
	{
		price=60;
	}
	else if(count==7 )
	{
		price=70;
	}
	else if(count==8)
	{
		price=80;
	}
	else 
	{
		price=100;
		System.out.println("Enjoy Metro for 1 day");
	}
	this.pricePerTicket = price; 
	return pricePerTicket;
}
else{
	if(count==1)
	{
		price=5;
	}
	else if(count==2)
	{
		price=10;
	}
	else if(count==3)
	{
		price=15;
	}
	else if(count==4)
	{
		price=20;
	}
	else if(count==5)
	{
		price=25;
	}
	else if(count==6)
	{
		price=30;
	}
	else if(count==7)
	{
		price=35;
	}
	else if(count==8)
	{
		price=40;
	}
	else 
	{
		price=50;
		System.out.println("Enjoy Metro for 1 day");
	}
	this.pricePerTicket = price;
	return pricePerTicket;
}
}

int total()
{
	totalFare=pricePerTicket * numberOfTickets;
	return totalFare;
}

}