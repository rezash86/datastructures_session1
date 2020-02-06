package service;

import static org.junit.Assert.assertEquals;
 

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import dao.StudentDao;
import model.Student;

public class TestStudentService {
	

    
	
	@Test
	public void test_getStudents() {
		
		// Mock data
		StudentDao dbService = Mockito.mock(StudentDao.class);
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Toto"));
		studentList.add(new Student(2, "Popo"));
		Mockito.when(dbService.getStudents()).thenReturn(studentList);
		
		StudentService service = new StudentService(dbService);

		List<String> expected_result = new ArrayList<String>();
		expected_result.add("Toto");
		expected_result.add("Popo");
		
		List<String> result_students = service.getStudents();
		
		assertEquals(expected_result, result_students);
	}
	
	
	@Test
	public void test_get_student() {
		StudentDao dbService = Mockito.mock(StudentDao.class);
		StudentService service = new StudentService(dbService);
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Toto"));
		studentList.add(new Student(2, "Popo"));
		Mockito.when(dbService.getStudents()).thenReturn(studentList);
		//Mockito.when(dbService.getStudentById(Mockito.anyInt())).thenReturn(new Student(1, "Toto"));
		
		Student actual_student = service.getStudentById(1);
		
		Student expected_student = new Student(1, "Toto");
		
		assertEquals(actual_student.getName(), expected_student.getName());
	}
	
	
	
	
	
	
}
