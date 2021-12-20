package MScGraduationProcessor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MSc {

	public static void main(String[] args) {

		File file = new File("ModuleScoresMSc.csv");
		try {
			FileReader read = new FileReader(file);
			BufferedReader r = new BufferedReader(read);

			r.readLine();
			String line = r.readLine();
			ArrayList<Student> students = new ArrayList<Student>();

			do {

				String[] splitLine = line.split(",");
				int SN = Integer.parseInt(splitLine[0]);
				int p = Integer.parseInt(splitLine[3]);
				int cf = Integer.parseInt(splitLine[4]);
				int db = Integer.parseInt(splitLine[5]);
				int web = Integer.parseInt(splitLine[6]);
				int se = Integer.parseInt(splitLine[7]);
				int av = (p + cf + db + web + se) / 5;

				students.add(new Student(SN, splitLine[1], splitLine[2], p, cf, db, web, se, av));

				line = r.readLine();

			} while (line != null);

			for (Student student : students) {
				System.out.println(student.toString());
				System.out.println();
			}

			printStudents(students);

			writeToFile(students);

			r.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println();
		}

	}

	private static void printStudents(ArrayList<Student> students) {
		// TODO Auto-generated method stub
		String studentInfo = "";
		for (Student student : students) {
			studentInfo = "Student no. : " + student.getStudentNo() + "\r First name : " + student.getFirstName()
					+ "\r Last name : " + student.getLastName() + "\r Average : " + student.getAverage()
					+ "\r Classification : " + student.getClassification() + "\r\r";
			System.out.println(studentInfo);
		}
	}

	private static void writeToFile(ArrayList<Student> students) {

		FileWriter write;
		try {
			write = new FileWriter("ListForGraduation.txt", true);
			BufferedWriter w = new BufferedWriter(write);
			
			String studentInfo = "";
			for (int i = 0; i < students.size(); i++) {
				studentInfo = "Student no. : " + students.get(i).getStudentNo() + "\r First name : "
						+ students.get(i).getFirstName() + "\r Last name : " + students.get(i).getLastName()
						+ "\r Average : " + students.get(i).getAverage() + "\r Classification : "
						+ students.get(i).getClassification() + "\r\r";
				w.write(studentInfo);

			}
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
