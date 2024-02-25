package componentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration	// nurodome, kad tai configuracine klase // veikia ir be šito, tai tikrai reikia?
@ComponentScan("componentScan")		// nurodome kokius package skanuoti ir iš to package kurti beans'us
public class AppConfig {
}
