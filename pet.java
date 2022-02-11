import info.gridworld.actor.Actor;

public abstract class Pet extends Actor{
    protected String name;
    protected int hp;
    protected int attack;

    public Pet(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    // public abstract void ability();

    public int getHp(){
        return hp;
    }

    public void changeHP(int change_health){
        hp += change_health;
        hp += def;
    }       
    public int getAttack(){
        return attack;
    }
    public String getName(){
        return name;
    }

    public void changeAttack(int change_attack){
        attack += change_attack;
    }
    
    public void battle(Pet opponent){
        int damage = this.calculateDamage(opponent);
        opponent.changeHP(-damage);
    }

    public int calculateDamage(Pet opponent){
        int damage = opponent.calculateDamage(this);
    }
    
}
