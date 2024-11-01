package entity;

public class Teacher implements TeacherActions {
    private String name;
    private String surname;
    private String subject;
    private Student student;
    private Univer univer;

    public Teacher(){

    }

    public Teacher(String name, String surname, String subject) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.student = student;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSubject(){
        return subject;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    @Override
    public void showInfo() {
        System.out.println("Преподаватель: " + name + " " + surname + ", Предмет: " + subject);
    }

    @Override
    public void teach() {
        System.out.println(name + " проводит урок по предмету " + subject);
    }

    @Override
    public void gradeExams() {
        System.out.println(name + " выставляет оценки за экзамены cтуденту ");
    }
}
