package text;

import java.util.ArrayList;
import java.util.List;
import mybatisPojo.Dept;
import mybatisPojo.User;
import mybatisdao.DeptMapper;
import mybatisutil.MyBatisSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class DeptText {
    private Logger logger = Logger.getLogger(DeptText.class);
    private SqlSession ss = MyBatisSession.getMyBatisSession().getSession();
	@Test
	public void getUserdeptid() {
		List<User> list = new ArrayList<User>();
		try {
			Dept dept = new Dept();
			dept.setDeptid(20);
			list = ss.getMapper(DeptMapper.class).getUserdeptid(dept);
			for (User user : list) {
				logger.debug("连表查询对象===》"+user.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisSession.getMyBatisSession().Sessioncolse(ss);
		}
	}

}
