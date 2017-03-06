package com.infotech.client;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context =  null;
		try {
			// context = new FileSystemXmlApplicationContext("C:\\SpringWorkSpace\\SpringApplicationContext2Demo\\src\\applicationContext.xml");
			// context = new FileSystemXmlApplicationContext("C:/SpringWorkSpace/SpringApplicationContext2Demo/src/applicationContext.xml");
			context = new FileSystemXmlApplicationContext("config/applicationContext.xml");			
			 Employee employee = context.getBean("employee", Employee.class);
			 
			 System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());
		} catch (BeansException e) {
			e.printStackTrace();
		}finally{
			if(context != null)
				((AbstractApplicationContext) context).close();
		}
	}

}
