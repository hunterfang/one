package text;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * �򵥵�camel����
 * ��asd�ļ����µ������ļ����Ƶ�rsd�ļ�����
 * @author Administrator
 *
 */
public class camelTest {

	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext(); 
		context.addRoutes(new RouteBuilder() {  
		        public void configure() {  
		        from("file:E:/asd/?delay=30000").to("file:E:/rds"); 
		        //delay=30000��ÿ��30����ѯһ���ļ������Ƿ����ļ�.�����ļ�����¸���
		        }  
		        });
		        context.start();  
		        boolean loop =true;  
		        while(loop){  
		            Thread.sleep(25000);  
		        }          
		        context.stop();  
		        }  
}
