import entity.*;
import service.ActionPerformer;

import static service.ActionPerformer.*;

public class Main {
    public static void main(String[] args) {
       // ActionPerformer actionPerformer = new ActionPerformer();
        Univer univer = new Univer("Государственный Университет", "199106, Санкт-Петербург, Васильевский остров, 21 линия д.2");

        Student student1 = new Student("Алексей", "Новиков", 20, "Информатика", new Teacher());
        Student student2 = new Student("Мария", "Агапова", 22, "Экономика",new Teacher());

        Teacher teacher1 = new Teacher("Иван", "Петров", "Информатика");
        Teacher teacher2 = new Teacher("Анна", "Сидорова", "Экономика");

        univer.setName("Государственный Университет");
        univer.setAddress("199106, Санкт-Петербург, Васильевский остров, 21 линия д.2");

        student1.setName("Алексей");
        student1.setSurname("Новиков");
        student1.setAge(20);
        student1.setMajor("Информатика");
        student1.setTeacher(teacher1);

        student2.setName("Мария");
        student2.setSurname("Агапова");
        student2.setAge(22);
        student2.setMajor("Экономика");
        student2.setTeacher(teacher2);

        teacher1.setName("Иван");
        teacher1.setSurname("Петров");
        teacher1.setSubject("Информатика");

        teacher2.setName("Анна");
        teacher2.setSurname("Сидорова");
        teacher2.setSubject("Экономика");

        System.out.println("Информация об университете. Наименование: " + univer.getName()
                + ", расположение: " + univer.getAddress());

        System.out.println();

        System.out.println("Я студент, меня зовут " + student1.getName() + " " + student1.getSurname()
                + ", мне " + student1.getAge() + " года,  прохожу обучение в: " + univer.getName()
                + ",  по специальности: " + student1.getMajor() + " у преподавателя: "
                + student1.getTeacher().getName());

        System.out.println();

        System.out.println("Я студент, меня зовут " + student2.getName() + " " + student2.getSurname()
                + ", мне " + student2.getAge() + " года,  прохожу обучение в: " + univer.getName()
                + ",  по специальности: " + student2.getMajor() + " у преподавателя: "
                + student2.getTeacher().getName());

        System.out.println();

        System.out.println("Я преподаватель, меня зовут " + teacher1.getName() + " " + teacher1.getSurname()
                + ", мое место работы: " + univer.getName()
                + ",  я веду предмет: " + teacher1.getSubject() + " у студента: "
                + student1.getName() + " " + student1.getSurname());

        System.out.println();


        System.out.println("Я преподаватель, меня зовут " + teacher2.getName() + " " + teacher2.getSurname()
                + ", мое место работы: " + univer.getName()
                + ",  я веду предмет: " + teacher2.getSubject() + " у студента: "
                + student2.getName() + " " + student2.getSurname());

        System.out.println();

        performStudentActions(student1);
        performSkipExam(student1);
        performStudentActions(student2);
        performExamTest(student2);
        performTeacherActions(teacher1);
        performCareStudent(teacher1);
        performTeacherActions(teacher2);
        performPrepareLecture(teacher2);
    }


}


