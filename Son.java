package DZ1;

public class Son extends FamilyTree{
    public Son (String type, String name, Integer age, Integer height){
        super(type, name, age, height);
    }

    @Override
    public void say(){
        System.out.println("Привет, я сын!");
    }
}
