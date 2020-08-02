package com.example.csdepartment;

public class Direction {
    private String directionName;
    private String directionDescription;
    private int directionImageId;
    public final static Direction[] directions = {
            new Direction("Μηχανικών Η/Υ",
                    "Περιγραφή Μηχ. Η/Υ",
                    R.drawable.cseng),
            new Direction("Μηχανικών Δικτύων",
                    "Περιγραφή Μηχ. Δικτ.",
                    R.drawable.csnet),
            new Direction("Μηχανικών Λογισμικού",
                    "Περιγραφή Μηχ. Λογ.",
                    R.drawable.cssoft)};
    public Direction(String directionName,
                     String directionDescription,
                     int directionImageId) {
        this.directionName = directionName;
        this.directionDescription = directionDescription;
        this.directionImageId = directionImageId;
    }
    public String getDirectionName() {
        return directionName;
    }
    public String getDirectionDescription() {
        return directionDescription;
    }
        public int getDirectionImageId() {
        return directionImageId;
    }
    public String toString() {
        return directionName;
    }


}
