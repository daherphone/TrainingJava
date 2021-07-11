package section7;

public class Car {
private boolean engine;
private int cylinders;
private String name;
private  int wheels;
public int getWheels() {
	return wheels;
}
public void setWheels(int wheels) {
	this.wheels = wheels;
}
public Car(int cylinders, String name) {
	this.cylinders = cylinders;
	this.name = name;
	setEngine(true);
	wheels=4;
}
public String startEngine()
{return getClass().getSimpleName()
		+" -> startEngine()";
	}
public String accelerate()
{return getClass().getSimpleName()
	+" -> accelerate()"	;
}
public String brake()
{return getClass().getSimpleName() 
	+" -> brake()";
}
public int getCylinders() {
	return cylinders;
}
public String getName() {
	//this.setEngine(isEngine());
	return name;
}
public boolean isEngine() {
	return engine;
}
protected void setEngine(boolean engine) {
	this.engine = engine;
} 

}
