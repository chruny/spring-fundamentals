import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service =applicationContext.getBean("customerService",CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstname()+":"+service.findAll().get(0).getLastName());
        System.out.println(service.findAll().get(1).getFirstname()+":"+service.findAll().get(1).getLastName());
    }
}
