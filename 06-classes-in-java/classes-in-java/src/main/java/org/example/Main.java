// !!DO NOT MODIFY THE CODE IN THIS FILE!!

package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class to run the program
 */
public class Main {
    /**
     * Scanner object to read input from the user
     */
    public static Scanner input = new Scanner(System.in);

    /**
     * List of students
     */
    public static List<Student> students = new ArrayList<Student>() {
        {
            add(new Student("John", "Doe", 20, "Computer Science"));
            add(new Student("Jane", "Doe", 21, "Network Engineering"));
            add(new Student("Alice", "Doe", 22, "Project Management"));
            add(new Student("Bob", "Doe", 23, "Computer Science"));
            add(new Student("Eve", "Doe", 24, "Network Engineering"));
        }
    };

    /**
     * List of teachers
     */
    public static List<Teacher> teachers = new ArrayList<Teacher>() {
        {
            add(new Teacher("John", "Smith", "Computer Science"));
            add(new Teacher("Jane", "Smith", "Network Engineering"));
            add(new Teacher("Alice", "Smith", "Project Management"));
        }
    };

    /**
     * Main method to run the program
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Management System");
        mainMenu();
    }

    /**
     * Main menu to display options for the user
     */
    public static void mainMenu() {
        while(true) {
            System.out.println("-----------------");
            System.out.println("Main Menu");
            System.out.println("-----------------");
            System.out.println("1. Teacher Menu");
            System.out.println("2. Student Menu");
            System.out.println("3. Exit");
            System.out.println("-----------------");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice) {
                case 1:
                    teacherMenu();
                    break;
                case 2:
                    studentMenu();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if(choice == 3) {
                break;
            }
        }
    }

    /**
     * Teacher menu to display options for the user
     */
    public static void teacherMenu() {
        while(true) {
            System.out.println("-----------------");
            System.out.println("Teacher Menu");
            System.out.println("-----------------");
            System.out.println("1. View Teachers");
            System.out.println("2. Add Teacher");
            System.out.println("3. Remove Teacher");
            System.out.println("4. Return to Main Menu");
            System.out.println("-----------------");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice) {
                case 1:
                    viewTeachers();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    removeTeacher();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if(choice == 4) {
                break;
            }
        }
    }

    /**
     * Student menu to display options for the user
     */
    public static void studentMenu() {
        while(true) {
            System.out.println("-----------------");
            System.out.println("Student Menu");
            System.out.println("-----------------");
            System.out.println("1. View Students");
            System.out.println("2. Add Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Return to Main Menu");
            System.out.println("-----------------");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice) {
                case 1:
                    viewStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if(choice == 4) {
                break;
            }
        }
    }

    /**
     * Display all students
     */
    public static void viewStudents() {
        System.out.println("-----------------");
        System.out.println("View Students");
        System.out.println("-----------------");
        for(Student student : students) {
            System.out.println(student);
        }
    }

    /**
     * Add a new student
     */
    public static void addStudent() {
        System.out.println("-----------------");
        System.out.println("Add Student");
        System.out.println("-----------------");
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter class number: ");
        int classNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter class name: ");
        String className = input.nextLine();
        students.add(new Student(firstName, lastName, classNumber, className));
        System.out.println("Student added successfully.");
    }

    /**
     * Remove a student
     */
    public static void removeStudent() {
        System.out.println("-----------------");
        System.out.println("Remove Student");
        System.out.println("-----------------");
        System.out.print("Enter student index: ");
        int index = input.nextInt();
        input.nextLine();
        if(index >= 0 && index < students.size()) {
            students.remove(index);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    /**
     * Display all teachers
     */
    public static void viewTeachers() {
        System.out.println("-----------------");
        System.out.println("View Teachers");
        System.out.println("-----------------");
        for(Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    /**
     * Add a new teacher
     */
    public static void addTeacher() {
        System.out.println("-----------------");
        System.out.println("Add Teacher");
        System.out.println("-----------------");
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter subject: ");
        String subject = input.nextLine();
        teachers.add(new Teacher(firstName, lastName, subject));
        System.out.println("Teacher added successfully.");
    }

    /**
     * Remove a teacher
     */
    public static void removeTeacher() {
        System.out.println("-----------------");
        System.out.println("Remove Teacher");
        System.out.println("-----------------");
        System.out.print("Enter teacher index: ");
        int index = input.nextInt();
        input.nextLine();
        if(index >= 0 && index < teachers.size()) {
            teachers.remove(index);
            System.out.println("Teacher removed successfully.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }
}