package edu.fsu.cs.cen5035;

/**
 * @author: Camill Folsom
 */

public class SimpleHammer extends BasicWeapon implements Weapon
{
   public SimpleHammer()
   {  super(35);}

   @Override
   public int hit()
   {  return DAMAGE;}

   @Override
   public int hit(int armor)
   {
      int damage;

      /* Ignores all armor less than 30 */
      if(armor >= 30)         
         damage = DAMAGE - armor;
      else
         damage = DAMAGE; 

      if(damage < 0)
      {  return 0;}

      return damage;
      
   }
}
