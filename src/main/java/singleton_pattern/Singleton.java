package singleton_pattern;

public class Singleton {
    private static Singleton singletonInstance = new Singleton();

    private Singleton(){

    }

    //Get the only object available
    public static Singleton getInstance(){
        return singletonInstance;
    }

    public void simpleMethod(){
        System.out.println("hashcode of sigleton object" + singletonInstance);
    }
}
