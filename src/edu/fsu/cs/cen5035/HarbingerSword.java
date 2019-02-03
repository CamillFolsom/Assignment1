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
      /* 10 times random number 1-10 determines how much armor we ignore */
      int damage = DAMAGE - (armor - (10*(int)(Math.random() * 10 + 1)));

      if(damage < 0)
         return 0;

      return damage;
   }
}
