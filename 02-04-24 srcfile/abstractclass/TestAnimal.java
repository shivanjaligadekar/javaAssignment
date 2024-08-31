package abstractclass;
abstract class Animal{
	int legs=4;
	public abstract void sound();
	public void classInfo(String type) {
		System.out.println("I am from" + type + "family..");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("the dog barks....");
		System.out.println("I have " + legs + "no of legs:");
		
	}
}
class Lion extends Animal{
	public void sound() {
		System.out.println("the lion barks....");
		System.out.println("I have " + legs + "no of legs:");
		
	}
}
public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("-------Dog-------");
		Dog d=new Dog();
		d.sound();
		d.classInfo(" Dog ");
		
		System.out.println("-------Lion-------");
		Lion l=new Lion();
		l.sound();
		l.classInfo(" Lion ");
		
		

	}

}
