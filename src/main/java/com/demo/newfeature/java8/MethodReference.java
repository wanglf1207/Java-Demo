package com.demo.newfeature.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {

        PersonFactory factory = new PersonFactory(Person::new);

        List<Person> personList = new ArrayList<Person>();

        Person p1 = factory.getPerson();
        p1.setName("Kobe");
        personList.add(p1);
        Person p2 = factory.getPerson();
        p2.setName("James");
        personList.add(p2);
        Person p3 = factory.getPerson();
        p3.setName("Paul");
        personList.add(p3);

        Person[] persons1 = personList.toArray(new Person[personList.size()]);
        printArray(persons1);

        Arrays.sort(persons1, MethodReference::myCompare);
        printArray(persons1);
        System.out.println();

        Person[] persons2 = personList.toArray(new Person[personList.size()]);
        printArray(persons2);

        Arrays.sort(persons2, p1::compare);
        printArray(persons2);
        System.out.println();

        Person[] persons3 = personList.toArray(new Person[personList.size()]);
        printArray(persons3);

        Arrays.sort(persons3, Person::compareTo);
        printArray(persons3);
    }

    public static void printArray(Person[] persons) {
        for (Person p : persons) {
            System.out.print(p.name + "  ");
        }
        System.out.println();
    }

    public static int myCompare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }

    static class Person {
        private String name;

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }

        public int compareTo(Person p) {
            return this.getName().compareTo(p.getName());
        }
    }

    static class PersonFactory {
    	
        private Supplier<Person> supplier;

        public PersonFactory(Supplier<Person> supplier) {
            this.supplier = supplier;
        }

        public Person getPerson() {
            return supplier.get();
        }
    }
}
