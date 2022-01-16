package com.company.Weapon.Type;

import com.company.Weapon.Projectile.Projectile;
import com.company.Weapon.Type.HandType.HandWeaponType;

public class RangeTypeWeapon extends Type {
    public Projectile projectile;

    public RangeTypeWeapon(HandWeaponType handWeaponType, Integer range, Projectile projectile) {
        super(handWeaponType, range, projectile.damage);
        this.projectile = projectile;
    }
}
