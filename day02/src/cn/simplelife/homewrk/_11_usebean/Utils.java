package cn.simplelife.homewrk._11_usebean;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    /**
     * 用于封装对象的字段信息
     *
     * @param infoArr  String类型的数组，用于存放对象的字段信息
     * @param employee 员工对象
     */
    public static void setInfoToEmp(String[] infoArr, Employee employee) throws ParseException {
        //创建simpleDateFormat对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < infoArr.length; i++) {
            if (i % 4 == 0) {
                // 获取姓名的索引
                int nameIndex = infoArr[i].indexOf("=") + 1;
                //切割所需要的姓名信息
                String name = infoArr[i].substring(nameIndex);
                //设置员工姓名
                employee.setName(name);
            }
            if (i % 4 == 1) {
                //获取年龄的索引
                int ageIndex = infoArr[i].indexOf("=") + 1;
                //截取年龄信息,并转为int类型
                int age = Integer.parseInt(infoArr[i].substring(ageIndex));
                //设置年龄
                employee.setAge(age);
            }
            if (i % 4 == 2) {
                //获取工资索引
                int salaryIndex = infoArr[i].indexOf("=") + 1;
                //截取工资信息
                String substring = infoArr[i].substring(salaryIndex);
                //转换工资信息类型
                BigDecimal salary = new BigDecimal(substring);
                //设置工资信息
                employee.setSalary(salary);
            }
            if (i % 4 == 3) {
                //获取入职日期索引
                int hireDateIndex = infoArr[i].indexOf("=") + 1;
                //截取入职日期信息
                String hireDate = infoArr[i].substring(hireDateIndex);
                //转换入职日期信息类型
                Date parse = simpleDateFormat.parse(hireDate);
                //设置入职日期信息
                employee.setHirDate(parse);
            }
        }
    }
}
