/*package text;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
*//**
 * camel���������ļ����ݷ��͵�activemq��
 * @author Administrator
 *
 *//*
public class camelTest2 {
	
	   //����ActiveMQ������Ϣ����
       private static String user = ActiveMQConnection.DEFAULT_USER;
       private static String password = ActiveMQConnection.DEFAULT_PASSWORD;
       private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
       
       public static void main(String[] args) throws Exception {
		   //������
    	   CamelContext context = new DefaultCamelContext();
    	   
    	   //��������
    	   ConnectionFactory connectionFactory = 
    			   new ActiveMQConnectionFactory(user, password, url);
    	   
    	   //������������������Ļ�����
    	   context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
    	   System.out.println( url+"--"+user+"--"+password);
    	   
    	   //���·��
    	   context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				from("file:E:/rds").to("jms:queue:TOOL.DEFAULT");
				System.out.println("���ͳɹ���");
			}
		});
    	   
    	   //����
    	   context.start();
    	   boolean leng = true;
    	   while(leng){
    		   Thread.sleep(25000);
    	   }
    	   
    	   context.stop();
    	   
	}
       
}
*/