package nuiggalway.app.my_app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

class CourseTest {

	@Test
	void testGetCourseName() {
	
		Course course = new Course("Software engineering", 2019, 9, 1, 2020, 12, 22);
		String var2 = course.getCourseName();	
        assertEquals("Software engineering",var2);
	}

	@Test
	void testGetModules() {
		Student student = new Student("John","Doe",1995, 5, 5);
		Course course = new Course("Software engineering", 2019, 9, 1, 2020, 12, 22);
		Module module = new Module("Erasmus", "EM");
		course.addModule(module);
		course.addStudent(student);
		List <Module> var1 = course.getModules();
		List <Module> var2 = new ArrayList();
		var2.add(module);
		
        assertEquals(var1,var2);
	
	}

	@Test
	void testGetStudents() {
	
		Student student = new Student("John","Doe",1995, 5, 5);
		Course course = new Course("Software engineering", 2019, 9, 1, 2020, 12, 22);
		Module module = new Module("Erasmus", "EM");
		course.addModule(module);
		course.addStudent(student);
		List <Student> var1 = course.getStudents();
		List <Student> var2 = new ArrayList();
		var2.add(student);
		
        assertEquals(var1,var2);
		
		
	}

	@Test
	void testGetStartDate() {
		
		Course course = new Course("Software engineering", 2019, 9, 1, 2020, 12, 22);
       LocalDate var1 = new LocalDate(2019,9,1);
       
       assertEquals(var1, course.getStartDate());

		
	}

	@Test
	void testGetEndDate() {
	
		Course course = new Course("Software engineering", 2019, 9, 1, 2020, 12, 22);
	       LocalDate var1 = new LocalDate(2020,12,22);
	       
	       assertEquals(var1, course.getEndDate());
		
		
	}

}
