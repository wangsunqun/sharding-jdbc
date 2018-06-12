package com.nakedhub.shardingjdbc;

import com.dangdang.ddframe.rdb.sharding.id.generator.self.CommonSelfIdGenerator;
import com.nakedhub.shardingjdbc.dao.UserDao;
import com.nakedhub.shardingjdbc.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbcApplicationTests {
	@Autowired
	private UserDao userDao;

	@Test
	public void contextLoads() {
		CommonSelfIdGenerator commonSelfIdGenerator = new CommonSelfIdGenerator();
		for (int i = 0; i<10; i++) {
			long userId = commonSelfIdGenerator.generateId().longValue();
			User user = new User();
			user.setUserId(userId);
			user.setOrderId(1);
			userDao.save(user);
		}
	}
}
