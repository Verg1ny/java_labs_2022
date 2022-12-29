public class Student {

    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public short getScholarship() {
        if (this.averageMark == 5) return 100;
        else return 80;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGroup(){
        return group;
    }
    public double getAverageMark() {
        return averageMark;
    }
}
