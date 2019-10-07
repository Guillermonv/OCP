package com.example.OCP.advancedClassDesing.equlsAndHashCode.equals;

public class Employee {
public int employeeId;

    class job{
        int a = 0;
        int b = 0;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }
@Override
public int hashCode(){
    return  employeeId;
}
public boolean equals(Employee e){
    return this.employeeId == e.employeeId;
}

    public static void main(String[] args) {

        Employee one = new Employee();
        one.employeeId = 10;

        Employee two = new Employee();
        two.employeeId=10;
        if (one.equals(two)){
            System.out.println("The method equals its not overrided but its used");
        }
        job Job = one.new job();
        Job.setA(1);
    }
}
