package com.teachmeskills.lesson6.student;

public class Runner {
    public static void main(String[] args) {
        Student st1 = new Student("Артём", "Астапчик", "AB789012", "C27-onl");
        Student st2 = new Student("Алина", "Илькевич", "AB789012", "C27-onl");
        Student st3 = new Student("Анастасия", "Иргалиева", "AB789012", "C27-onl");
        Student st4 = new Student("Артем", "Каральчук", "AB789012", "C27-onl");
        Student st5 = new Student("Никита", "Крайко", "AB789012", "C27-onl");
        Student st6 = new Student("Олег", "Манеев ", "AB789012", "C27-onl");
        Student  st7 = new Student("Иван", "Михновецкий", "AB789012", "C27-onl");
        Student st8 = new Student("Кирилл", "Паляница", "AB789012", "C27-onl");
        Student st9 = new Student("Руслан", "Рябухин", "AB789012", "C27-onl");
        Student st10 = new Student("Евгений", "Саркисов", "AB789012", "C27-onl");
        Student st11 = new Student("Павел", "Свинко", "AB789012", "C27-onl");
        Student st12 = new Student("Руслан", "Семенчик", "AB789012", "C27-onl");
        Student st13 = new Student("Руслан", "Третяк", "AB789012", "C27-onl");
        Student st14 = new Student("Александр", "Хамицкий", "AB789012", "C27-onl");
        Student st15 = new Student("Даниил", "Чаботько", "AB789012", "C27-onl");
        Student st16 = new Student("Алексей", "Шубин", "AB789012", "C27-onl");
        Student st17 = new Student("Владислав", "Колос", "AB789012", "C27-onl");

        Student[] arr = new Student[]{st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12, st13, st14, st15, st16, st17};
        for(Student st: arr){
            System.out.println("ФИО: " + st.surname + " " + st.name + " - № паспорта: " + st.passport + " , Название группы: " + st.groupName);
        }
    }
}
