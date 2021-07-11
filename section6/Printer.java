package section6;

public class Printer {
 private int tonerLevel;
 private int pagesPrinted;
 private boolean duplex;
public Printer(int tonerLevel, boolean duplex) {
	this.tonerLevel = (tonerLevel>=0 && tonerLevel<=100)?tonerLevel:-1;
	this.pagesPrinted = 0;
	this.duplex = duplex;
}
 public int addToner (int tonerAmmount) {
	 int res=-1;
	 if(tonerAmmount>0 && tonerAmmount<=100) {
		 if((tonerAmmount +tonerLevel)<=100) {
			 tonerLevel+=tonerAmmount;
			 res=tonerLevel;}
		 else res=-1;
	 }
	 else res=-1;
	return res;
}
 
 public int printPages (int pages) {
	 int pagesToPrint;
	 
	 if(duplex)pagesToPrint=(pages%2)==0?pages/2:(pages/2)+1;
	 else pagesToPrint=pages;
	 
	 this.pagesPrinted+=pagesToPrint;
	 return pagesToPrint;
 }
public int getPagesPrinted() {
	return pagesPrinted;
}
 
}
