package text;

import java.util.List;
import mybatisPojo.User;
import mybatisPojo.page;
import mybatisdao.UserMapper;
import mybatisutil.MyBatisSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


public class UserText2 {
	 private Logger logger = Logger.getLogger(UserText2.class);
	 private SqlSession ss = MyBatisSession.getMyBatisSession().getSession();
	@Test
	public void test() {
		int count = 0;
		count = ss.selectOne("mybatisdao.UserMapper.count");
		logger.debug("������========>��"+count);
		MyBatisSession.getMyBatisSession().Sessioncolse(ss);
	}
	
	@Test
	public void getlist() {
		/*List<User> list = ss.selectList("mybatisdao.UserMapper.getlist");*/
		List<User> list = ss.getMapper(UserMapper.class).getlist();
		for (User user : list) {
			logger.debug("��ѯ����========>��"+user.toString());
		}
		MyBatisSession.getMyBatisSession().Sessioncolse(ss);
	}
	
	@Test
	public void delete() {
		int count = 0;
		User us = new User();
		us.setId(6);
	    count = ss.delete("mybatisdao.UserMapper.delete",us);
		ss.commit();
		MyBatisSession.getMyBatisSession().Sessioncolse(ss);
		logger.debug("ɾ������========>��"+count);
	}
	
	@Test
	public void add() {
		int count = 0;
		User us = new User(8,"qwer",23,"��",50);
	    count = ss.delete("mybatisdao.UserMapper.add",us);
		ss.commit();
		MyBatisSession.getMyBatisSession().Sessioncolse(ss);
		logger.debug("��Ӷ���========>��"+count);
	}
	
	@Test
	public void update() {
		int count = 0;
		User us = new User(5,"qwer",23,"��",80);
	    count = ss.delete("mybatisdao.UserMapper.update",us);
		ss.commit();
		MyBatisSession.getMyBatisSession().Sessioncolse(ss);
		logger.debug("�޸Ķ���========>��"+count);
	}
	
	//��ҳ��ѯ����
	@Test
	public void getlistfy() {
		int count = 0;
		count = ss.selectOne("mybatisdao.UserMapper.count");
		page pg = new page();
		pg.setPagecount(count);
		pg.setRongliang(2);
		pg.setZongye();
		pg.setPageindex(2);
		pg.setIndex((2-1)*2);
		
		List<User> list = ss.getMapper(UserMapper.class).getlistfy(pg);
		for (User user : list) {
			logger.debug("��ҳ��ѯ����========>��"+user.toString());
		}
		MyBatisSession.getMyBatisSession().Sessioncolse(ss);
	}
}
