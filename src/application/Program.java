package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.NumberOfStudents;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<NumberOfStudents> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int nA = sc.nextInt();
		
		for (int x = 1; x<=nA; x++) {
			int studentNumber = sc.nextInt();
			set.add(new NumberOfStudents(studentNumber));
		}
		
		System.out.print("How many students for course B? ");
		int nB = sc.nextInt();
		
		for (int x = 1; x<=nB; x++) {
			int studentNumber = sc.nextInt();
			set.add(new NumberOfStudents(studentNumber));
		}
		
		System.out.print("How many students for course C? ");
		int nC = sc.nextInt();
		
		for (int x = 1; x<=nC; x++) {
			int studentNumber = sc.nextInt();
			set.add(new NumberOfStudents(studentNumber));
		}
		
		System.out.println("Total students:" +set.size());
		
		sc.close();
	}

}
