module Provider {
    requires ServiceInterface;
    exports javax0.serviceprovider;
    provides javax0.serviceinterface.ServiceInterface with javax0.serviceprovider.Provider;
}