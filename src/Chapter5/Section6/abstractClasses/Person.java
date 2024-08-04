package Chapter5.Section6.abstractClasses;

public abstract class Person {
    public abstract String getDescription();  // 抽象方法

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
