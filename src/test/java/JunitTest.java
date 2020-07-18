import com.springboot.hellworld.Application;
import com.springboot.hellworld.controller.MyBatisController;
import com.springboot.hellworld.entity.User;
import com.springboot.hellworld.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class JunitTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void test(){
        List<User> users = userMapper.queryUserList();
        System.out.println("junitTest-------->");
        System.out.println(users);
    }
}
