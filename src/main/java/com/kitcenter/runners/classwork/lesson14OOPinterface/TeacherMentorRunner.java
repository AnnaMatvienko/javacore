package com.kitcenter.runners.classwork.lesson14OOPinterface;

import com.kitcenter.app.classwork.lesson13OOPpolymorphismInheritanceComposition.Teacher;
import com.kitcenter.app.classwork.lesson14OOPinterface.Mentor;

public class TeacherMentorRunner {
    public static void main(String[] args) {
        Teacher mentor = new Mentor("Anna");
        mentor.lessonFinished();
        mentor.equals("Ralph");
        mentor.hashCode();
    }
}