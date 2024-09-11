package mybatis.service.user;

import java.util.List;

import mybatis.service.domain.Search;
import mybatis.service.domain.User;

public interface UserDao {
	
	// INSERT ȸ������
	public int addUser(User user) throws Exception;
	
	// SELECT ȸ������ �˻�
	public User getUser(String userId) throws Exception;
	
	// UPDATE ȸ������ ����
	public int updateUser(User user) throws Exception;
	
	//DELETE ȸ������ ����
	public int removeUser(String userId) throws Exception;
	
	// SELECT ȸ������ ����Ʈ
	public List<User> getUserList(Search search) throws Exception;
	
}
