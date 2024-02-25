package javaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainPaperApplication {

	public static void main(String[] args) {
		// Prieš tai kūrėme ClassPathXmlApplicationContext contextą ir į jį padavėme beans.xml failą, kad sukurtų beansus.
		// O dabar kursime AnnotationConfigApplicationContext contextą, nes jis gali priimti PaperConfig.class,
		// kurioje aprašytą kokius beans'us reikia sukurti.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PaperConfig.class);

		// Vėl iš contexto išsitraukiame objektą/beansą ir per jį iškviečiame metoddą execute:
		ToiletPaperService toiletPaperService = context.getBean(ToiletPaperService.class);
		toiletPaperService.execute();
	}
}
