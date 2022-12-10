package DZ_OOP.interfaces;

import DZ_OOP.Person_task1;

public class Test {
    public static void main(String[] args){
        AnimalHome animal = new AnimalHome(1);
        Person person = new Person("Bob");
        animal.showInfo();
        person.showInfo();


    }

}
