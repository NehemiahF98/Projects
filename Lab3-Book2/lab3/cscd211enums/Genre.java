package lab3.cscd211enums;

public enum Genre {
    FICTION, NONFICTION, ROMANCE, SCIFI, EDUCATION;

    private int value;
    private String name;

    private Genre(final int value, final String name) {
        this.value = value;
        this.name = name;
    }

    Genre() {
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String name = this.name().toLowerCase();
        if (name.equals("nonfiction")) {
            return "non-fiction";
        }
        if (name.equals("scifi")) {
            return "sci-fi";
        }
        return name;
    }
}