import customEvents.CustomPublisher;
import customEvents.Email;
import customEvents.EmailEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        context.start();
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        // Let us raise a stop event.
        context.stop();

        CustomPublisher customPublisher=(CustomPublisher) context.getBean("customPublisher");
        Email email=new Email();
        email.setBody("abc");
        email.setFromMail("a@gmail.com");
        email.setSubject("aaa");

        EmailEvent emailEvent=new EmailEvent(email);
        customPublisher.publish(emailEvent);
    }
}
