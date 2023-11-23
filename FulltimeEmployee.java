public class FulltimeEmployee extends Employee {
    private int salaryPerMonth;
    public FulltimeEmployee(){
        super();
        this.salaryPerMonth = 10000;
    }

    public FulltimeEmployee(String name,int id, int salaryPerMonth){
        super(name,id);
        this.salaryPerMonth = salaryPerMonth;
    }
    public int calulateSarlary(){
        return this.salaryPerMonth;
    }

}
