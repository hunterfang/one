package mybatisutil;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Session会话工厂
 * @author: 方辉
 *
 * 2017-5-31下午4:06:24
 */
public class MyBatisSession {
	   //输入流
       private static InputStream is=null;
       //SqlSessionFactory实例
       private static SqlSessionFactory factory=null;
       //SqlSession会话
       private static MyBatisSession myBatisSession=null;
       
       //静态块，预加载
       static{
    	   try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
       }

       //静态方法，返回实例（单例模式）
	   public static MyBatisSession getMyBatisSession() {
		     if(myBatisSession==null){
		    	 myBatisSession = new MyBatisSession();
		     }
		     return myBatisSession;
	   }
	   
	   //获得回话方法(非静态的)
	   public SqlSession getSession(){
		   return factory.openSession();
	   }
	   
	   //关闭会话
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
