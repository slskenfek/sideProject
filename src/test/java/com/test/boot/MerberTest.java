package com.test.boot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shpping.member.boot.MemberBean;
import com.shpping.member.boot.MemberRepository;
import com.shpping.member.boot.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MerberTest {

		@Autowired
		MemberRepository memberrepository;
		
		@Test
		public void testInsert() {
			for(int i=0; i<=100; i++) {
			MemberBean bean = new MemberBean();
			bean.setUemail("testmail" + i);
			bean.setUid("testuid " + i);
			bean.setUpw("test upw" + i);
			User user = new User();
			if(i <= 80) {
				user.setName("80com");
			} else if (i <= 90){
				user.setName("90com");
			}
			
			}
		}
}
