package greeting3;

public class person {
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

	// コンストラクタにlastNameを追加
	public person(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		person.count++;
	}

	// オーバーロード：名前 + 苗字,count++を追加
	public person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = 0;
		this.height = 0.0;
		this.weight = 0.0;
		person.count++;
	}

	public String fullName() {
		return this.firstName + " " + this.lastName;
	}

	public void print() {
		System.out.println("名前は " + this.fullName() + " です");
		System.out.println("年は " + this.age + " 歳です");
		System.out.println();
	}

	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	public static void printCount() {
		System.out.println("合計 " + person.count + " 人です");
	}

	// インスタンスメソッドbuyを定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}

}
