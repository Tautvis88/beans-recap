package javaConfiguration;

/**
 * Šios klasės beans'ą sukurs metodas, aprašytas PaperConfig.java klasėje
 */
public class ToiletPaperRepository {
	public ToiletPaperRepository() {
		System.out.println("Toilet paper repo has been created.");
	}

	public void getPaper() {
		System.out.println("Getting paper from DB.");
	}
}
