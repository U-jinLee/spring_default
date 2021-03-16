package org.yoojin.test;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SampleTest {
	/*MySQL Connector 연결 관련 테스트*/
	private final Logger logger =LoggerFactory.getLogger(this.getClass());
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testConnection() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_db?serverTimezone=Asia/Seoul","root","1q2w3e4r!");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
}
