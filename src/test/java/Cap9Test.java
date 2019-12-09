import com.enjoy.cap9.config.Cap9MainConfig;
import com.enjoy.cap9.dao.TestDao;
import com.enjoy.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap9Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
        TestService testService = app.getBean(TestService.class);
        testService.println();
        //ֱ�Ӵ������л�ȡTestDao, ��ʹ��Autowiredע����ȡ�Ƚ�
//        TestDao testDao = app.getBean(TestDao.class);
//        System.out.println(testDao);
        app.close();
    }
}
