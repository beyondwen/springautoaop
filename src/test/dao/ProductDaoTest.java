package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2016/10/05.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext1.xml")
public class ProductDaoTest {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Autowired
    @Qualifier("productDao")
    private ProductDao productDao;

    @Test
    public void add() throws Exception {
        userDao.add();
        userDao.delete();
        userDao.update();
        productDao.update();
    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}