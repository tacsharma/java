import java.util.*;

public class StudentDriver

{

	public static void main(String args[])

	{

		String firstName, lastName, eMail, contactNo, line1, line2, city, state;

		String qualName, institute, university, name, role;

		float cgpa;

		int i, j, k, l, m, n, p, q, s, pinCode, daydob, monthdob, yeardob, startday, startmonth, startyear, endday, endmonth, endyear;		

		Scanner scan= new Scanner(System.in);

        System.out.println("Enter the number of students");

		n = scan.nextInt();

		Student[] student = new Student[n];

		for (i= 0; i< n; i++)

		{

        System.out.print("Enter First Name: ");

		firstName = scan.next();

		System.out.print("Enter Last Name: ");

		lastName = scan.next();

        System.out.println("Enter Address--- ");

		System.out.print("Enter line1: ");

		line1 = scan.next();

        System.out.print("Enter line2: ");

		line2 = scan.next();

        System.out.print("Enter city: ");

		city = scan.next();

        System.out.print("Enter state: ");

		state = scan.next();

        System.out.print("Enter pincode: ");

		pinCode = scan.nextInt();		

        System.out.println("Enter Date of Birth: ");

		daydob = scan.nextInt();

		monthdob = scan.nextInt();

		yeardob = scan.nextInt();		

		System.out.print("Enter number of Skills: ");

		s= scan.nextInt();

		String[] sk = new String[s];

		for (m= 0; m< s; m++) 

		{

			System.out.print("Enter Skills: ");

			sk[m] = scan.next();

		}

        System.out.print("Enter number of Qualifications: ");

		q= scan.nextInt();

		Qualification[] ql = new Qualification[q];

		for (m= 0; m< q; m++) 

		{

			System.out.println("Enter details of Qualification---" + (m+1));

            System.out.print("Enter qualification name: ");

			qualName = scan.next();

            System.out.print("Enter university: ");

			university = scan.next();

            System.out.print("Enter institute: ");

			institute = scan.next();

            System.out.print("Enter cgpa: ");

			cgpa = scan.nextFloat();

			ql[m]= new Qualification(qualName, university, institute, cgpa);

        }

        System.out.print("Enter number of projects: ");

		p = scan.nextInt();

        Project[] pr = new Project[p];

	    for(m= 0; m< p; m++)

		{

			System.out.print("Enter project name: ");

			name = scan.next();

            System.out.print("Enter start date: ");

			startday = scan.nextInt();

			startmonth = scan.nextInt();

			startyear = scan.nextInt();

			System.out.println("Enter end date: ");

			endday = scan.nextInt();

			endmonth = scan.nextInt();

			endyear = scan.nextInt();

			System.out.print("Enter role: ");

			role = scan.next();

			System.out.print("Enter number of responsibilities: ");

			l = scan.nextInt();

            String[] resp = new String[l];

			System.out.print("Enter responsibilities: ");

			for (j= 0; j< l; j++) 

			{

				resp[j] = scan.next();

			}

            pr[m] = new Project(name, startday, startmonth, startyear, endday, endmonth, endyear, role, l);

			pr[m].setStart(startday, startmonth, startyear);

			pr[m].setEnd(endday, endmonth, endyear);

        }

        System.out.print("Enter Email: ");

		eMail = scan.next();

        System.out.print("Enter Contact Number: ");

		contactNo = scan.next();

        student[i] = new Student(firstName, lastName, line1, line2, city, state, pinCode, daydob, monthdob, yeardob, eMail, contactNo, s, q, p);

		student[i].setProject(pr);

		student[i].setSkills(sk);

		student[i].setQual(ql);

		student[i].setDob(daydob, monthdob, yeardob);

		student[i].setAddress(line1, line2, city, state, pinCode);

		System.out.println("\n###################################################################################################");

		student[i].displayDetails(p, q, s);

        }

	}

}	