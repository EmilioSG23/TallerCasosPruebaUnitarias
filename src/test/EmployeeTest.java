package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

class EmployeeTest {
	Date date=new Date();
	int month=date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
	@Test
	//Prueba constructor que no sea nulo
	public void testEmployee() {
		Employee e=new Employee(380,"USD",15,EmployeeType.Worker);
		assertNotNull(e);
	}
	
	@Test
	//Verifica el salario del Empleado tipo Worker dependiendo del mes de pago
	public void testWorkerSalary() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Worker);
		if(month%2==0)
			assertEquals(100,e.cs());
		else
			assertEquals(164.33,e.cs());
	}
	@Test
	//Verifica el salario del Empleado tipo Supervisor dependiendo del mes de pago
	public void testSupervisorSalary() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Supervisor);
		if(month%2==0)
			assertEquals(105.25,e.cs());
		else
			assertEquals(169.58,e.cs());
	}
	@Test
	//Verifica el salario del Empleado tipo Manager depnediendo del mes de pago
	public void testManagerSalary() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Manager);
		if(month%2==0)
			assertEquals(110.5,e.cs());
		else
			assertEquals(174.83,e.cs());
	}
	@Test
	//Verifica el salario de un empleado en caso que su moneda no sea el dólar (USD)
	public void testCurrencySalaryNotUSD() {
		Employee e=new Employee(100,"Euro",15,EmployeeType.Worker);
		assertEquals(95,e.cs());
	}
	
	@Test
	//Verifica el bonus que recibe el empleado tipo Worker
	public void testWorkerBonus() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Worker);
		assertEquals(386,e.CalculateYearBonus());
	}
	@Test
	//Verifica el bonus que recibe el empleado tipo Supervisor
	public void testSupervisorBonus() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Supervisor);
		assertEquals(293,e.CalculateYearBonus());
	}
	@Test
	//Verifica el bonus que recibe el empleado tipo Manager
	public void testManagerBonus() {
		Employee e=new Employee(100,"USD",15,EmployeeType.Manager);
		assertEquals(486,e.CalculateYearBonus());
	}
	@Test
	//Verifica el bonus en caso que la moneda del empleado no sea el dólar (USD)
	public void testCurrencyBonusNotUSD() {
		Employee e=new Employee(100,"Euro",15,EmployeeType.Supervisor);
		assertEquals(288,e.CalculateYearBonus());
	}
}
