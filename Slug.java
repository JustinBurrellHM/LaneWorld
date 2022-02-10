public class Slug extends Pet{
    public Slug(){
        super("Slug", 3, 8);
    }

    public void battle(Pet opponent){
        int damage = this.calculateDamage(opponent);
        opponent.changeHP(-damage);
    }
}

