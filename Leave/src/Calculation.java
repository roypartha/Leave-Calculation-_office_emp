public class Calculation {
    int annLeave, sickLeave;
    int day, month,year;
    Calculation(int annLeave,int sickLeave,int day,int month,int year){
        this.annLeave=annLeave;
        this.sickLeave=sickLeave;
        this.day=day;
        this.month=month;
        this.year =year;
    }

    int annualLeave(){
        if(year%4==0){
            annLeave= (annLeave*30)/366;

        }
        else{
            annLeave= Math.round((annLeave*30)/365);
        }

        return annLeave;
    }
    int sickLeave(){
        if(year%4==0){
            sickLeave= (sickLeave*30)/366;

        }
        else{
            sickLeave= (sickLeave*30)/365;

        }


        return sickLeave;
    }


}
