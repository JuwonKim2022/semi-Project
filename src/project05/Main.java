package project05;

import java.util.*;
public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동");
		Student s2 = new Student("홍길서");
		Student s3 = new Student("홍길남");

		Course se = new Course("Software Engineering");
		Course dp = new Course("Disign Pattern");

		Transcript t1 = new Transcript(s1, se);
		Transcript t2 = new Transcript(s2, dp);
		Transcript t3 = new Transcript(s3, dp);

		t1.setGrade("A+");
		t2.setGrade("C+");
		t3.setGrade("A");

		t1.setDate("2021");
		t2.setDate("2022");
		t3.setDate("2019");

		Vector<Transcript> transcripts = new Vector<Transcript>(Arrays.asList(t1,t2,t3));

		for (int i=0; i<transcripts.size(); i++) {
		System.out.println(transcripts.get(i).getCourse().getName());
		System.out.println(transcripts.get(i).getStudent().getName());
		System.out.println(transcripts.get(i).getDate());
		System.out.println(transcripts.get(i).getGrade());
		System.out.println("-------------------");
		}

	}
}	