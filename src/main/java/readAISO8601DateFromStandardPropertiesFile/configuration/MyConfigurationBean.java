package readAISO8601DateFromStandardPropertiesFile.configuration;

import org.joda.time.DateTime;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class MyConfigurationBean {
    private DateTime myDate;
    private DateTime myDate2;
    private DateTime myDate3;
    private DateTime myDate4;
	public DateTime getMyDate() {
		return myDate;
	}
	public void setMyDate(DateTime myDate) {
		this.myDate = myDate;
	}
	public DateTime getMyDate2() {
		return myDate2;
	}
	public void setMyDate2(DateTime myDate2) {
		this.myDate2 = myDate2;
	}
	public DateTime getMyDate3() {
		return myDate3;
	}
	public void setMyDate3(DateTime myDate3) {
		this.myDate3 = myDate3;
	}
	public DateTime getMyDate4() {
		return myDate4;
	}
	public void setMyDate4(DateTime myDate4) {
		this.myDate4 = myDate4;
	}
}