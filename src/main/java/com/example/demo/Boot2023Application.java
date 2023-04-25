package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;

import com.example.demo.component.*;
import com.example.demo.domain.*;

@SpringBootApplication
public class Boot2023Application {

	public static void main(String[] args) {
		//Spring Bean : 스프링이 관리하는 객체들
		ApplicationContext context = SpringApplication.run(Boot2023Application.class, args);
		Object o = context.getBean("bean1");
		System.out.println(o);
		
		Object o2 = context.getBean("employee");
		System.out.println(o2);
		
		Object o4 = context.getBean("bean2");
		Object o5 = context.getBean("bean3");
		
		System.out.println(o4); //ComponentA@3f4dd429
		System.out.println(o5); //ComponentB@2ea1de51
		
		ComponentA c1 = (ComponentA) o4;
		System.out.println(c1.getComp()); // ComponentB@2ea1de51
		
		ComponentC c3 = (ComponentC) context.getBean("bean4");
		System.out.println(c3.getComp());  // ComponentB@2ea1de51
	
		ComponentD c4 = (ComponentD) context.getBean("componentD");
		System.out.println(c4);
		
		ComponentE c5 = (ComponentE) context.getBean("componentE");
		System.out.println(c5.getComp());
	}
	
	// 우리가 객체를 직접 만들 때
	public void legacy() {
		Employee e = new Employee();
		e.setEmployeeId(100);
	}
	
}
