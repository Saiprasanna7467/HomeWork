package basicprograms;

public class HelloWorld {

	
	public void firstMethod() {
		System.out.println("Hi");
	}
	public String secondMethod(String s) {
		s="Hi again";
		return s;
	}
	public static void main(String[] args) {
		HelloWorld h = new HelloWorld();
		Addition a = new Addition();
		a.add();
		h.firstMethod();
		System.out.println("Hi" + h.secondMethod("hi"));
	}
}
