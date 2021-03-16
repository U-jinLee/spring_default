package org.yoojin.test;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {
	/*Hikari CP 연결 관련 테스트*/
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DataSource dataSource;
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testConnection() {
		try(
				SqlSession session = sqlSessionFactory.openSession();
				Connection con = dataSource.getConnection()){
			logger.info("mybatis= "+session);
			logger.info("커넥션 풀 연결:"+con);
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
