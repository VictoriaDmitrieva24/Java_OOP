package DZ_OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person_task1 {
    // поля для класса Person:
    private String name;
    private String Mother;
    private String Father;
    private String gender;
    List<Person_task1> children;


    // конструктор для класса Person:
    public Person_task1(String name, String Mother, String Father, String gender) {
        this.name = name;
        this.Mother = Mother;
        this.Father = Father;
        this.gender = gender;
        this.children = new ArrayList<Person_task1>();

    }

    public String getName() {
        return name;
    }

    public String getParent(){
        return String.format("Children - %s, Mother - %s, Father - %s",
                this.name, this.Mother, this.Father, this.gender );
    }

    class Relationship{
        public static int parent = 1;
        public static int children = 2;
    }

    public static void main (String[] args) {
        // выделяется память на класс Person
        Map<String, Person_task1> allPersons = new HashMap<String, Person_task1>();
        Person_task1 person_0 = new Person_task1("Victoria", "Vasylisa", "Misha", "women" );
        Person_task1 person_1 = new Person_task1("Ivan", "Masha", "Pety", "men" );
        Person_task1 person_2 = new Person_task1("Viktor", "Katy", "Vasi", "men");
        Person_task1 person_3 = new Person_task1("Vita", "Soul", "Gek", "women" );



    }
}
