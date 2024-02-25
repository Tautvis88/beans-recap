package componentScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@ComponentScan(packageName) -> jei nebūtų AppConfig klasės
public class MainWaffleApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
