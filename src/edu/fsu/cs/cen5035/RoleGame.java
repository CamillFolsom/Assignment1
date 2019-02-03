package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    /**
     * @name : testWeapon
     * @biref: Used to test the weapon passed in agianst the armor values 0, 29,
     *         and 30. It also prints out the hitpoints of the type of weapon
     *         passed in.
     */
    public static void testWeapon(Weapon weapon, String type)
    {
       int armor[] = {0, 29, 30};

       System.out.println(type + " has " + weapon.hit() + " of damage.");

       System.out.println(type + " was able to do " + weapon.hit(armor[0]) + 
                          " of damage due to an armor with "+armor[0]+ 
                          " points.");

       System.out.println(type + " was able to do " + weapon.hit(armor[1]) +
                          " of damage due to an armor with "+armor[1]+ 
                          " points.");

       System.out.println(type + " was able to do " + weapon.hit(armor[2]) +
                          " of damage due to an armor with "+armor[2]+ 
                          " points.");
    }

    public static void main(String[] args) {

    	int armor = 29;
      String types[] = {"Simple hammer", "Crazy random sword", 
                        "Harbinger sword"};

        Weapon weapon = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + weapon.hit() + " of damage.");        
        System.out.println("Swords was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        weapon = WeaponFactory.getWeapon("spear");
        System.out.println("Spear has " + weapon.hit() + " of damage.");        
        System.out.println("Spear was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //TODO: Add the remainig weapons here
        weapon = WeaponFactory.getWeapon("simpleHammer");
        testWeapon(weapon, types[0]);

        weapon = WeaponFactory.getWeapon("crazyRandomSword");
        testWeapon(weapon, types[1]);

        weapon = WeaponFactory.getWeapon("harbingerSword");
        testWeapon(weapon, types[2]);
    }
}
