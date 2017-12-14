package javax0.serviceprovider;

import javax0.serviceinterface.ServiceInterface;

public class Provider implements ServiceInterface {
    @Override
    public int theAnswer() {
        return 42;
    }
}
