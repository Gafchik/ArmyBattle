package com.company.Weapon.Type;

import com.company.Weapon.Type.HandType.HandWeaponType;

public abstract class Type {
    public Integer damage;
    public HandWeaponType handWeaponType;
    public Integer range;
    public Type(HandWeaponType handWeaponType,Integer range,Integer damage) {
        this.damage= damage;
        this.handWeaponType = handWeaponType;
        this.range =range;
    }

}
