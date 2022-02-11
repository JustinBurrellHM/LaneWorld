public class Snail extends Pet {
    
    public Snail(){
        super("Snail",3,8);
    }

    public void battle(Pet opponent){
        super.battle(opponent);
        changeHP(2);
    }

}
