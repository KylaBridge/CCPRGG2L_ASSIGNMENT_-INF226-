public class Weapon {
    String name, rarity;
    int damage;

    public void addDamage(int additionalDamage) {

        int newDamage = damage + additionalDamage;
        System.out.println("Damage increased from " + "" + damage + " to " + newDamage);

        //assigningNewDamage
        this.damage = newDamage;
    }

    String weaponName(){
        return this.name + " : " + this.rarity;
        
    }

}