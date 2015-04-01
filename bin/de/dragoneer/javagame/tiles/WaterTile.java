package de.dragoneer.javagame.tiles;

import de.dragoneer.javagame.gfx.Assets;

public class WaterTile extends Tile{

	public WaterTile(int id) {
		super(Assets.water, id);
	}

	@Override
	public boolean isSolid(){
		return true;
	}
	
}
