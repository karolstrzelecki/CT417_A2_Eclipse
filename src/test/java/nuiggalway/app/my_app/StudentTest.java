package nuiggalway.app.my_app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void testGetDateOfBirth() {
		Student student = new Student("John","Doe",1995, 5, 5);
        LocalDate var1 = new LocalDate(1995, 5, 5);
        LocalDate var2 = student.getDateOfBirth();
        
        assertEquals(var1, var2);

	
	}

	@Test
	void testGetAge() {
		Student student = new Student("John","Doe",1995, 5, 5);
		long var1 = 24;
		long var2 = student.getAge();
		
		assertEquals(var1, var2);
		
	}
	
	
	

	@Test
	void testGetUserName() {
		Student student = new Student("John","Doe",1995, 5, 5);

        String var = student.getUserName();
        assertEquals("JohnDoe24",var);
	}

	@Test
	void testGetModules() {
		Student student = new Student("John","Doe",1995, 5, 5);
		Course course = new Course("Software engineering", 2019, 9, 1, 2020, 12, 22);
		Module module = new Module("Erasmus", "EM");
		student.addCourses(course);
		student.addModules(module);
		
		List <Module> var1 = student.getModules();
		List <Module> var2 = new ArrayList();
		var2.add(module);
		
		assertEquals(var1, var2);
	
	
	}

	@Test
	void testGetCourses() {

		Student student = new Student("John","Doe",1995, 5, 5);
		Course course = new Course("Software engineering", 2019, 9, 1, 2020, 12, 22);
		Module module = new Module("Erasmus", "EM");
		student.addCourses(course);
		student.addModules(module);
		
		List <Course> var1 = student.getCourses();
		List <Course> var2 = new ArrayList();
		var2.add(course);
		
		assertEquals(var1, var2);
	
	
	}

}
