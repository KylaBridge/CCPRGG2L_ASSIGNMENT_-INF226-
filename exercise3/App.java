public class App {
    public static void main(String[] args) {

        //KNIGHT
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();



        //MAGE
        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();


        //THIEF
        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();



        //weapon

        Weapon staff = new Weapon();
        staff.name = "SizzlingStaff";
        staff.rarity= "Level SS";
        staff.damage = 30;

        staff.addDamage(10);
        staff.addDamage(10);
        System.out.println(staff.weaponName());

        //newcharacter

        Character reaper = new Character();
        reaper.strength = 0;
        reaper.agility = 10;
        reaper.intelligence = 8;
        reaper.name = "AceVladimir";
        reaper.sayMyName();
        reaper.attack();
        reaper.sayMyStrength();
    }
}
