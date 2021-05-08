package Study;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car("BMW","Tesla",2021);
		Car car1 = new Car("BMW1","Tesla1",2022);
	 
		 car1.copy(car);
		 
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
	}

}
