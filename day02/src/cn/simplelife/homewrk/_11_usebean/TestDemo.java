package cn.simplelife.homewrk._11_usebean;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static cn.simplelife.homewrk._11_usebean.Utils.setInfoToEmp;

public class TestDemo {
    public static void main(String[] args) throws ParseException {
        String info = "name=小红&age=17&salary=8000.00&hireDate=1991-07-03;name=小明&age=23&salary=10000.00&hireDate=1992-12-11;name=小白&age=18&salary=12000.00&hireDate=1996-01-09";
        //创建三个对象
        Employee employee0 = new Employee();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        //按照;切割字符串得到一个字符串数组
        String[] split = info.split(";");
        //定义一个空的数组接收每一个对象的信息
        String[] infoEmp = null;
        // 遍历按照封号切割的字符串数组
        for (int i = 0; i < split.length; i++) {
            // 按照&切割字符串得到新的字符串数组
            infoEmp = split[i].split("&");
            //判断employee0的各个字段是否有数据，没有就设置值
            if (employee0.getName() != null && employee0.getAge() != 0 && employee0.getSalary() != null && employee0.getHirDate() != null) {
                //当employee0不为空的时候判断employee1
                if (employee1.getName() != null && employee1.getAge() != 0 && employee1.getSalary() != null && employee1.getHirDate() != null) {
                    //此时存入employee2
                    setInfoToEmp(infoEmp, employee2);
                } else {
                    setInfoToEmp(infoEmp, employee1);
                }
            } else {
                setInfoToEmp(infoEmp, employee0);
            }
        }
        // 打印三个对象的信息
        System.out.println(employee0.toString());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        // 定义一个变量接收总薪水
        BigDecimal totalSalary = new BigDecimal("0.0");
        // 定义一个变量接收总人数
        BigDecimal totalPeople = new BigDecimal("0");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = "1996-01-01";
        Date parse = simpleDateFormat.parse(date);
        // 判断时间是否在1996年之前直接调用Java.util中的before方法用于判断日期是否早于给定的时间
        if (employee0.getHirDate().before(parse)) {
            totalPeople = totalPeople.add(new BigDecimal("1"));
            totalSalary = employee0.getSalary().add(totalSalary);
        }
        if (employee1.getHirDate().before(parse)) {
            totalPeople = totalPeople.add(new BigDecimal("1"));
            totalSalary = employee1.getSalary().add(totalSalary);
        }
        if (employee2.getHirDate().before(parse)) {
            totalPeople = totalPeople.add(new BigDecimal("1"));
            totalSalary = employee2.getSalary().add(totalSalary);
        }
        System.out.println("总薪水：" + totalSalary);
        System.out.println("平均薪水：" + totalSalary.divide(totalPeople, 2, RoundingMode.HALF_UP));
    }
}
