package service;

import entity.Actions;
import entity.StudentActions;
import entity.TeacherActions;

public class ActionPerformer {

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
