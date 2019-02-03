package edu.fsu.cs.cen5035;

/**
 * @author: Camill Folsom
 */

public class CrazyRandomSword extends BasicWeapon implements Weapon
{
   /* Get a random number between 4 and 99 */
   private static final int rand = (int)(Math.random() * 99 + 4);

   public CrazyRandomSword()
   {  
      super(rand);
   }

   @Override
   public int hit()
   {  return DAMAGE;}

   @Override
   public int hit(int armor)
   {
      /* Do a randomn amount of damge based of the armor value */
      int damage = DAMAGE - ((int)(Math.random() * (armor/3) + 3));

      if(damage < 0)
         return 0;

      return damage;
   }
}
