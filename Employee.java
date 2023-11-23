abstract class Employee{
    private String name;
    private int id;
    public Employee(){
        this.name = "Ram";
        this.id = 10001;
    }
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return "";
    }
    abstract public int calulateSarlary();
}