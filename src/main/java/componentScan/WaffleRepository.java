package componentScan;

import org.springframework.stereotype.Repository;

@Repository		//@Service @Component @RestController - visos anotacijos padaro iš klasės beansą.
public class WaffleRepository {

	public WaffleRepository() {
		System.out.println("Waffle repo was created.");
	}
}
