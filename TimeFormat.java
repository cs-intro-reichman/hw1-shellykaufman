// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String time = "";
		String min = "";
		if(minutes >= 0 && minutes < 10){
		
			min = "0" + minutes + "";
		}
		else{
			min = minutes + "";
		}
		
		if (hours >= 0 && hours <=11){
				time = hours + ":" + min + " AM";
		}
		if(hours >= 12 && hours <=23){
				time = hours - 12 + ":" + min + " PM";
		}
		System.out.println(time);
	}
}