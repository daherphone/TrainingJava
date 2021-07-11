package section5;

public class FirstAndLastDigit {
public static int  sumFirstAndLastDigit(int number) {
	int res=0;
	int first=number%10,last=number%10;
	if(number<0)return -1;
	while(number>=10) {
		number/=10;
		last=number;
	}
	res=first+last;
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sumFirstAndLastDigit(-10));
	}

}
