package xmlApproach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDoctorApplication {

	public static void main(String[] args) {
		// Sukuriamas context'as, kuris pagal beans.xml faile esantį aprašymą sukuria visus beans'us.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// Mums reikia doctorService objekto, kad per jį galėtume iškviesti metodą invokeDoctorRepo().
		// Tačiau mes nekuriame doctorService objekto, o ištraukiame jį kaip beans'ą (=objektą) iš context'o:
		DoctorService doctorService = (DoctorService) (context.getBean("doctorService")); //reikia castinti
		doctorService.invokeDoctorRepo();

		// Tą patį padarome su doctorRepository beansu:
		DoctorRepository doctorRepository = context.getBean(DoctorRepository.class); //nereikia castinti
		doctorRepository.save("Other random doctor");

		// Tą patį padarome su patientService beansu:
		PatientService patientService = context.getBean(PatientService.class);
		patientService.showPatientInfo();

		context.close();		// uždarome contextą.
	}
}
