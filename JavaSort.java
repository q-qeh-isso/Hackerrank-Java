import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class Checker2 implements Comparator<Student>{
	
	@Override
	public int compare(Student a, Student b) {
	//		return 1 if SECOND_ARG should be before FIRST_ARG
	//     	return -1 if FIRST_ARG should be before SECOND_ARG
	//     	return 0 otherwise (meaning the order stays the same)
		if(a.getCgpa() ==  b.getCgpa()) {
			if (a.getFname().compareTo(b.getFname()) == 0) {
				if(a.getId() > b.getId()) {
					return 1;
				} else if(a.getId() < b.getId()) {
					return -1;
				} 
				return 0;
			} else {
				return a.getFname().compareTo(b.getFname());
			}
		} else {
			if(a.getCgpa() > b.getCgpa()) {
				return -1;
			} else if(a.getCgpa() < b.getCgpa()) {
				return 1;
			}
			
			return 0;
		}
		
		
	}
}

public class JavaSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		/* input example
		  	33 Rumpa 3.68
			85 Ashis 3.85
			56 Samiha 3.75
			19 Samara 3.75
			22 Fahim 3.76
		 */
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
		Checker2 checker = new Checker2();
		Collections.sort(studentList, checker);
        
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}

	}

}
