import com.enjoy.cap7.config.Cap7MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class Cap7Test {

    @Test
    @Autowired
    public void test01() {
        new ArrayList().add(1);
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap7MainConfigOfLifeCycle.class);
        Object cap7MainConfigOfLifeCycle = app.getBean("cap7MainConfigOfLifeCycle");
        System.out.println(cap7MainConfigOfLifeCycle);
        System.out.println("IOC容器创建完成........");
        app.close();


    }
}
