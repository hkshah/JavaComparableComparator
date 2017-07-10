package com.jcc.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compare {
	public static void main(String args[]) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("Hardik", 23, 24));
		arrayList.add(new Student("Ritesh", 7, 28));
		arrayList.add(new Student("Bhavik", 15, 26));

		System.out.println("----- Before Sorting -----");
		System.out.println();
		for (Student st : arrayList) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}

		Collections.sort(arrayList);
		System.out.println();
		System.out.println("----- After Sorting by RollNo-----");
		System.out.println();
		for (Student st : arrayList) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}

		Collections.sort(arrayList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return Integer.compare(s1.age, s2.age);
			}
		});
		System.out.println();
		System.out.println("----- After Sorting by Age-----");
		System.out.println();
		for (Student st : arrayList) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}

		Collections.sort(arrayList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.name.compareTo(s2.name);
			}
		});
		System.out.println();
		System.out.println("----- After Sorting by Name-----");
		System.out.println();
		for (Student st : arrayList) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}
	}
}