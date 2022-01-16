package com.company.Weapon.Projectile;

public abstract class Projectile implements Projectileable {
    public Integer damage;

    @Override
    public Integer toDamage() {
        return damage;
    }

    ;
}
