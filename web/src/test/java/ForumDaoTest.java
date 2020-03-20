

import com.Spring_Study.web.dao.ForumDao;
import com.Spring_Study.web.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ForumDaoTest {

    @Autowired
    private ForumDao forumDao;

    @Test
    public void selectAll() {
        List<Forum> forumList = forumDao.selectAll();
        forumList.forEach(System.out::println);
    }

    @Test
    public void get(){
       Forum forum =  forumDao.get(8);
        System.out.println(forum);
    }
}