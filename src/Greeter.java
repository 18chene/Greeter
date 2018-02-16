
public class Greeter {
	private int age;
	private String name;
	public Greeter() {
		age = 1;
		name = "Jack";
	}
	public Greeter(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "Greeter: name -- " + name + " age -- " + age;
	}
}
