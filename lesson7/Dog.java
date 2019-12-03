package lesson7;

@JSONSerializible
public class Dog {
    @JSONElement
    private String name;

    @JSONElement(key = "dogAge")
    private int age;

    public Dog(){

    }
    @MethodInv
    private void voice(){
        System.out.println("Buff !");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
