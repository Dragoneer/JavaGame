package de.dragoneer.javagame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile[256];
	public static Tile grassTile = new GrassTile(0);
	public static Tile dirtTile = new DirtTile(1);
	public static Tile stoneTile = new StoneTile(2);	
	public static Tile rockTile = new RockTile(3);
	public static Tile waterTile = new WaterTile(4);
	public static Tile flowersTile = new FlowersTile(5);
	public static Tile campfireTile = new CampfireTile(6);
	public static Tile wallTile = new WallTile(7);
	
	
	//CLASS

	public static final int TILEWIDTH = 32;
	public static final int TILEHEIGHT = 32;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid(){
		return false;
	}
	
	public int getId(){
		return id;
	}
	
}
