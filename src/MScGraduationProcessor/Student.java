package MScGraduationProcessor;

public class Student {

	private int StudentNo;
	private String firstName;
	private String lastName;
	private int ProgramResult;
	private int CompFound;
	private int dBS;
	private int web;
	private int SoftwareE;
	private int average;
	private String Classification;

	@Override
	public String toString() {
		return "Student no. : " + StudentNo + "\r First name : " + firstName + "\r Last name : " + lastName
				+ "\r Program : " + ProgramResult + "\r Comp Found :" + CompFound + "\r DBs : " + dBS + "\r Web : "
				+ web + "\r SoftwareE : " + SoftwareE + "\r Average : " + average + "\r Classification : "
				+ Classification;
	}

	/**
	 * @param studentNo
	 * @param firstName
	 * @param lastName
	 * @param programResult
	 * @param compFound
	 * @param dBS
	 * @param web
	 * @param softwareE
	 * @param average
	 * @param classification
	 */
	public Student(int studentNo, String firstName, String lastName, int programResult, int compFound, int dBS, int web,
			int softwareE, int average) {
		StudentNo = studentNo;
		this.firstName = firstName;
		this.lastName = lastName;
		ProgramResult = programResult;
		CompFound = compFound;
		this.dBS = dBS;
		this.web = web;
		SoftwareE = softwareE;
		setAverage(programResult, compFound, dBS, web, softwareE);
		this.average = getAverage();
		setClassification(getAverage());
		this.Classification = getClassification();
	}

	/**
	 * @return the studentNo
	 */
	public int getStudentNo() {
		return StudentNo;
	}

	/**
	 * @param studentNo the studentNo to set
	 */
	public void setStudentNo(int studentNo) {
		StudentNo = studentNo;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the programResult
	 */
	public int getProgramResult() {
		return ProgramResult;
	}

	/**
	 * @param programResult the programResult to set
	 */
	public void setProgramResult(int programResult) {
		ProgramResult = programResult;
	}

	/**
	 * @return the compFound
	 */
	public int getCompFound() {
		return CompFound;
	}

	/**
	 * @param compFound the compFound to set
	 */
	public void setCompFound(int compFound) {
		CompFound = compFound;
	}

	/**
	 * @return the dBS
	 */
	public int getdBS() {
		return dBS;
	}

	/**
	 * @param dBS the dBS to set
	 */
	public void setdBS(int dBS) {
		this.dBS = dBS;
	}

	/**
	 * @return the web
	 */
	public int getWeb() {
		return web;
	}

	/**
	 * @param web the web to set
	 */
	public void setWeb(int web) {
		this.web = web;
	}

	/**
	 * @return the softwareE
	 */
	public int getSoftwareE() {
		return SoftwareE;
	}

	/**
	 * @param softwareE the softwareE to set
	 */
	public void setSoftwareE(int softwareE) {
		SoftwareE = softwareE;
	}

	/**
	 * @return the average
	 */
	public int getAverage() {
		return average;
	}

	/**
	 * @param average    the average to set
	 * @param softwareE2
	 * @param web2
	 * @param dBS2
	 * @param compFound2
	 */
	public void setAverage(int average, int compFound2, int dBS2, int web2, int softwareE2) {
		this.average = average;
	}

	/**
	 * @return the classification
	 */
	public String getClassification() {
		return Classification;
	}

	/**
	 * @param i the classification to set
	 */
	public void setClassification(int i) {
		if (i < 0)
			Classification = "error";
		else if (i < 50)
			Classification = "fail";
		else if (i < 60)
			Classification = "pass";
		else if (i < 70)
			Classification = "commendation";
		else if (i <= 100)
			Classification = "distinction";
		else if (i > 100)
			Classification = "error";
	}

}
