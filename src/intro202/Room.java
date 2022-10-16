package intro202;

import java.util.ArrayList;
import java.util.List;

public class Room {
    
    private int number;
    private int capacity;
    private RoomType type;
    private School school;

    private List<Course> courses = new ArrayList<>();

    public Room(School school, int number, int capacity, RoomType type) {
        this.school = school;
        this.number = number;
        this.capacity = capacity;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public RoomType getType() {
        return type;
    }

    public School getSchool() {
        return school;
    }
}
