package com.excel.springhibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{

        public static void main( String[] args ){
            
            ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
          EmployeeDao dao=context.getBean("employeeDao",EmployeeDao.class);
          Employee employee=new Employee();
          employee.setId(12);
          employee.setName("sohn");
          employee.setAddress("bang");
          employee.setId(14);
          employee.setName("john");
          employee.setAddress("mys");
          employee.setId(18);
          employee.setName("hohan");
          employee.setAddress("hyd");
//          int res=dao.insertEmployee(employee);
//          System.out.println(res);
          Employee update=dao.updateEmployee(employee);
          System.out.println(update);
//          Employee get=dao.getEmployee(1);
//           System.out.println(get);
//          List<Employee> employees=dao.getAllEmployee();
//          employees.forEach(System.out::println);
//          Employee delete=dao.deleteEmployee(employee);


    }
}
