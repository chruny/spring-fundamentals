import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args){
        /*
        System.out.println(service.findAll().get(0).getFirstname()+":"+service.findAll().get(0).getLastName());
        System.out.println(service.findAll().get(1).getFirstname()+":"+service.findAll().get(1).getLastName());
        */

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service = applicationContext.getBean("customerService",CustomerService.class);

        System.out.println(service);

        CustomerService service2 = applicationContext.getBean("customerService",CustomerService.class);

        System.out.println(service2);

        System.out.println(service.findAll().get(0).getFirstname()+":"+service.findAll().get(0).getLastName());
        System.out.println(service.findAll().get(1).getFirstname()+":"+service.findAll().get(1).getLastName());
    }
}
