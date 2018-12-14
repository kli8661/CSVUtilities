package sample;

public class Controller {

    private String school;
    private int takers;
    private int average;
    private int read;
    private int math;
    private int write;

    public Controller(String school, int takers, int average, int read, int math, int write)
    {
        this.school = school;
        this.takers = takers;
        this.average = average;
        this.read = read;
        this.math = math;
        this.write = write;
    }

    public int getTakers()
    {
        return takers;
    }

    public void setTakers(int takers)
    {
        this.takers = takers;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getWrite() {
        return write;
    }

    public void setWrite(int write) {
        this.write = write;
    }

    public String toString()
    {
        return school + ", #ofTakers: " + takers + ", SectionAverage" + average + ", Reading: " + read + ", Math: " + math + ", Writing: " + write;
    }
}
