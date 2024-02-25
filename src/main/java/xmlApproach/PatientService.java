package xmlApproach;

public class PatientService {

	/**
	 * doctorService yra CONSTRUCTOR based DI, nes doctorService injectiname per konstruktorių,
	 * o kaip injectinti doctorService nurodome per ref beans.xml faile: <br>
	 * <br>
	 * constructor-arg ref="doctorService"/>
 	 */
	private final DoctorService doctorService;

	/**
	 * firstName bei jo initial value irgi yra CONSTRUCTOR based DI, nes firstName injectiname per konstruktorių,
	 * o injectinimas irg aprašytas beans.xml faile: <br>
	 * <br>
	 * constructor-arg name="firstName" value="Petras"/>
	 */
	private final String firstName;

	/**
	 * lastName ir age yra SETTER based DI, nes šitie properčiai užsetinami per setterius,
	 * o values paimamos iš beans.xml failo: <br>
	 * <br>
	 * property name="lastName" value="Petraitis"/> <br>
	 * property name="age" value="65"/>
	 */
	private String lastName;
	private int age;

	/**
	 * dar yra FIELD based DI kai ant fieldo uždedi @Autowired (žr. componentScan package'e example)
	 */

	public PatientService(DoctorService doctorService, String firstName) {
		System.out.println("PatientService bean was created! Inside it has DoctorService bean.");
		this.doctorService = doctorService;
		this.firstName = firstName;
	}

	public void showPatientInfo() {
		System.out.println("Patient: " + firstName + " " + lastName + ". Age: " + age);
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
