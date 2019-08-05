package test;

import com.test.booleanjava.Application;
import com.test.booleanjava.helloRS.service.IUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class Test {
    @Autowired
    private IUserService userService;
    @org.junit.Test
    public void test(){
        for (int i = 0; i < 15; i++) {
            userService.test();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    @org.junit.Test
    public void test1(){
        userService.get();
    }

}
