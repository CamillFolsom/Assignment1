package edu.fsu.cs.cen5035;

class HarbingerSword extends BasicWeapon implements Weapon
{
   public HarbingerSword()
   {  super(1000);}

   @Override
   public int hit()
   {  return DAMAGE;}

   @Override
   public int hit(int armor)
   {
      /* Ignores 90% of the armor */
      int damage = DAMAGE - (int)(armor*0.1);

      if(damage < 0)
         return 0;

      return damage;
   }
}
