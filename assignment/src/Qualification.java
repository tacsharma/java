class Qualification

{



	String qualName;

	String university;

	String institute;

	float cgpa;

  Qualification(String qualName, String university, String institute, float cgpa)

    { 

        this.qualName = qualName;

        this.university = university;

        this.institute = institute;

  		this.cgpa = cgpa;

  	}

  public String displayQualifications()

  {

    System.out.println("Qualification Name: " + qualName + "\nUniversity Name: " + university + "\nInstitute Name: " + institute + "\nCGPA: " + cgpa);

    return "";

  }

}
