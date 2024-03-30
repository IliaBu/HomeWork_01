package ru.gb_spring;

import java.util.ArrayList;
import java.util.List;

public class PersonsData {
    static List<Person> person = new ArrayList<>();

    private static void addPerson(String fname, String sname, int age) {
        person.add(new Person(fname, sname, age));
    }

    public static List<Person> PersonList() {
        addPerson("Иван", "Иванов",  19);
        addPerson("Иван", "Малых",  19);
        addPerson("Ольга", "Иванова", 19);
        addPerson("Андрей", "Малых", 20);
        addPerson("Илья", "Кузьмин", 20);
        addPerson("Анна", "Андреева", 20);
        addPerson("Светлана", "Андреева", 21);
        addPerson("Артем", "Рыбак", 22);
        addPerson("София", "Рыбак", 22);
        addPerson("Валерия", "Малых", 20);
        addPerson("Аркадий", "Боровиков", 20);
        addPerson("Сергей", "Стельман", 20);
        addPerson("Артем", "Мокитов", 20);
        addPerson("Тимофей", "Дружинин", 20);
        addPerson("Степан", "Березкин", 20);
        return person;
    }
}
