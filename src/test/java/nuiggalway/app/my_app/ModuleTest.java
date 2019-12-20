package nuiggalway.app.my_app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ModuleTest {

	@Test
	void testGetCourses() {
		Student student = new Student("John","Doe",1995, 5, 5);
		Course course = new Course("Software engineering", 2019, 9, 1, 2020, 12, 22);
		Module module = new Module("Erasmus", "EM");
		module.addCourses(course);
		module.addStudent(student);
		List <Course> var1 = module.getCourses();
		List <Course> var2 = new ArrayList();
		var2.add(course);
		
        assertEquals(var1,var2);

		
	}

	@Test
	void testGetStudents() {
		Student student = new Student("John","Doe",1995, 5, 5);
		Course course = new Course("Software engineering", 2019, 9, 1, 2020, 12, 22);
		Module module = new Module("Erasmus", "EM");
		module.addCourses(course);
		module.addStudent(student);
		List<Student> var1 = module.getStudents();
		List<Student> var2 = new ArrayList();
		var2.add(student);
		
		assertEquals(var1, var2);
		
	}

	@Test 
	void testGetModuleName(){
		Module module = new Module("Erasmus", "EM");
		String var1 = module.getModuleName();
		
		assertEquals("Erasmus", var1);
		
		
	}
	
	
	@Test 
	void testGetId() {
		Module module = new Module("Erasmus", "EM");
		String var1 = module.getId();
		
		assertEquals("EM", var1);
		
		
	}
	

	

}
