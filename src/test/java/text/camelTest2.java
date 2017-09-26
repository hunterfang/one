/*package text;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
*//**
 * camel用例，将文件内容发送到activemq中
 * @author Administrator
 *
 *//*
public class camelTest2 {
	
	   //加载ActiveMQ基本信息配置
       private static String user = ActiveMQConnection.DEFAULT_USER;
       private static String password = ActiveMQConnection.DEFAULT_PASSWORD;
       private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
       
       public static void main(String[] args) throws Exception {
		   //上下文
    	   CamelContext context = new DefaultCamelContext();
    	   
    	   //工厂对象
    	   ConnectionFactory connectionFactory = 
    			   new ActiveMQConnectionFactory(user, password, url);
    	   
    	   //将工厂对象加入上下文环境中
    	   context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
    	   System.out.println( url+"--"+user+"--"+password);
    	   
    	   //添加路由
    	   context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				from("file:E:/rds").to("jms:queue:TOOL.DEFAULT");
				System.out.println("发送成功！");
			}
		});
    	   
    	   //启动
    	   context.start();
    	   boolean leng = true;
    	   while(leng){
    		   Thread.sleep(25000);
    	   }
    	   
    	   context.stop();
    	   
	}
       
}
*/