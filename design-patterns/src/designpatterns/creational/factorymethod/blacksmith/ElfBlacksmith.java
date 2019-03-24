package designpatterns.creational.factorymethod.blacksmith;

public class ElfBlacksmith implements Blacksmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
	    return new ElfWeapon(weaponType);
	}

}
