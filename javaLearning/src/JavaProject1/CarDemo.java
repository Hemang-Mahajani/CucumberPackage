package JavaProject1;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car maruti = new Car();
		Car Hyundai = new Car();
		Car Volkswagon = new Car();
		
		maruti.model = "Swift";
		maruti.cost = 500000;
		maruti.colour = "Black";
		
		Hyundai.model = "I20 Active";
		Hyundai.colour = "White";
		Hyundai.cost = 700000;
		
		Volkswagon.model = "Polo";
		Volkswagon.colour = "Red";
		Volkswagon.cost = 600000;
		
		maruti.StartCar();
		maruti.CarDetails();
		maruti.StopCar();
		
		Hyundai.StartCar();
		Hyundai.CarDetails();
		Hyundai.StopCar();
		
		Volkswagon.StartCar();
		Volkswagon.CarDetails();
		Volkswagon.StopCar();
	}
	
static class Car {
	
		String model;
		String colour;
		int cost;
		
	public void StartCar() {
		
		System.out.println(model + "Started");
	}
	public void CarDetails() {
		
		System.out.println("The Model of the car is " + model);
		System.out.println("The cost of the car is " + cost);
		System.out.println("The colour of the car is " + colour);
	}

	public void StopCar() {
		System.out.println(model + "Stopped");
		System.out.println("");
		System.out.println("----------------------------------");
	}
}
}
		
	


