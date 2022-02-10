public class Snail extends Pet {
    
    public Snail(){
        super(Snail,3,8);
    }

    public void battle(){
        int damage = opponent.calculateDamage(this);
        this.changeHP(-damage);
        changeHp(2);
    }





}
