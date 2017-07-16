package customEvents;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Lenovo-1 on 05-07-2017.
 */
public class EmailEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public EmailEvent(Object source) {
        super(source);
    }
}
