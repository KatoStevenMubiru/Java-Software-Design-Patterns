package SingletonPattern;

public class Client{
    public static void main(String[] args){
        //Using the instance of the singleton
        Singleton singleInstance = Singleton.getInstance();

        singleInstance.doSomething();
    }
}