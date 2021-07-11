package Section4;

public class PlayCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isCatPlaying1(boolean summer,int temperature) {
		if(temperature<25||temperature>45)return false;
		else if(summer)return true;
		else
			if(temperature<=35)return true;
			else return false;
	}
	public static boolean isCatPlaying(boolean summer,int temperature) {
		if(temperature<25||temperature>45)return false;
		if(summer)return true;
		
		if(temperature<=35)return true;
		return false;
	}
}
