package scheduler;

import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		DaysOfTheWeek[] days = DaysOfTheWeek.values();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to weekly sceduler.");
		System.out.println("\r\n do you want to add an event. (reply Yes or No)");	
		
		
		if (scan.nextLine().equals("Yes")) {
			System.out.println("What day do you want to add it on?");
			String day = scan.nextLine();
			System.out.println("What time do you want to add it on?(example: (11:15 PM))");
			String time = scan.nextLine();
			time = time.trim();
			int hour;
			int minute;
			
			
			
			if (time.charAt(2) == ':') {
				hour = Integer.parseInt(Character.toString(time.charAt(0)) + Character.toString(time.charAt(1)));
				if (hour > 12) {
					System.out.println("This is not a real time.");
				}
				if (time.charAt(5) == ' ') {
					minute = Integer.parseInt(Character.toString(time.charAt(3)) + Character.toString(time.charAt(4)));
				}else if (time.charAt(4) == ' ') {
					minute = Integer.parseInt(Character.toString(time.charAt(3)));
				}else {
					minute = -1;
				}
			}else if (time.charAt(1) == ':') {
				hour = Integer.parseInt(Character.toString(time.charAt(0)));
				if (time.charAt(4) == ' ') {
					minute = Integer.parseInt(Character.toString(time.charAt(2)) + Character.toString(time.charAt(3)));
				}else if (time.charAt(3) == ' ') {
					minute = Integer.parseInt(Character.toString(time.charAt(2)));
				}else {
					minute = -1;
				}
			}else {
				hour = -1;
				minute = -1;
			}
			
			
			switch (day) {
			
	        case "Monday":
	            days[0].times.add(hour);
	            days[0].times.add(minute);
	            break;
	        case "Tuesday":
	            System.out.println("1 from switch");
	            break;
	        case "Wednesday":
	            System.out.println("2 from switch");
	            break;
	        case "Thursday":
	            System.out.println("0 from switch");
	            break;
	        case "Friday":
	            System.out.println("1 from switch");
	            break;
	        case "Saturday":
	            System.out.println("2 from switch");
	            break;
	        case "Sunday":
	        	break;
	        default:
	            System.out.println("You did not put a day or spelled it incorrectly, try again.");
	            break;
	        }
			
			
		}else if(scan.nextLine().equals("No")) {
			System.out.println("ok");
		}else {
			System.out.println("You did not enter Yes or No.");
		}
	}
}
