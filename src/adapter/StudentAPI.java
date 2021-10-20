package adapter;

public interface StudentAPI {
	public void printStudentScore(int sid);
	public void printStatistics();
}

//all variables declared in an interface class must be public static final
//methods should be public abstract even if you declare it abstract or not
/*

Abstract class in java can’t be instantiated.

We can use abstract keyword to create an abstract method, an abstract method doesn’t have body.

If a class have abstract methods, then the class should also be abstract 
using abstract keyword, else it will not compile.

It’s not necessary for an abstract class to have abstract method. We can mark a class as abstract 
even if it doesn’t declare any abstract methods.

If abstract class doesn’t have any method implementation, its better to use interface 
because java doesn’t support multiple class inheritance.

The subclass of abstract class in java must implement all the abstract methods 
unless the subclass is also an abstract class.

All the methods in an interface are implicitly abstract 
unless the interface methods are static or default. Static methods and default methods in interfaces 
are added in Java 8, for more details read Java 8 interface changes.

Java Abstract class can implement interfaces without even providing
 the implementation of interface methods.
 
Java Abstract class is used to provide common method implementation to all 
the subclasses or to provide default implementation.

We can run abstract class in java like any other class if it has main() method.

*/