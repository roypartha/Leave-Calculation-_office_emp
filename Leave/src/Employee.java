import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.sql.SQLOutput;


public class Employee {
    String empName,empType;
    int age;
    int day;
    int month;
    int year,leave;
    Employee(String empName,int age,String empType,int day,int month,int year ){
        this.empName = empName;
        this.age= age;
        this.empType=empType;
        this.day=day;
        this.month=month;
        this.year=year;
    }

    void leaveCalculation(){
        Leave le = new Leave(empType,day,month,year);
        leave=le.checkEmpType();
    }
    void show(){
        System.out.println(empName);
        System.out.println(leave);
    }

}
