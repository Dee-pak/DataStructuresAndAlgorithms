/**
 * An animal shelter, which holds only dogs and cats, operates on a strictly "first in,
 * first out" basis. People must adopt either the "oldest" (based on arrival time) of all
 * animals at the shelter, or they can select whether they would prefer a dog or a cat
 * (and will receive the oldest animal of that type). They cannot select which specific
 * animal they would like. Create the data structures to maintain this system and implement
 * operations such as enqueue, dequeueAny, dequeueDog and dequeueCat. You may use the 
 * built-in LinkedList data structure.
 */
package stacksAndQueues;

import java.util.LinkedList;

/**
 * @author deepakkhobragade
 *
 */
public class AnimalShelter {
	
	
	static class Animal{
		String name;
		long timeStamp;
		
		public Animal(String n){
			name = n;
			timeStamp = System.nanoTime();
		}
	}
	
	static class Dog extends Animal{
		public Dog(String n){
			super(n);
		}
		
		public String toString(){
			return "Dog: " + name;
		}
	}
	
	static class Cat extends Animal{
		public Cat(String n){
			super(n);
		}
		
		public String toString(){
			return "Cat: " + name;
		}
	}
	
	private LinkedList<Dog> dogs = new LinkedList<Dog>();
	private LinkedList<Cat> cats = new LinkedList<Cat>();
	
	public void enqueue(Animal a){
		if(a instanceof Dog){
			dogs.add((Dog)a);
		}else if( a instanceof Cat){
			cats.add((Cat)a);
		}else{
			throw new IllegalArgumentException("Unknown animal type");
		}
	}
	
	public Dog dequeueDog(){
		if(dogs.isEmpty()){
			throw new IllegalStateException("No Dogs!");
		}
		return dogs.removeFirst();
	}
	
	public Cat dequeueCat(){
		if(cats.isEmpty()){
			throw new IllegalStateException("No Cats!");
		}
		return cats.removeFirst();
	}
	
	public Animal dequeueAny(){
		if(cats.isEmpty() && dogs.isEmpty()){
			throw new IllegalStateException("No Animals!");
		}else if(dogs.isEmpty()){
			return dequeueCat();
		}else if(cats.isEmpty()){
			return dequeueDog();
		}else if(dogs.getFirst().timeStamp < cats.getFirst().timeStamp){
			return dequeueDog();
		}else{
			return dequeueCat();
		}
	}
	
	public Animal peekAny(){
		if(cats.isEmpty() && dogs.isEmpty()){
			throw new IllegalStateException("No Animals!");
		}else if(dogs.isEmpty()){
			return cats.getFirst();
		}else if(cats.isEmpty()){
			return cats.getFirst();
		}else if(dogs.getFirst().timeStamp < cats.getFirst().timeStamp){
			return dogs.getFirst();
		}else{
			return cats.getFirst();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnimalShelter shelter = new AnimalShelter();
		shelter.enqueue(new Dog("dog1"));
		shelter.enqueue(new Dog("dog3"));
		shelter.enqueue(new Dog("dog5"));
		shelter.enqueue(new Cat("cat8"));
		shelter.enqueue(new Dog("dog5"));
		shelter.enqueue(new Cat("cat11"));
		shelter.enqueue(new Cat("cat7"));
		System.out.println(shelter.dequeueAny());
		System.out.println(shelter.dequeueCat());
		System.out.println(shelter.dequeueAny());
	}

}
