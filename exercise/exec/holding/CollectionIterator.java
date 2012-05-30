package exec.holding;

import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionIterator implements Iterable<Pet>{
	private Pet[] pets = Pets.createArray(10);
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>(){
			private int index = 0;
			@Override
			public boolean hasNext() {
				 return index < pets.length;
			}

			@Override
			public Pet next() {
				return pets[index++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
	}
	public static void main(String a[]){
		CollectionIterator ci = new CollectionIterator();
		for(Pet p:ci){
			System.out.println(p);
		}
	}
}
