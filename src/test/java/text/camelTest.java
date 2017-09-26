package text;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * 简单的camel用例
 * 将asd文件夹下的所有文件复制到rsd文件夹下
 * @author Administrator
 *
 */
public class camelTest {

	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext(); 
		context.addRoutes(new RouteBuilder() {  
		        public void configure() {  
		        from("file:E:/asd/?delay=30000").to("file:E:/rds"); 
		        //delay=30000是每隔30秒轮询一次文件夹中是否有文件.有新文件则更新复制
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
