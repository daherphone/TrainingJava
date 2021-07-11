package section6;

public class Main {
public static void main(String[] args) {
//	SimpleCalculator calculator = new SimpleCalculator();
//	calculator.setFirstNumber(5.0);
//	calculator.setSecondNumber(4);
//	System.out.println("add= " + calculator.getAdditionResult());
//	System.out.println("subtract= " + calculator.getSubtractionResult());
//	calculator.setFirstNumber(5.25);
//	calculator.setSecondNumber(0);
//	System.out.println("multiply= " + calculator.getMultiplicationResult());
//	System.out.println("divide= " + calculator.getDivisionResult());

//	OUTPUT
//
//	add= 9.0
//	subtract= 1.0
//	multiply= 0.0
//	divide= 0.0
	VipCustumer cust2, cust1=new VipCustumer("sada", 130, "sada@email");
	System.out.println(cust1.getEmail());
	cust2=new VipCustumer();
	System.out.println(cust2.getEmail());
	cust2=new VipCustumer("dd","ddmail");
	System.out.println(cust2.getEmail());
	
	
}
}
