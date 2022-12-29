public class Aspirant extends Student {

    private String nameOfScienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public short getScholarship() {
        if (this.getAverageMark() == 5) return 200;
        else return 180;
    }
}
