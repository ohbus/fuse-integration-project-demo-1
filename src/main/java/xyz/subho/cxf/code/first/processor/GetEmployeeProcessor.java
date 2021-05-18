package xyz.subho.cxf.code.first.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xyz.subho.cxf.code.first.Employee;

public class GetEmployeeProcessor implements Processor {

	Logger log = LoggerFactory.getLogger(GetEmployeeProcessor.class); 
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		int empId = exchange.getIn().getBody(Integer.class);
		log.info("Employee ID = ", empId);
		
		Employee emp = new Employee();
		emp.setEmployeeId(1);
		emp.setFirstName("FirstName");
		emp.setLastname("LastName");
		emp.setGender("FEMALE");
		emp.setDepartment("Accounts");
		
		exchange.getIn().setBody(emp);
	}

}
