import java.util.Scanner;

import entity.Student;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Input size of array: ");
			int size = sc.nextInt();
			Student[] arrStudent = new Student[size];
			for (int i = 0; i < size; i++) {
				arrStudent[i] = new Student();
				System.out.println("Input data of student [" + i + "]: ");
				System.out.print("Name: ");
				arrStudent[i].setName(sc.next());
				System.out.print("Mark: ");
				arrStudent[i].setMark(sc.nextDouble());
			}
			for (int i = 0; i < size; i++) {
				System.out.println(arrStudent[i]);
			}
		} catch (Exception ex) {
			System.out.print("pls try again");
		}
	}
}
