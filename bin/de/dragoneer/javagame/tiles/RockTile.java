package de.dragoneer.javagame.tiles;

import de.dragoneer.javagame.gfx.Assets;

public class RockTile extends Tile {

	public RockTile(int id) {
		super(Assets.rock, id);
	}
	
	@Override
	public boolean isSolid(){
		return true;
	}

}
