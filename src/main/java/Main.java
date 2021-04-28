import Factory.Animal;
import Factory.Rabbit;
import Factory.Wolf;

public class Main {

//  Inspired by https://refactoring.guru/ru/design-patterns/factory-method
  private static Animal animal;
  public static void main(String[] args) {
	animal = new Rabbit();
	animal.getAnimalName();
	
	
  }
  
}
