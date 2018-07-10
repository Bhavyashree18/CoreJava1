package javaex;

import java.util.ArrayList;
import java.io.*;

public class Employee {
int id;
String name;
String Address;
int salary;
static ArrayList al = new ArrayList();
//static int count = 0; 

Employee()
{ 
}

Employee(int id, String name, String a,int sal)
{
this.id = id;
this.name = name;
this.Address = a;
this.salary=sal;
}


public void putDetails(Employee e)
{
al.add(e);
}public Employee getDetails(int id)
{
Employee es = (Employee)al.get(id);
return es;
}


public static void main(String[] args) throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Employee e = new Employee();
Employee e1 = new Employee(1, "SaiRam", "Banglore",10000);
Employee e2 = new Employee(2, "Anu", "Delhi",12000);
Employee e3 = new Employee(3, "Vasu", "Pune",35000);
Employee e4 = new Employee(4, "Shillu", "Mysore",24000);
Employee e5 = new Employee(5, "Madhu", "Mangalore",3000);
Employee e6 = new Employee(6, "Volga", "Belgaum",55000);


e.putDetails(e1);
e.putDetails(e2);
e.putDetails(e3);
e.putDetails(e4);
e.putDetails(e5);
e.putDetails(e6);



System.out.println("Enter employee id to get the employee details: ");
int id = Integer.parseInt(br.readLine());
boolean flag = false;
for(int i=0; i<10;i++) {
Employee es = e1.getDetails(i);
if(id == es.id)
{
System.out.println("The details of the employee with id " +id +" is: ");
System.out.print(es.id +" " +es.name+" " +es.Address + " " + es.salary);
flag = true;
break;

}        
             }
if(!flag)
{
    System.out.println("id not found"+ " " +id);
}
}
}

    


