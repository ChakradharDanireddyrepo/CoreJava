/**
 * 
 */
package staticandinstance;

/**
 * @author Chakradhar
 *Instance method can call another instance method without object provided both belongs to same class
 *static method can call another static method without Class name provided both belongs to same class
 *static method can call another instance method with object whether belongs to same class or not
 *instance method can call another static method with Class whether belongs to same class or not
 */
public class StaticInstance {

	/**
	 * @param args
	 */
	void instanceMethod1(){
		System.out.println("Instance Method1");
		System.out.println("Instance method2 called from method one without object");
		instanceMethod2();
	}
	void instanceMethod2(){
		System.out.println("Instance Method2");
		System.out.println("Static method called from instance with classname");
		StaticInstance.staticMethod1();
	}
	static void staticMethod1(){
		System.out.println("Static Method1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Instance method called from static main with object");
		StaticInstance si=new StaticInstance();
		si.instanceMethod1();
		System.out.println("Static method called from static main without class");
		staticMethod1();
	}

}
