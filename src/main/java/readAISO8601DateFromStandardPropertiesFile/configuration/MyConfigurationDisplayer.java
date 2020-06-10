package readAISO8601DateFromStandardPropertiesFile.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyConfigurationDisplayer implements ApplicationListener<ApplicationReadyEvent> {
	@Autowired
	MyConfigurationBean myConf;
	
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.println("Will display the 'myDate', 'myDate2', 'myDate3' and 'myDate4' values from the src/main/resources/application.properties file");
		System.out.println(myConf.getMyDate());
		System.out.println(myConf.getMyDate2());
		System.out.println(myConf.getMyDate3());
		System.out.println(myConf.getMyDate4());
	}
}