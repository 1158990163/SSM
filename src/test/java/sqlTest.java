import com.lty.pojo.Category;
import com.lty.service.CategoryService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import java.util.Iterator;

public class sqlTest {

    CategoryService categoryService = new ClassPathXmlApplicationContext("applicationContext.xml").getBean("categoryServiceImpl", CategoryService.class);


    @Test
    public void test(){
        Iterator<Category> iterator = categoryService.getAllCategory().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test1(){
        ModelAndView modelAndView = new ModelAndView();
        Iterator<Category> iterator = categoryService.getAllCategory().iterator();
        while (iterator.hasNext()){
            modelAndView.addObject(iterator.next());
        }
        System.out.println(modelAndView.toString());

    }
}
