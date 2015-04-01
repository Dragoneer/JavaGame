package de.dragoneer.javagame.tiles;

import de.dragoneer.javagame.gfx.Assets;

public class CampfireTile extends Tile {

	public CampfireTile(int id) {
		super(Assets.campfire, id);
	}

	@Override
	public boolean isSolid(){
		return true;
	}
	
}
