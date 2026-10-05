package edu.wccnet.aurewhite;

public class College {
    //vars
    private String collageName;
    private int yearBuilt;
    private String zipCode;
    private int Enrollment;

    public College(String collageName, int yearBuilt) {
        this.collageName = collageName;
        this.yearBuilt = yearBuilt;
    }

    @Override
    public String toString() {
        return "College{" +
                "collageName='" + collageName + '\'' +
                ", yearBuilt=" + yearBuilt +
                ", zipCode='" + zipCode + '\'' +
                ", Enrollment=" + Enrollment +
                '}';
    }
}
