public class Snail extends Pet {
    
    public Snail(){
        super("Snail",3,8);
    }

    public void battle(Pet opponent){
        int damage = this.calculateDamage(opponent);
        opponent.changeHP(-damage);
        changeHP(2);
    }

}
