package intro204;

enum EmployeeType {

    TEACHER, ADMINISTRATOR, SECRETARY, SPECIAL;

    public String getEmployeeType() {
        switch (this) {
        case TEACHER:
            return "Teacher";
        case ADMINISTRATOR:
            return "Administrator";
        case SECRETARY:
            return "Secretary";
        case SPECIAL:
            return "Special";
        default:
            return "Unknown";
        }
    }
}
