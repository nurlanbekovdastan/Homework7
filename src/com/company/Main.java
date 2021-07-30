package com.company;

public class Main {

    public static void main(String[] args) {
	Magic magic = new Magic();


	Madic madic = new Madic();


	Warrior warrior = new Warrior();

	HavingSuperAbility[] havingSuperAbilities = {madic,magic,warrior};
		for (int i = 0; i < havingSuperAbilities.length; i++) {
			havingSuperAbilities[i].applySuperAbility();
		}
    }
}
