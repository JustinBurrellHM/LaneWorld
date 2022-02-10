import info.gridworld.actor.Actor;

public abstract class pet extends Actor{
    protected String name;
    protected int hp;
    protected int attack;

    public pet(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    abstract void ability();

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
        int damage = opponent.calculateDamage(this);
        this.changeHP(-damage);
    }

    public int calculateDamage(Pet opponent){
        int damage = opponent.calculateDamage(this);
    }
    
}
