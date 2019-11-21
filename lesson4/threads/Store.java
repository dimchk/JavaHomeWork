package lesson4.threads;

public class Store {

    private int resource;

    volatile boolean isEmpty = true;

    public  int getResource() {
        isEmpty = true;
        System.out.println("Get resource - " + resource);
        return resource;
    }

    public  void putResource(int resource) {
        isEmpty = false;
        System.out.println("Put resource - " + resource);
        this.resource = resource;
    }

}
