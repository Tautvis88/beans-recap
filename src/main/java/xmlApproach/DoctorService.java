package xmlApproach;

/**
 * Šita klasė DoctorService irgi yra kaip BEAN'sas aprašytas /recources/beans.xml faile, bet ji jau priklauso nuo
 * kito bean'so DoctorRepository, nes sukuriant DoctorService, konstruktorius injectina tą DoctorRepository
 * beans'ą (constructor based DI) į šį DoctorService beansą ir dar papildomai išspausdina žinutę, kad
 * "DoctorService bean was created!".
 * <br><br>
 * bean id="doctorService" class="xmlApproach.DoctorService" <br>
 * constructor-arg ref="doctorRepository" <br>
 * "constructor-arg ref=" yra nurodytas beans'as doctorRepository, nes kai sukuriamas "doctorService" beansas,
 * tai jam per konstruktorių reikia paduoti kitą beansą "doctorRepository".
 */
public class DoctorService {

	private final DoctorRepository doctorRepository;

	public DoctorService(DoctorRepository doctorRepository) {
		System.out.println("DoctorService bean was created!");
		this.doctorRepository = doctorRepository;
	}

	public void invokeDoctorRepo() {
		doctorRepository.save("Random doctor.");
	}
}
