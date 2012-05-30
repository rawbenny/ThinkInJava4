package exec.holding;

import java.util.Collection;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class CollectionSequence implements Collection<Pet>{

	private Pet[] pets = Pets.createArray(10);
	
	@Override
	public boolean add(Pet arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Pet> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Pet> iterator() {
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
				throw new UnsupportedOperationException();
			}
			
		};
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return this.pets.length;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String args[]){
		CollectionSequence cs = new CollectionSequence();
		for(Pet t : cs){
			System.out.println(t);
		}
	}

}
