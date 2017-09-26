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
			//1.��ȡ�����ļ�(mybatis-config.xml)��������
			InputStream is = Resources.getResourceAsStream(resource);
			//2.����sqlSessionFactory������ɶ������ļ��Ķ�ȡ
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			//3.����sqlSession����
			ss = factory.openSession();
			//4.����mapper�ļ��������ݲ���(����֮ǰҪ��mapper�ļ�����mybatis-config.xml��)
			count = ss.selectOne("mybatisdao.UserMapper.count");
			
			//��־���
			logger.debug("��������"+count);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			ss.close();
		}
		
		Assert.assertEquals(7, count);
	}

}
