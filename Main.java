public class Main {
    public static void main(String[] args) {
        PayRollSys team1 = new PayRollSys();
        Employee emp1 = new FulltimeEmployee("Ravi",100002,70000);
        Employee emp2 = new PartTime("Angad",100034,12,333);
        Employee emp3 = new FulltimeEmployee("Abhishek",1000023,75000);
        team1.addEmployee(emp1);
        team1.addEmployee(emp2);
        team1.addEmployee(emp3);
        team1.showTeam();
        team1.removeEmployee(100002);
        team1.showTeam();
    }
}
