package exec.exceptions;

class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

class TrivialException extends Exception{
	public String toString(){
		return "very minal exception.";
	}
}

public class Exec18 {

	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	void g() throws TrivialException {
		throw new TrivialException();
	}
	public static void main(String[] args) {
		Exec18 lm = new Exec18();
		try{
			
			try {
				
				try {
					lm.f();
				} finally {
					lm.dispose();
				}
			} catch (Exception e) {
				System.out.println(e);
				lm.g();
			}
		}catch(Exception e){
			
		}
	}

}
