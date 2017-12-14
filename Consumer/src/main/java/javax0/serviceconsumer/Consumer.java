package javax0.serviceconsumer;

import javax0.serviceinterface.ServiceInterface;

import java.util.ServiceLoader;

public class Consumer {

    public static void main(String[] args) {
        ServiceLoader<ServiceInterface> loader = ServiceLoader.load(ServiceInterface.class);
        for (final ServiceInterface service : loader) {
            System.out.println("The service " + service.getClass().getSimpleName() + " answers " + service.theAnswer());
        }
    }

}
