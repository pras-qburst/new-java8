package services;
public enum ServicesInstances {
    CATEGORY_SERVICE(new CategoryService());
    
    private Object service;
    
    private ServicesInstances(Object service) {
        this.service = service;
    }
    
    public Object getService() {
        return this.service;
    }
    
}