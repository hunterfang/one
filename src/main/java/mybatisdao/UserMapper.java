package mybatisdao;
import java.util.List;
import mybatisPojo.User;
import mybatisPojo.page;
/**
 * mybatis映射文件接口
 * @author: 方辉
 *
 * 2017-5-31下午4:39:40
 */
public interface UserMapper {
	  
	  //总条数
      public int count();
      //查询所有对象
      public List<User> getlist();
      //删除对象
      public void delete(User us);
      //新增对象
      public void add(User us);
      //修改对象
      public void update(User us);
      //分页查询
      public List<User> getlistfy(page pg);
      //动态查询+模糊查询
      public List<User> getUserdtmh(User us);
}
