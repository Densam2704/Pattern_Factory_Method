package Factory;

import Info.AnimalInfo;

public abstract class Animal {
  
  public void getAnimalName(){
    AnimalInfo info = createInfo();
    info.sayName();
  }
  
  public abstract AnimalInfo createInfo();
  
}
