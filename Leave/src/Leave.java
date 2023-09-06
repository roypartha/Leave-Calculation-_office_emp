public class Leave {
    String empType;
    int day,month;
    int year;
    int leave=0;


    Leave(String empType,int day,int month,int year){
        this.empType=empType;
        this.day=day;
        this.month=month;
        this.year = year;
    }

    int checkEmpType(){
        if(empType=="Staff"){

            Calculation cal = new Calculation(10,7,day,month,year);
            leave =leave+ cal.annualLeave();
            leave =leave+ cal.sickLeave();


        }
        else if(empType=="Non-Staff"){
            Calculation cal = new Calculation(15,10,day,month,year);
            leave =leave+ cal.annualLeave();
            leave =leave+ cal.sickLeave();

        }
        return leave;
    }



}
