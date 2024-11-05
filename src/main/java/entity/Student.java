package entity;

public class Student implements StudentActions {
     String name;
     String surname;
     int age;
     String major;
     Teacher teacher;
     Univer univer;

    public Student() {

    }

    public Student(String name, String surname, int age, String major, Teacher teacher) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.major = major;
        this.teacher = teacher;
        this.univer = univer;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public Teacher getTeacher() {
        return teacher;
    }


    public void doExamTest() {
        System.out.println("Я студен: задачу для экзамена");
    }
    public void skipExam(){
        System.out.println("Я студен: пытаюсь списать экзамен");
    }


    @Override
    public void discuss() {
        System.out.println("Я студент, обсуждаю с однокурсниками на какую тему хотелось написать диплом");
    }
    @Override
    public void showInfo() {
        System.out.println("Студент: " + name + " " + surname + ",  Возраст: " + age);
    }

    @Override
    public void study() {
        System.out.println(name + " учится по специальности " + major);
    }

    @Override
    public void takeExam() {
        System.out.println(name + " сдает экзамен преподавателю ");
    }
}

