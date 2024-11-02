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

    public void careStudent () {
        System.out.println("Я преподаватель: слежу за студентами чтобы они не списывали");
    }
    public void prepareTextLecture(){
        System.out.println("Я преподаватель: готовлю текст для следующей лекции");
    }

    @Override
    public void discuss() {
        System.out.println("Я преподаватель, обсуждаю со студентами  темы будущих дипломных проектов");
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
