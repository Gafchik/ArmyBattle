package com.company.Weapon.Type;

import com.company.Weapon.Attackeble;
import com.company.Weapon.Type.HandType.HandWeaponType;

public class MediumTypeWeapon extends Type implements Attackeble {
    public MediumTypeWeapon(HandWeaponType handWeaponType, Integer range,Integer damage) {
        super(handWeaponType, range,damage);
    }

    @Override
    public Integer toDamage() {
        return this.damage;
    }
}
