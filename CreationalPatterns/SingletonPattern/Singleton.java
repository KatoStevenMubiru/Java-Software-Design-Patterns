package SingletonPattern;

public class Singleton{

    public static Singleton instance = null;

//this is a constructor
    private Singleton(){

    }
    //This returns a single instance of the class
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();

        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Singleton is doing something");
    }
}