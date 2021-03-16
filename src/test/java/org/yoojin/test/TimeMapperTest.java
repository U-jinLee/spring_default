package org.yoojin.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yoojin.mapper.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		logger.info("First Name about TimeMapper's class:"+timeMapper.getClass().getName());
		logger.info("First Information about TimeMapper's class:"+timeMapper.getTime());
	}
	/*Mapper.xml Type Success*/
	@Test
	public void testGetTime2() {
		logger.info("Second Name about TimeMapper's class:"+timeMapper.getClass().getName());
		logger.info("Second Information about TimeMapper's class:"+timeMapper.getTime());
	}
}
