package xmlApproach;

/**
 * Šita klasė DoctorService yra kaip BEAN'sas aprašytas /recources/beans.xml faile:
 * <br><br>
 *     "bean id="doctorRepository" class="xmlApproach.DoctorRepository"" <br>
 *     "id=" yra beanso klasės name, o "class=" - path'as kur guli tas beansas.
 * <br><br>
 * Jis nuo nieko nepriklauso, nes jį sukuriant konstruktorius tik išspausdina žinutę, kad
 * "DoctorRepository bean was created!" ir viskas.
 */
public class DoctorRepository {

	public DoctorRepository() {
		System.out.println("DoctorRepository bean was created!");
	}

	public void save(String name) {
		System.out.println("Saving doctor: " + name);
	}
}
