package DZ_OOP.interfaces;

public class AnimalHome implements Info{
    public int id;

    public  AnimalHome(int iid){
        this.id = iid;
    }
    public void sleep(){
        System.out.println("I am sleeping!!!");
    }
    public void showInfo(){
        System.out.println("Id is " + this.id); // реализ.интерфейса
    }
}
