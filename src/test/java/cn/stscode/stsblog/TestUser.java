package cn.stscode.stsblog;

import cn.stscode.stsblog.dao.UserDao;
import cn.stscode.stsblog.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StsblogApplication.class)
public class TestUser {

    @Autowired
    private UserDao userDao;

    @Test
    @Transactional
    @Rollback(value = false)
    public void test_one(){

        /*List<User> users = userDao.findUsers();
        users.iterator().forEachRemaining(data->{
            System.out.println(data);
        });*/
        User user = new User();
        user.setPassword("123");
        user.setUsername("smallthanks");
        userDao.save(user);

    }

    @Test
    public void test_two(){

        Optional<User> byId = userDao.findById(3);
        User user = byId.get();
        System.out.println(user);

    }
}
