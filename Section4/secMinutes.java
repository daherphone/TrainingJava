package Section4;

public class secMinutes {
public static void getDurationString(int minutes,int seconds) {
	if(minutes <0 || seconds<0 || seconds>59)System.out.println("Invalid Value");
	else System.out.println(minutes/60+"h "
							+minutes%60+"m "+seconds+"s");
	
}
public static void getDurationString(int seconds) {
	if( seconds<0 )System.out.println("Invalid Value");
	else {
		int minutes= seconds/60;
		getDurationString(minutes, seconds%60);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getDurationString(121, 9);
		getDurationString(12000);
	}

}
