package section5;

public class Pack { //, , and 
public static boolean canPack(int bigCount, int smallCount,int goal ) {
	boolean res=false;
	int total=bigCount*5+smallCount;
	int rem;
	
	if(bigCount<0 ||smallCount<0||goal<0 || total<goal) 
		return false;	
	int usedBig=goal/5;
	if((usedBig*5+smallCount)>=goal)return true;
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(canPack(3, 4, 9));
  System.out.println(canPack (1, 0, 4));
  System.out.println(canPack (1, 0, 5));
  System.out.println(canPack (0, 5, 4));
  System.out.println(canPack (2, 2, 11));
  System.out.println(canPack (-3, 2, 11));
  System.out.println(canPack (1, 0, 4));
	}

}
