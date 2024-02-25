package javaConfiguration;

/**
 * Šios klasės beans'ą sukurs metodas, aprašytas PaperConfig.java klasėje.
 * Sukūrimo metu bus injectintas kitas beansas toiletPaperRepository (CONSTRUCTOR based DI)
 */
public class ToiletPaperService {

	private final ToiletPaperRepository toiletPaperRepository;

	public ToiletPaperService(ToiletPaperRepository toiletPaperRepository) {
		this.toiletPaperRepository = toiletPaperRepository;
		System.out.println("Paper service bean was created.");
	}

	public void execute() {
		toiletPaperRepository.getPaper();
	}
}
