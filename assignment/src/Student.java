class Student

{

  String firstName,lastName,line1, line2, city, state,eMail,contactNo;

  Address addr;

  int pinCode,daydob, monthdob, yeardob;

  Date dob;

  String[] skills;

  Qualification[] qual;

  Project[] projects;

  int k;



  Student(String firstName, String lastName, String line1, String line2, String city, String state, int pinCode, int monthdob, int daydob, int yeardob, String eMail, String contactNo, int s, int p, int q)

  {

  this.firstName = firstName;

  this.lastName = lastName;

  this.addr = new Address(line1, line2, city, state, pinCode);

  this.dob = new Date(daydob, monthdob, yeardob);

  this.skills = new String[s];

  this.qual = new Qualification[q];

  this.projects = new Project[p];

  this.eMail = eMail;

  this.contactNo = contactNo;

  }

  public void setDob(int daydob, int monthdob, int yeardob)

  {

  this.daydob = daydob;

  this.monthdob = monthdob;

  this.yeardob = yeardob;

  }

  public String getDob()

  {

  dob.setDate(daydob, monthdob, yeardob);

  return dob.displayDate();

  }

  public void setAddress(String line1, String line2, String city, String state, int pinCode )

  {

  this.line1 = line1;

  this.line2 = line2;

  this.city = city;

  this.state = state;

  this.pinCode = pinCode;

  }

  public Address getAddr()

  {

  System.out.println("Line1: " + line1 + "\nLine2: " + line2 + "\nCity: " + city + "\nState: " + state + "\nPincode: " + pinCode);

  return addr;

  }

  public void setSkills(String[] sk)

  {

  this.skills = sk;

  }

  public void getSkills(int s)

  {

  System.out.println(skills);

  }

  public void setQual(Qualification[] ql)

  {

  qual = ql;

  }

  public Qualification[] getQual()

  {

  return qual;      

  }

  public void setProject(Project[] pr)

  {

  projects = pr;

  }

  public Project[] getProject()

  {

  return projects;

  }

  public void displayDetails(int p, int q, int s)

  {

  int i;

  System.out.println("\nStudent Name: " + firstName + " " + lastName);

  System.out.println("Date of birth: " + dob.displayDate());

  System.out.println("Email: " + eMail);

  System.out.println("Contact Number: " + contactNo);   

  System.out.println("Address ");

  System.out.println(addr.displayAddress());

  System.out.println("Skills: ");

  for(i= 0; i< s; i++)

  {

  System.out.println(skills[i]);

  }

  System.out.println("\nQualifications ");

  for(i= 0; i< q; i++)

  {

  System.out.println(qual[i].displayQualifications());

  }

  System.out.println("Project Details: ");

  for(i= 0; i< p; i++)

  {

  System.out.println(projects[i].displayProjects());

  }

  }

}


