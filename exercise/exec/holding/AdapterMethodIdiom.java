package exec.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {
	  public ReversibleArrayList(Collection<T> c) { super(c); }
	  public Iterable<T> reversed() {
	    return new Iterable<T>() {
	      public Iterator<T> iterator() {
	        return new Iterator<T>() {
	          int current = size() - 1;
	          public boolean hasNext() { return current > -1; }
	          public T next() { return get(current--); }
	          public void remove() { // Not implemented
	            throw new UnsupportedOperationException();
	          }
	        };
	      }
	    };
	  }
	}
public class AdapterMethodIdiom<T> extends ReversibleArrayList<T>{

	public AdapterMethodIdiom(Collection<T> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Iterator<T> iterator(){
		return new Iterator<T>(){
			private int index = size()-1;
			@Override
			public boolean hasNext() {
				return index > -1 ;
			}

			@Override
			public T next() {
				return get(index -- );
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	public static void main(String[] args) {
		    ReversibleArrayList<String> ral =
		      new ReversibleArrayList<String>(
		        Arrays.asList("To be or not to be".split(" ")));
		    // Grabs the ordinary iterator via iterator():
		    for(String s : ral)
		      System.out.print(s + " ");
		    System.out.println();
		    // Hand it the Iterable of your choice
		    for(String s : ral.reversed())
		      System.out.print(s + " ");
		    AdapterMethodIdiom<String> ami = new AdapterMethodIdiom<String>(Arrays.asList("1 2 3 4 5".split(" ")));
		    for(String s : ami)
			      System.out.print(s + " ");
		  }

}
