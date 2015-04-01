package de.dragoneer.javagame.tiles;

import de.dragoneer.javagame.gfx.Assets;

public class WallTile extends Tile {

	public WallTile(int id) {
		super(Assets.wall, id);
	}

	@Override
	public boolean isSolid(){
		return true;
	}
	
}
