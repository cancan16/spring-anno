import com.enjoy.cap9.config.Cap9MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap9Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
//        TestService testService = app.getBean(TestService.class);
//        testService.println();

//        Moon moon = app.getBean(Moon.class);
//        System.out.println(moon);
//        Sun sun = app.getBean(Sun.class);
//        System.out.println(sun.getMoon());
        app.close();
    }
}
