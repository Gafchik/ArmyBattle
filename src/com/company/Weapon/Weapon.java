package com.company.Weapon;

import com.company.Weapon.Type.HandType.HandWeaponType;
import com.company.Weapon.Type.Type;

public abstract class Weapon {
    public Type type;
public Integer damage;
public Integer range;
    public Weapon(Type type) {
        this.type = type;
        this.damage = type.damage;
        this.range = type.range;
    }

}
