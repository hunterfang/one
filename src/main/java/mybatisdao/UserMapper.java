package mybatisdao;
import java.util.List;
import mybatisPojo.User;
import mybatisPojo.page;
/**
 * mybatisӳ���ļ��ӿ�
 * @author: ����
 *
 * 2017-5-31����4:39:40
 */
public interface UserMapper {
	  
	  //������
      public int count();
      //��ѯ���ж���
      public List<User> getlist();
      //ɾ������
      public void delete(User us);
      //��������
      public void add(User us);
      //�޸Ķ���
      public void update(User us);
      //��ҳ��ѯ
      public List<User> getlistfy(page pg);
      //��̬��ѯ+ģ����ѯ
      public List<User> getUserdtmh(User us);
}
