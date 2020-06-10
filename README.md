How to read an ISO 8601 Date from the standard application.properties with Spring Boot and Joda-time.<br/>
<br/>
How to compile and execute :<br/>
mvn package<br/>
java -jar ./target/readAISO8601DateFromStandardPropertiesFile-0.0.1-SNAPSHOT.jar<br/>
<br/>
<br/>
---application.properties<br/>
myDate=2000-12-31T23:59:59.000<br/>
myDate2=2000-01-01T12:00:00-05:00<br/>
myDate3=2000-04-10T23:59:59.000+04:00<br/>
myDate4=2000-04-10T23:59:59.000Z<br/>
---MyConfigurationBean.java<br/>
private String myDate;<br/>
private String myDate2;<br/>
private String myDate3;<br/>
private String myDate4;<br/>
+getter and setter<br/>
---MyISO8601DateConverter (technical class to parse the date from application.properties)<br/>
import org.joda.time.DateTime;<br/>
...<br/>
dateToReturn = new DateTime(source);<br/>
---The class who displays the value of the 'myDate' configuration<br/>
@Autowired<br/>
MyConfigurationBean myConf;<br/>
...<br/>
System.out.println(myConf.getMyDate());<br/>
System.out.println(myConf.getMyDate2());<br/>
System.out.println(myConf.getMyDate3());<br/>
System.out.println(myConf.getMyDate4());<br/>
<br/>
<br/>
The application will read the values '2000-12-31T23:59:59.000', '2000-01-01T12:00:00-05:00', '2000-04-10T23:59:59.000+04:00', '2000-04-10T23:59:59.000Z' of the properties myDate, myDate2, myDate3, myDate4 in the standard application.properties configuration file then display it in the terminal.<br/>


