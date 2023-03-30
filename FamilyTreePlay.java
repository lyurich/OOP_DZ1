package DZ1;

public class FamilyTreePlay {
    public static void main(String[] args) {
        Father father = new Father("Отец", "Александр", 50, 180);
        father.say();
        Son son = new Son("Сын", "Вася", 15, 156);
        son.say();
        
    }
}
