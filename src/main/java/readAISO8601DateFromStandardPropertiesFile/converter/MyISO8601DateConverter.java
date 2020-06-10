package readAISO8601DateFromStandardPropertiesFile.converter;

import org.joda.time.DateTime;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class MyISO8601DateConverter implements Converter<String, DateTime> {
    @Override
    public DateTime convert(String source) {
        if (source == null) {
            return null;
        }
        DateTime dateToReturn = null;
        try {
        	dateToReturn = new DateTime(source);//"2005-12-31T23:59:59.000" for instance
		} catch (org.joda.time.IllegalInstantException e) {
			//Logging that exception would be nice
			throw new RuntimeException(e);
		}
        return dateToReturn;
    }
}