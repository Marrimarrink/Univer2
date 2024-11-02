package service;

import entity.Student;
import entity.Teacher;
import entity.StudentActions;
import entity.TeacherActions;

public class ActionPerformer {

    public static void performStudentActions(StudentActions student) {
        student.showInfo();
        student.study();
        student.takeExam();
        System.out.println();
    }
    public static void performSkipExam(Student student) {
        student.skipExam();
        System.out.println();
    }

    public static void performExamTest(Student student) {
        student.doExamTest();
        System.out.println();
    }

    public static void performTeacherActions(TeacherActions teacher) {
        teacher.showInfo();
        teacher.teach();
        teacher.gradeExams();
        System.out.println();
    }

    public static void performCareStudent(Teacher teacher) {
        teacher.careStudent();
        System.out.println();
    }

    public static void performPrepareLecture(Teacher teacher) {
        teacher.prepareTextLecture();
        System.out.println();
    }
}
