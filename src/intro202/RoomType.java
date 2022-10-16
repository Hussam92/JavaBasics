package intro202;

/**
 * Enumns in Java are a way of defining a set of constants
 */
enum RoomType {
    
    CLASS,
    LAB,
    CONFERENCE,
    THEATER,
    GYM,
    BATHROOM,
    OFFICE;

    public String getRoomType() { 
        switch(this) {
            case CLASS: 
                return "class";
            case LAB:
                return "laboratory";
            case CONFERENCE:
                return "conference";
            case THEATER:
                return "theater";
            case GYM:
                return "gym";
            case BATHROOM:
                return "bathroom";
            case OFFICE:
                return "office";
            default:
                return "other";
        }
    }
}
