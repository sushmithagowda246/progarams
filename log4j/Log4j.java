package log4j;
import org.apache.log4j.Logger;
public class Log4j
{
	public static void main(String[] args)
	{
		Logger log=Logger.getLogger("NewLog");
		log.info("Log4j is working...");
	}
}
