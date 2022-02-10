public class LaneWorldRunner {
    public static void main(String[] args){
        Snail s1 = new Snail(); // Snail should have unique ability 
        Slug s2 = new Slug(); // Slug should have unique ability
        System.out.println(s1);
        System.out.println(s2);
        s1.battle(s2); // Their abilities shoudl activate during battle 
        s2.battle(s1);
        System.out.println(s1);
        System.out.println(s2);
    }
}