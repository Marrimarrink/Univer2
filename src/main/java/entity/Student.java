package entity;

public class Student implements StudentActions {
    private String name;
    private String surname;
    private int age;
    private String major;
    private Teacher teacher;


    public Student(String name, String surname, int age, String major) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.major = major;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int  getAge() {
        return age;
    }

    public String getMajor(){
        return major;
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
        System.out.println(name + " сдает экзамен преподавателю " + teacher);
    }
}

