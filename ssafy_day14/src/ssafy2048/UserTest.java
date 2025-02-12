package ssafy2048;

import java.util.Arrays;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId("user1");
		user1.setPassword("user1");
		user1.setName("김싸피");
		user1.setEmail("ssafy1@ssafy.com");
		user1.setAge(27);

		User user2 = new User("user2", "user2", "박싸피", "ssafy2@ssafy.com", 28);
		VipUser vuser = new VipUser("vip1", "vip1", "김싸피" , "ssafy3@ssafy.com", 29, "Gold", 300);
		
		UserManager um = new UserManager();
		
		um.add(user1);
		um.add(user2);
		um.add(vuser);
		
		System.out.println(Arrays.toString(um.searchByName("김")));
		System.out.println(Arrays.toString(um.getUsers()));
		System.out.println(Arrays.toString(um.getVipUsers()));
	}

}
