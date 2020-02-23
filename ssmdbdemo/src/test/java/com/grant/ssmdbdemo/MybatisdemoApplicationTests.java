package com.grant.ssmdbdemo;

import com.grant.ssmdbdemo.entity.User;
import com.grant.ssmdbdemo.service.UserService;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MybatisdemoApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	public void findById(){
		User user = userService.findById(1L);
		System.out.println("1111111111");
		System.out.println(user.toString());
	}

}
