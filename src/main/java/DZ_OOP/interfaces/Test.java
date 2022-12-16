package DZ_OOP.interfaces;

import DZ_OOP.Person_task1;

public class Test {
    public static void main(String[] args){

//        AnimalHome cat = new AnimalHome(1);
//        AnimalHome dog = new AnimalHome(2);
//        Person person = new Person("Bob");
//        cat.showInfo();
//        dog.showInfo();
//        person.showInfo();

        // оба класса реализуют 1 интерфейс Info, поэтому можно написать так:
        Info info1 = new AnimalHome(1);
        Info info2 = new Person("Bob");
        // также можем создать новые объекты класса AnimalHome и Person, которые реализуют класс Info:
        AnimalHome animal = new AnimalHome(2);
        Person person = new Person("Make");
        outputInfo(info1);
        outputInfo(info2);
        // и также новые объекты передать в качестве аргументов в метод outputInfo:
        outputInfo(animal);
        outputInfo(person);

    }
    // метод outputInfo теперь может действовать на любом из объектов, класс которого реализует интерфейс Info
    // тоесть в этот метод мы можем подать в качестве аргументов AnimalHome, Person
    public static void outputInfo(Info info){  // это метод принимает на вход "нечто", что реализует интерфейс Info
        info.showInfo();
    }

}
