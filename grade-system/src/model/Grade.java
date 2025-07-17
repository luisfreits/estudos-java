package model;

public class Grade {
    public String name;
    public Double first, second, third;
    
    public String average(){
        double finalGrade = first + second + third;
        double missing = 60 - finalGrade;
        if (missing <= 0 ){
           return String.format("FINAL GRADE = %.2f\nPASSED", finalGrade);
        } else {
           return String.format("FINAL GRADE = %.2f\nFAILED\nMISSING %.2f POINTS", finalGrade, missing);
        }
    }
}
