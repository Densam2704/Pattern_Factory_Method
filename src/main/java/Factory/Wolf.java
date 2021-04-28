package Factory;

import Factory.Animal;
import Info.AnimalInfo;
import Info.WolfInfo;

public class Wolf extends Animal {
  
  public AnimalInfo createInfo() {
	System.out.println("Getting wolf info");
    return new WolfInfo();
  }
}
