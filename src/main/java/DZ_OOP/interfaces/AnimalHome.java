package DZ_OOP.interfaces;

public class AnimalHome implements Info{ //этот класс реализует в себе метод Info
    public int id; // у каждого животного будет свой идентификатор

    public  AnimalHome(int iid){
        this.id = iid;
    }
    public void sleep(){
        System.out.println("I am sleeping!!!");
    } // каждое животное будет спать
    public void showInfo(){
        System.out.println("Id animal is " + this.id); // реализ.интерфейса
    }
}
