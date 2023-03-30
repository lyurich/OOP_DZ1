package DZ1;

public class Father extends FamilyTree{
    public Father(String type, String name, Integer age, Integer height){
        super(type, name, age, height);
    }

    @Override
    public void say(){
        System.out.println("Привет, я батя!");
    }
}
