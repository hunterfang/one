package mybatisutil;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Session�Ự����
 * @author: ����
 *
 * 2017-5-31����4:06:24
 */
public class MyBatisSession {
	   //������
       private static InputStream is=null;
       //SqlSessionFactoryʵ��
       private static SqlSessionFactory factory=null;
       //SqlSession�Ự
       private static MyBatisSession myBatisSession=null;
       
       //��̬�飬Ԥ����
       static{
    	   try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
       }

       //��̬����������ʵ��������ģʽ��
	   public static MyBatisSession getMyBatisSession() {
		     if(myBatisSession==null){
		    	 myBatisSession = new MyBatisSession();
		     }
		     return myBatisSession;
	   }
	   
	   //��ûػ�����(�Ǿ�̬��)
	   public SqlSession getSession(){
		   return factory.openSession();
	   }
	   
	   //�رջỰ
	   public void Sessioncolse(SqlSession session){
		   if(session!=null){
			   session.close();
		   }
		   if(is!=null){
			  try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		   }
	   }
       
}
