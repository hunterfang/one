package mybatisdao;

import java.util.List;

import mybatisPojo.Dept;
import mybatisPojo.User;

public interface DeptMapper {
       //�����ѯ
	  public List<User> getUserdeptid(Dept dept);
}
