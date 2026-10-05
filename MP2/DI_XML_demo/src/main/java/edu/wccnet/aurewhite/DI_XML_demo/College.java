package edu.wccnet.aurewhite.DI_XML_demo;

public class College {
    private String collageName;
    private int yearBuilt;
    private String zipCode;
    private int enrollment;

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
                ", enrollment=" + enrollment +
                '}';
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }
}
