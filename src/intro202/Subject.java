package intro202;

enum Subject {
    MATH,
    PHYSICS,
    CHEMISTRY,
    BIOLOGY,
    ENGLISH,
    FRENCH,
    GERMAN,
    HISTORY,
    ART,
    MUSIC,
    SPORTS,
    COMPUTER_SCIENCE;

    public String getSubject() { 
        switch(this) {
            case MATH: 
                return "math";
            case PHYSICS:
                return "physics";
            case CHEMISTRY:
                return "chemistry";
            case BIOLOGY:
                return "biology";
            case ENGLISH:
                return "english";
            case FRENCH:
                return "french";
            case GERMAN:
                return "german";
            case HISTORY:
                return "history";
            case ART:
                return "art";
            case MUSIC:
                return "music";
            case SPORTS:
                return "sports";
            case COMPUTER_SCIENCE:
                return "computer science";
            default:
                return "other";
        }
    }
}
