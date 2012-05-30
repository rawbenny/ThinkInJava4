package exec.exceptions;

public class Exec1 extends Exception{
	public Exec1(String msg){
		super(msg);
	}
	public static void main(String a[]){
		try{
			throw new Exec1("Error!");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("i am in the finally clause.");
		}
	}
}
