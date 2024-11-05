import org.example.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the methods in the Main class.
 */
public class ExerciseTests {
    /**
     * Tests the getStudentNamesList method.
     */
    @Test
    public void testLists() {
        var result = Main.getStudentNamesList();
        assertEquals(4, result.size());
        assertTrue(result.contains("John"));
        assertTrue(result.contains("Jane"));
        assertTrue(result.contains("Alice"));
        assertTrue(result.contains("Bob"));
    }

    /**
     * Tests the getMStudents method.
     */
    @Test
    public void testMStudents() {
        var students = Main.getStudentNamesList();
        students.add("Mary");
        students.add("Mark");
        students.add("Megan");
        students.add("Michael");
        students.add("Samantha");
        students.add("Steven");

        var result = Main.getMStudents(students);
        assertEquals(4, result.size());
        assertTrue(result.contains("Mary"));
        assertTrue(result.contains("Mark"));
        assertTrue(result.contains("Megan"));
        assertTrue(result.contains("Michael"));
    }

    /**
     * Tests the getFirstThreeItems method.
     */
    @Test
    public void testFirstThreeItems() {
        var queue = new LinkedList<String>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        queue.add("Fourth");
        queue.add("Fifth");

        var result = Main.getFirstThreeItems(queue);
        assertEquals(3, result.size());
        assertEquals("First", result.get(0));
        assertEquals("Second", result.get(1));
        assertEquals("Third", result.get(2));
    }

    /**
     * Tests the makeSetFromList method.
     */
    @Test
    public void testSet() {
        var students = new ArrayList<String>();
        students.add("John");
        students.add("Jane");
        students.add("Alice");
        students.add("Bob");

        var result = Main.makeSetFromList(students);
        assertEquals(4, result.size());
        assertTrue(result.contains("John"));
        assertTrue(result.contains("Jane"));
        assertTrue(result.contains("Alice"));
        assertTrue(result.contains("Bob"));
    }

    /**
     * Tests the makeSetFromList method with duplicates.
     */
    @Test
    public void testSetWithDuplicates() {
        var students = new ArrayList<String>();
        students.add("John");
        students.add("Jane");
        students.add("Alice");
        students.add("Bob");
        students.add("John");
        students.add("Jane");
        students.add("Alice");
        students.add("Bob");

        var result = Main.makeSetFromList(students);
        assertEquals(4, result.size());
        assertTrue(result.contains("John"));
        assertTrue(result.contains("Jane"));
        assertTrue(result.contains("Alice"));
        assertTrue(result.contains("Bob"));
    }

    /**
     * Tests the checkIfHashSetContains method.
     */
    @Test
    public void testCheckIfHashSetContains() {
        var needles = List.of("John", "Jane", "Alice", "Bob");

        var haystack = new HashSet<String>(List.of("Dave", "Eve", "Frank", "Bob", "Grace"));
        assertTrue(Main.checkIfHashSetContainsAny(haystack, needles));
    }

    /**
     * Tests the checkIfHashSetContains method with no matches.
     */
    @Test
    public void testCheckIfHashSetDoesNotContain() {
        var needles = List.of("John", "Jane", "Alice", "Bob");

        var haystack = new HashSet<String>(List.of("Dave", "Eve", "Frank", "Grace"));
        assertFalse(Main.checkIfHashSetContainsAny(haystack, needles));
    }

    /**
     * Tests the checkIfHashSetContains method with an empty set.
     */
    @Test
    public void testBuildStudentGradesMap() {
        var students = List.of("John", "Jane", "Alice", "Bob");
        var grades = List.of(90.5, 85.4, 95.3, 88.2);

        var result = Main.buildStudentGradesMap(students, grades);
        assertEquals(4, result.size());
        assertEquals(90.5, result.get("John"));
        assertEquals(85.4, result.get("Jane"));
        assertEquals(95.3, result.get("Alice"));
        assertEquals(88.2, result.get("Bob"));
    }
}
