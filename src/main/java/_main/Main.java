/*В создаnm экземпляры студентов и преподавателей.
Вызываются методы для выполнения действий студентов и преподавателей
через сервисные методы performStudentActions() и performTeacherActions(),
 которые принимают параметры типа интерфейса.
package _main;*/

import entity.*;

public class Main {
    public static void main(String[] args) {
        Univer univer = new Univer("Государственный Университет");

        Student student1 = new Student("Алексей", "Новиков", 20, "Информатика");
        Student student2 = new Student("Мария", "Агапова", 22, "Экономика");

        Teacher teacher1 = new Teacher("Иван", "Петров", "Программирование");
        Teacher teacher2 = new Teacher("Анна", "Сидорова", "Экономика");

       // univer.getName();

        performStudentActions(student1);
        performStudentActions(student2);
        performTeacherActions(teacher1);
        performTeacherActions(teacher2);
    }

    public static void performStudentActions(StudentActions student) {
        student.showInfo();
        student.study();
        student.takeExam();
        System.out.println();
    }

    public static void performTeacherActions(TeacherActions teacher) {
        teacher.showInfo();
        teacher.teach();
        teacher.gradeExams();
        System.out.println();
    }
}


