package text;

import java.io.IOException;
import java.io.InputStream;
import junit.framework.Assert;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

public class UserText {
    private Logger logger = Logger.getLogger(UserText.class);
	
	
	
	@Test
	public void test() {
		String resource = "mybatis-config.xml";
		int count = 0;
		SqlSession ss = null;
		try {
			//1.读取配置文件(mybatis-config.xml)的输入流
			InputStream is = Resources.getResourceAsStream(resource);
			//2.创建sqlSessionFactory对象，完成对配置文件的读取
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			//3.创建sqlSession对象
			ss = factory.openSession();
			//4.调用mapper文件进行数据操作(调用之前要把mapper文件加入mybatis-config.xml中)
			count = ss.selectOne("mybatisdao.UserMapper.count");
			
			//日志输出
			logger.debug("总条数："+count);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			ss.close();
		}
		
		Assert.assertEquals(7, count);
	}

}
