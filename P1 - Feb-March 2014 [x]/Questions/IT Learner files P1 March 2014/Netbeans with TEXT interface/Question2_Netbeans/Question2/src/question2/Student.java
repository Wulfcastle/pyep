package question2;
//Type your examination number here.

class Student {
    private String name;
    private char gender;
    private int questionnaires;
    private double hours;

    public Student(String name, char gender, int questionnaires, double hours) {
        this.name = name;
        this.gender = gender;
        this.questionnaires = questionnaires;
        this.hours = hours;
    }
    
    public double calcAvg() {
        double average = questionnaires/hours;
        return average;
    }
    
    public String toString() {
        String output = "Student: " + name + " (" + gender + ")"  + "\n"
                + "Collected Questionnaires: " + questionnaires + "\n"
                + "Total number of hours: " + hours;
        return output;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getQuestionnaires() {
        return questionnaires;
    }

    public void setQuestionnaires(int questionnaires) {
        this.questionnaires = questionnaires;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
