package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

class EmployeeTest {
	
	@Test
	//Prueba constructores
	public void testEmployee() {
		Employee e=new Employee(380,"USD",15,EmployeeType.Worker);
		assertNotNull(e);
	}
	
	
	public void testWorkerSalary() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Worker);
		//Caso impar
		//assertEquals(444.33,e.cs());
		//Caso par
		assertEquals(100,e.cs());
	}
	public void testSupervisorSalary() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Supervisor);
		//Caso impar
		//assertEquals(444.33,e.cs());
		//Caso par
		assertEquals(380,e.cs());
	}
	public void testManagerSalary() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Manager);
		//Caso impar
		//assertEquals(444.33,e.cs());
		//Caso par
		assertEquals(380,e.cs());
	}
	public void testCurrencySalaryNotUSD() {
		Employee e=new Employee(100,"Euro",15,EmployeeType.Worker);
		assertEquals(95,e.cs());
	}
	
	@Test
	public void testWorkerBonus() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Worker);
		assertEquals(386,e.CalculateYearBonus());
	}
	@Test
	public void testSupervisorBonus() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Supervisor);
		assertEquals(293,e.CalculateYearBonus());
	}
	@Test
	public void testManagerBonus() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Manager);
		assertEquals(486,e.CalculateYearBonus());
	}
	@Test
	public void testCurrencyBonusNotUSD() {
		Employee e=new Employee(100,"Euro",15,EmployeeType.Supervisor);
		assertEquals(288,e.CalculateYearBonus());
	}
}
