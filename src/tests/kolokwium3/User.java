package tests.kolokwium3;

public class User {
    int id;
    String name;
    int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    User user1 = new User(1, "Kowalski", 18);
    User user2 = new User(2, "Nowak", 20);
    User user3 = new User(3, "Wójcik", 22);
}
