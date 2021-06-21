package test.black;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Date: 2021/5/26
 * @Author: kuangkai
 * @Mail: kuangkai_jy@163.com
 **/
public class SpringPersonMainTest {

	private static final Log logger = LogFactory.getLog("black");

	private static final String APP_PATH = "org/springframework/black/applicationContext.xml";

	@Test
	void testPerson() {
		ApplicationContext context = new ClassPathXmlApplicationContext(APP_PATH);
		Person person = (Person)context.getBean("person");
		Assertions.assertEquals(person.getName(),"black");
	}
}
