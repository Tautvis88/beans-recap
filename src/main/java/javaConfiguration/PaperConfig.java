package javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MainPaperApplication klasėje esantis context'as inicializuoja šią PaperConfig klasę, kad būtų sukurti beansai.
 */
public class PaperConfig {

	@Bean	// tas pats, kad XML <bean> tag'as.
	public ToiletPaperRepository getRepository() {
		return new ToiletPaperRepository();
	}

	@Bean  // tas pats, kas XML constructor arg
	public ToiletPaperService getService(ToiletPaperRepository toiletPaperRepository) {
		return new ToiletPaperService(toiletPaperRepository);
	}
}
