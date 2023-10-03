public class Singleton {
    private  static Singleton Singleton;
    private Singleton(){

    }

    public static Singleton getInstance() {
        if(Singleton==null){
            Singleton=new Singleton();
        }else {
            System.out.println("Ya existe!");
        }
        return Singleton;
    }
}