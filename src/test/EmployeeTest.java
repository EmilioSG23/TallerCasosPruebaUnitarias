package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

class EmployeeTest {
	
	@Test
	//Prueba constructores
	public void testEmployee() {
		Employee e=new Employee(386,"USD",15,EmployeeType.Worker);
		assertNotNull(e);
	}
	
}
