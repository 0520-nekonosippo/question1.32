package greeting3;

public class main {
	public static void main(String[] args) {
		person person1 = new person("鈴木", "太郎", 20, 1.7, 60);
		// person1.print();

		person person2 = new person("山田", "花子", 22, 1.5, 40);
		// person2.print();

		// person.printCount();

		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		// ownerを設定
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());
		//System.out.println(car.getOwner());
		//System.out.println(bicycle.getOwner());

		// 乗り物を購入
		person1.buy(car);
		person2.buy(bicycle);
	}

}
