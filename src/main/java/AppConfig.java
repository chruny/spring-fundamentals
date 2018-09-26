import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.repository.ICustomerRepository;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("application.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    /*@Bean(name="customerService")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public CustomerService getCustomerService(){
        //CustomerServiceImpl service= new CustomerServiceImpl(getCustomerRepository());
        CustomerServiceImpl service= new CustomerServiceImpl();
        //service.setCustomerRepository(getCustomerRepository());
        return service;
    }

    @Bean(name="customerRepository")
    public ICustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }*/
}
