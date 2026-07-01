package jass.unit;

public class Assert {

    private String name;
    private int marks;

    public Assert(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Returns the student's name
    public String getName() {
        return name;
    }

    // Checks if the student has passed
    public boolean isPassed() {
        return marks >= 35;
    }

    // Checks if the student is eligible for a scholarship
    public boolean isScholarshipEligible() {
        return marks >= 90;
    }

    // Divides marks by a number
    public int divideMarks(int value) {
        return marks / value;
    }
}
