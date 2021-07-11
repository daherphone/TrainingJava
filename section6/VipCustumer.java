package section6;

public class VipCustumer {
private String name;
private double credit;
private String email;

public VipCustumer(String name, double credit, String email) {
	this.name = name;
	this.credit = credit;
	this.email = email;
}
public VipCustumer() {
	this("dada",1400,"daher@dtp.com");
}
public VipCustumer(String name, String email) {
	this(name,1200,email);
}
public String getName() {
	return name;
}
public double getCredit() {
	return credit;
}
public String getEmail() {
	return email;
}

}
