package Learnjava;

import net.bytebuddy.implementation.bind.annotation.Super;

class Animal
{
	 int animalleg= 4;
	}
class Mammal extends Animal
{
	String animalname="COW";
	void property()
	{
		System.out.println("Animals legs:"+super.animalleg);
		System.out.println("Animal name:"+animalname);
	}
}

public class Supervariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal obj=new Mammal();
		obj.property();
		

	}

}
