/*
Animal Shelter: An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
that type). They cannot select which specific animal they would like. Create the data structures to
maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
and dequeueCat. You may use the built-in Linkedlist data structure.

*/
import java.util.LinkedList;


class Animal{
	String name;
	int num;
	Animal(String name){
		this.name = name;
	}

	boolean isOlderAnimal(Animal a){
		return this.num > a.num; 
	}
}

class Dog extends Animal{

	Dog(String name){
		super(name);
	}
}

class Cat extends Animal{

	Cat(String name){
		super(name);
	}
}

class AnimalShelterQueue{
	LinkedList<Dog> dogs;
	LinkedList<Cat> cats;
	int insertionOrder;
	AnimalShelterQueue(){
		dogs = new LinkedList<>();
		cats = new LinkedList<>();
		insertionOrder = 0;
	}

	public void enQueue(Animal animal){
		if(animal instanceof Dog){
			dogs.addLast((Dog)animal);
		}	
		if(animal instanceof Cat){
			cats.addLast((Cat)animal);
		}
		animal.num = insertionOrder;
		insertionOrder++;
	}

	public Animal deQueueDogs(){
		return dogs.poll();
	}

	public Animal deQueueCats(){
		return cats.poll();
	}

	public Animal deQueueAny(){
		if(cats.size() == 0){
			return dogs.poll();
		}
		if(dogs.size() == 0){
			return cats.poll();
		}

		Dog d = dogs.peek();
		Cat c = cats.peek();
		if(d.isOlderAnimal(c)){
			return cats.poll();
		}
		else{
			return dogs.poll();
		}
	}

}
