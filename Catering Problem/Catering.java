package catering;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Catering {
public static Scanner in = new Scanner(System.in);

public static void main(String args[]) throws ParseException{
	Event event = getEventInfo();
	event.printEvent();
}
public static Event getEventInfo() throws ParseException{
	String eventType = getEventType();
	int guests = getNumGuests();
	String eventDate = getDate();
	Event event = new Event(eventType, eventDate,guests);
	return event;
}
		public static int getNumGuests() {
			System.out.println("Expected number of guests?");
			while(!in.hasNextInt()) {
				System.out.println("Invalid value");
				in.nextLine();
			}
			int guests = in.nextInt();
			in.nextLine();
			return guests;
		}
	public static String getEventType() {
		int selection =0;
		boolean firstTime = true;
		do {
			if(firstTime == true) 
				firstTime = false;
			else
				System.out.println("please try again");
			System.out.println("What event is being hosted?"
					+"\n1.Wedding"
					+"\n2.Birthday"
					+"\n3.Other"
					);
			selection= in.nextInt();
			in.nextLine();} while(selection!= 1 && selection!=2 && selection !=3 );
		switch(selection) {
		case 1:
			return "Wedding";
		case 2:
			return "Birthday";
		case 3:
			System.out.println("Enter the name of the event");
			String eventName = in.nextLine();
			return eventName;
			}
		return "no type selected";
		}
	public static String getDate() throws ParseException {
		System.out.println("when is the event?");
		String inDate= in.nextLine();
		DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
		Date eventd = null;
		try {
			eventd = df.parse(inDate);
		}
		catch(ParseException e) {
			System.out.println("Format Error in Date");
		}
		 String finalDate = df.format(eventd);
		 return finalDate;
	}
}


