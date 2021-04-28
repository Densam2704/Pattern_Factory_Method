package Factory;

import Factory.Animal;
import Info.AnimalInfo;
import Info.RabbitInfo;

public class Rabbit extends Animal {
  public AnimalInfo createInfo() {
	System.out.println("Getting rabbit info");
	return new RabbitInfo();
  }
}
