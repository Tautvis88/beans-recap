package componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaffleService {

	@Autowired // field based DI
	private WaffleRepository waffleRepository;
	public WaffleService() {
		System.out.println("Waffle service was created.");

	}

}
