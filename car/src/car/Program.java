package car;

public class Program {

	public static void main(String[] args) {
		
		Car car = new Car ("Toyota ", false, 118005, 7500.99 );
		car.printCar();
		System.out.println("===> zmieniam wartości");
		car.setMilleage(118010);
		System.out.println("Nowy przebieg: " + car.getMilleage());
	}

}
