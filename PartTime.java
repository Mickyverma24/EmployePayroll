public class PartTime extends Employee {
    private int workingHours;
    private int wages;
    public PartTime(){
        super();
        this.workingHours = 6;
        this.wages = 70;
    }
    public PartTime(String name, int id, int workingHours, int wages){
        super(name,id);
        this.workingHours = workingHours;
        this.wages = wages;
    }
    public int calulateSarlary(){
        return workingHours*wages;
    }
}
