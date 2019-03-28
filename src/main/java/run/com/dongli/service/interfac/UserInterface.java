package run.com.dongli.service.interfac;

import java.util.List;

import run.com.dongli.entity.User;

public interface UserInterface {

	User selectByPrimaryKey();
	
	List<User> getUserList();

}
