import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testConstructor() {
		Employee e=new Employee(100,'USD',5,Worker);
		assertNotNull(e);
	}
	
	@Test
	void testWorkerSalary() {
		
	}

}
