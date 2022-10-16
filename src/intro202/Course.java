package intro202;

import intro204.Teacher;

public class Course {
    
    private Subject subject;
    private Grade grade;
    private School school;
    private Room room;
    private Teacher teacher;

    public Course(School school, Subject subject, Grade grade) {
        this.school = school;
        this.subject = subject;
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public Grade getGrade() {
        return grade;
    }

    public School getSchool() {
        return school;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
