import java.util.ArrayList;
import java.util.List;

class PayRollSys  {
    private List<Employee> employelist;
    public PayRollSys(){
        employelist = new ArrayList<>();
    }
    public void addEmployee(Employee emp){
        employelist.add(emp);
    }
    public  void removeEmployee(int id){
        Employee emp = null;
        for(Employee e : employelist){
            if(e.getId()==id){
                emp = e;
                break;
            }
        }
        if(emp!=null){
            employelist.remove(emp);
        }
    }
    public void showTeam(){
        for(Employee emp : employelist){
            System.out.println(emp);
        }
    }
}
