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
    public void setName(String PersonName){
        name = PersonName; // назначение имени полю name, передав методу в параметры строку
    }
    public String getName() {
        return name; // метод возвращает строку (поле)
    }

    public void setMother(String PersonMother){
        Mother = PersonMother;
    }

    public String getMother(){
        return Mother;
    }

    public void setFather(String PersonFather){
        Father = PersonFather;
    }

    public String getFather(){
        return Father;
    }

    public void setGender(String PersonGender){
        gender = PersonGender;
    }

    public String getGender(){
        return gender;
    }

    public String getParent(){
        return String.format("Children - %s, Mother - %s, Father - %s, Gender - %s",
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
        System.out.println(person_0.getParent());


    }


}
