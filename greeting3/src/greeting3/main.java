package greeting3;

public class main {
	public static void main(String[] args) {
		person person1 = new person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();

		person person2 = new person("山田", "花子", 22, 1.5, 40);
		person2.print();

		person.printCount();
	}
}
