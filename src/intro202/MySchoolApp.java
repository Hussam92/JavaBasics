package intro202;

import intro204.Teacher;

/**
 * In this example you will find basic examples of Object Oriented Programming
 * (OOP) in Java. The example is a simple school management system
 * Schools have rooms, grades, courses
 * Grades have courses
 * A course belongs to a school, a grade, a teacher and a room
 */
public class MySchoolApp {
    public static void main(String[] args) {
        // Create a new School
        School school = new School("My School", "123 Main St", "123-456-7890", "RLP");
        Room room1 = new Room(school, 101, 30, RoomType.CLASS);
        Grade grade5a = new Grade(school, 5, "5a");
        Course course = new Course(school, Subject.MATH, grade5a);

        course.setRoom(room1);

        Teacher teacher = new Teacher(school, "Michael Scott", "michael@school.com", "password");
        course.setTeacher(teacher);
    }
}
