package cn.simplelife.homewrk._11_usebean;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private String name;
    private int age;
    private BigDecimal salary;
    private Date hirDate;

    public Employee() {
    }

    public Employee(String name, int age, BigDecimal salary, Date hirDate) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hirDate = hirDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getHirDate() {
        return hirDate;
    }

    public void setHirDate(Date hirDate) {
        this.hirDate = hirDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hirDate=" + hirDate +
                '}';
    }
}
