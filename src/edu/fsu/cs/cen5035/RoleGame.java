package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void testWeapon(Weapon weapon, String type, int armor)
    {
       System.out.println(type + " has " + weapon.hit() + " of damage.");
       System.out.println(type + " was able to do " + weapon.hit(armor) + 
                          " of damage due to an armor with "+armor+ " points.");
    }

    public static void main(String[] args) {

    	int armor = 29;

        Weapon weapon = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + weapon.hit() + " of damage.");        
        System.out.println("Swords was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        weapon = WeaponFactory.getWeapon("spear");
        System.out.println("Spear has " + weapon.hit() + " of damage.");        
        System.out.println("Spear was able to do " + weapon.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //TODO: Add the remainig weapons here
        weapon = WeaponFactory.getWeapon("simpleHammer");
        testWeapon(weapon, "Simple Hammer", armor);
        armor = 30;
        System.out.println("Simple Hammer was able to do " + weapon.hit(armor) 
                         + " of damage due to an armor with "+ armor + 
                           " points.");
    }
}
