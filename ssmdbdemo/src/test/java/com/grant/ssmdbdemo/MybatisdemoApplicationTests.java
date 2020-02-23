package com.grant.ssmdbdemo;

import com.grant.ssmdbdemo.entity.User;
import com.grant.ssmdbdemo.service.UserService;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

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

	@Test
	public void test1 () {
		User user = userService.findByNameAndAge("grant", 10);
		System.out.println(user.toString());
        /*
        Caused by: org.apache.ibatis.binding.BindingException:
        Parameter 'name' not found. Available parameters are [arg1, arg0, param1, param2]
        */
	}

	@Test
	public void test2 () {
		User user = userService.findByNameAndAge2("grant", 10);
		System.out.println(user.toString());
	}

	@Test
	public void test3 () {
		User pojo = new User();
		pojo.setName("grant");
		pojo.setAge(10);
		User user = userService.findByPojo(pojo);
		System.out.println(user.toString());
	}

	@Test
	public void test4 () {
		Map<String, Object> map = new HashMap<>();
		map.put("name","grant");
		map.put("age", 10);
		User user = userService.findByMap(map);
		System.out.println(user.toString());
	}

	@Test
	public void test5 () {
		Object [] array = {"mark", 30};
		List<Object> list = Arrays.asList(array);

		User user = userService.findByList(list);
		System.out.println(user.toString());
	}

	@Test
	public void test6 () {

		Object [] array = {"kevin", 20};

		User user = userService.findByArray(array);
		System.out.println(user.toString());
	}

	@Test
	public void test7 () {
		User user = userService.testGetValue1("grant");
		System.out.println(user.toString());
	}

	@Test
	public void test8 () {
		User user = userService.testGetValue2("kevin");
		System.out.println(user.toString());
	}



////
}
