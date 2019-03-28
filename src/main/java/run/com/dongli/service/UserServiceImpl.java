package run.com.dongli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import run.com.dongli.dao.UserDao;
import run.com.dongli.entity.User;
import run.com.dongli.service.interfac.UserInterface;
@Service
public class UserServiceImpl implements UserInterface {

	@Autowired
	private UserDao UserDao; 
	
	@Override
	public User selectByPrimaryKey() {
		Integer id=1;
		return UserDao.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getUserList() {
		return UserDao.selectUserList();
	}

}
