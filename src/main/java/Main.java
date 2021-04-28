import Factory.Animal;
import Factory.Rabbit;
import Factory.Wolf;
import Info.AnimalInfo;
import Info.WolfInfo;

public class Main {

//  Inspired by
//  https://refactoring.guru/ru/design-patterns/factory-method
//  https://javarush.ru/groups/posts/2372--patternih-proektirovanija-factorymethod
  private static Animal animal;
  public static void main(String[] args) {
	animal = new Rabbit();
	animal.getAnimalName();
	
	animal = new Wolf();
	animal.getAnimalName();
	AnimalInfo info = animal.createInfo();
	info.sayName();
	
	
  }
  
}
