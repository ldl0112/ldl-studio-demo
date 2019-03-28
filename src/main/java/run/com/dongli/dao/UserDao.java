package run.com.dongli.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import run.com.dongli.entity.User;

@Mapper
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
	List<User> selectUserList();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}