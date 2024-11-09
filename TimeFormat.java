public class TimeFormat {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int ampm = 3;// 1 = AM 0 = pm

		
		if(hours> 0 && hours<12){ // Find a.m.
			System.out.print(hours + ":");
			ampm = 1;
		}
		else{
		 if(hours>12)  { // find pm p.m.
			System.out.print((hours - 12) + ":");
			ampm = 0;
		 }
		 else{// Different cases
			if (hours == 0) { 
				System.out.print(hours + ":");
				ampm = 1;
			}
			if (hours == 12) {
				System.out.print(hours + ":");
				ampm = 0;
			}
		 }
		}
		
		if (minutes < 10) {
			System.out.print("0");
		}

		if (ampm == 1){
			System.out.println(minutes + " AM");
		}
		else{
			System.out.println(minutes + " PM");
		}
		

	}
}