public class worker {

    String name;
    int salaryFor30days;
    int workedDays;
    worker(String name, int salaryFor30days, int workedDays){
        this.name = name;
        this.salaryFor30days = salaryFor30days;
        this.workedDays = workedDays;
    }
    worker(){

    }

    public void salary(){
        int res = 0;
        res = (salaryFor30days*workedDays)/30;
        System.out.println(this.name+" - "+res);
    }

}
