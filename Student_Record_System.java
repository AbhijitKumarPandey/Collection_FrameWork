package Project;

import java.util.*;

class Student{
	int roll_number;
	String name;
	double marks;
	 
	
	public Student(int roll_number, String name, double Marks ) {
		this.roll_number = roll_number;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return "Roll_number" + roll_number + " Name " + name + "Marks" + marks;
		
	}
}
public class Student_Record_System {
	
	public static void main(String[] args) {
		
		/*
		  Features
		  
		  > Add Student (Roll_Number,Name,Marks)
		  > Show All students
		  > Undo Last Added Student(Stack )
		  > Show Order Of Entries(Linkedlist )

		 */
		
		ArrayList<Student> studentList = new ArrayList<>();
        LinkedList<Integer> entryOrder = new LinkedList<>();
        Stack<Student> undoStack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- Student Record Menu ----");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Undo Last Add");
            System.out.println("4. Show Entry Order");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print(" Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(roll, name, marks);
                    studentList.add(s);
                    entryOrder.add(roll);
                    undoStack.push(s);

                    System.out.println(" Student added!");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");
                    if (studentList.isEmpty()) {
                        System.out.println("No records.");
                    } else {
                        for (Student stud : studentList) {
                            System.out.println(stud);
                        }
                    }
                    break;

                case 3:
                    if (!undoStack.isEmpty()) {
                        Student removed = undoStack.pop();
                        studentList.remove(removed);
                        entryOrder.removeLastOccurrence(removed.roll_number);
                        System.out.println(" Removed: " + removed);
                    } else {
                        System.out.println(" Nothing to undo.");
                    }
                    break;

                case 4:
                    System.out.println(" Order of Entry (Roll Numbers):");
                    if (entryOrder.isEmpty()) {
                        System.out.println("No entries yet.");
                    } else {
                        for (int r : entryOrder) {
                            System.out.print(r + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        
    }
}
		
		 
