package Study;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car("BMW","Tesla",2021);
		
		car.setYear(2022);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}

}
