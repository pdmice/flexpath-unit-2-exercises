import org.example.Student;
import org.example.Teacher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Exercise tests
 */
public class ExerciseTests {
    /**
     * Test the student constructor and toString method
     */
    @Test
    public void testStudentConstructorToString() {
        Student student = new Student("John", "Doe", 1, "Math");
        assertEquals("John Doe (1 - Math)", student.toString());
    }

    /**
     * Test getting the first name of the student
     */
    @Test
    public void testStudentGetFirstName() {
        Student student = new Student("John", "Doe", 1, "Math");
        assertEquals("John", student.getFirstName());
    }

    /**
     * Test getting the last name of the student
     */
    @Test
    public void testStudentGetLastName() {
        Student student = new Student("John", "Doe", 1, "Math");
        assertEquals("Doe", student.getLastName());
    }

    /**
     * Test getting the class number of the student
     */
    @Test
    public void testStudentGetClassNumber() {
        Student student = new Student("John", "Doe", 1, "Math");
        assertEquals(1, student.getClassNumber());
    }

    /**
     * Test getting the class name of the student
     */
    @Test
    public void testStudentGetClassName() {
        Student student = new Student("John", "Doe", 1, "Math");
        assertEquals("Math", student.getClassName());
    }

    /**
     * Test setting the first name of the student
     */
    @Test
    public void testStudentSetFirstName() {
        Student student = new Student("John", "Doe", 1, "Math");
        student.setFirstName("Jane");
        assertEquals("Jane", student.getFirstName());
    }

    /**
     * Test setting the last name of the student
     */
    @Test
    public void testStudentSetLastName() {
        Student student = new Student("John", "Doe", 1, "Math");
        student.setLastName("Smith");
        assertEquals("Smith", student.getLastName());
    }

    /**
     * Test setting the class number of the student
     */
    @Test
    public void testStudentSetClassNumber() {
        Student student = new Student("John", "Doe", 1, "Math");
        student.setClassNumber(2);
        assertEquals(2, student.getClassNumber());
    }

    /**
     * Test setting the class name of the student
     */
    @Test
    public void testStudentSetClassName() {
        Student student = new Student("John", "Doe", 1, "Math");
        student.setClassName("Science");
        assertEquals("Science", student.getClassName());
    }

    /**
     * Test the teacher constructor and toString method
     */
    @Test
    public void testTeacherConstructorToString() {
        Teacher teacher = new Teacher("John", "Smith", "Math");
        assertEquals("John Smith (Math)", teacher.toString());
    }

    /**
     * Test the teacher getFirstName method
     */
    @Test
    public void testTeacherGetFirstName() {
        Teacher teacher = new Teacher("John", "Smith", "Math");
        assertEquals("John", teacher.getFirstName());
    }

    /**
     * Test the teacher getLastName method
     */
    @Test
    public void testTeacherGetLastName() {
        Teacher teacher = new Teacher("John", "Smith", "Math");
        assertEquals("Smith", teacher.getLastName());
    }

    /**
     * Test the teacher getSubject method
     */
    @Test
    public void testTeacherGetSubject() {
        Teacher teacher = new Teacher("John", "Smith", "Math");
        assertEquals("Math", teacher.getSubject());
    }

    /**
     * Test the teacher setFirstName method
     */
    @Test
    public void testTeacherSetFirstName() {
        Teacher teacher = new Teacher("John", "Smith", "Math");
        teacher.setFirstName("Jane");
        assertEquals("Jane", teacher.getFirstName());
    }

    /**
     * Test the teacher setLastName method
     */
    @Test
    public void testTeacherSetLastName() {
        Teacher teacher = new Teacher("John", "Smith", "Math");
        teacher.setLastName("Doe");
        assertEquals("Doe", teacher.getLastName());
    }

    /**
     * Test the teacher setSubject method
     */
    @Test
    public void testTeacherSetSubject() {
        Teacher teacher = new Teacher("John", "Smith", "Math");
        teacher.setSubject("Science");
        assertEquals("Science", teacher.getSubject());
    }
}
