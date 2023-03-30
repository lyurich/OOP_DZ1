package DZ1;

public abstract class FamilyTree {

    String type;
    String name;
    Integer age;
    Integer height;

    public FamilyTree(String type, String name, Integer age, Integer height) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.height = height;
    }

//    @Override
    public String display() {
        return "Семья {" +
                "статус ='" + type + '\'' +
                ", имя ='" + name + '\'' +
                ", возраст =" + age +
                ", рост =" + height +
                '}';
    }

    public abstract void say();
}
