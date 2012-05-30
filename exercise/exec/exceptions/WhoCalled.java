package exec.exceptions;
//: exceptions/WhoCalled.java
// Programmatic access to stack trace information.

public class WhoCalled {
	static void e() throws Exception{
		try{
			throw new Exception("d");
		}catch(Exception e){
			throw e;
		}
	}
  static void f() {
    // Generate an exception to fill in the stack trace
    try {
      e();
    } catch (Exception e) {
      for(StackTraceElement ste : e.getStackTrace())
        System.out.println(ste.getMethodName());
    }
  }
  static void g() { f(); }
  static void h() { g(); }
  public static void main(String[] args) {
    f();
    System.out.println("--------------------------------");
    g();
    System.out.println("--------------------------------");
    h();
  }
} /* Output:
f
main
--------------------------------
f
g
main
--------------------------------
f
g
h
main
*///:~
