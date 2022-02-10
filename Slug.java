public class Slug extends Pet{
    public Slug(){
        super("Slug", 3, 8);
    }

    public void battle(Pet opponent){
        int damage = opponent.calculateDamage(this);
        this.changeHP(-damage);
    }
}
