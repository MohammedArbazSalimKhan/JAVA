package inheritance;

public class Puppy extends Dog  {
	public void play() {
		System.out.println("My dog is Playing");
	}
	public static void main(String[] args) {
		Puppy pup=new Puppy();
		pup.eat();
		pup.bark();
		pup.play();
		
	}

}
