public class User {

    private String name;
    private int age;

    private static User instance;

    public static User getInstance(){
        if(instance == null){
            instance = new User();
        }
        return instance;
    }

    private User(){
        name = "Giorgio";
        age = 0;
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

    public String stampaUser(){
        return "Name: " + name + " age: " + age;
    }
}
