package DZ_OOP.interfaces;

public class Person implements Info{ //этот класс реализует в себе метод Info
    public String name;

    public Person(String name){
        this.name = name;
    }

    public void petAnAnimal(){
        System.out.println("Go pet!!!");
    }

    public void showInfo(){
        System.out.println("Name person is " + this.name); //реализ.интерфейса
    }
}
