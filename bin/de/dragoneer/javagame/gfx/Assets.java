package de.dragoneer.javagame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage player, dirt, grass, stone, water, campfire, flowers, rock, wall;
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tiles1.png"));
		
		player = sheet.crop(0, 0, width, height);
		dirt = sheet.crop(width, 0, width, height);
		grass = sheet.crop(width * 2, 0, width, height);
		stone = sheet.crop(width * 3, 0, width, height);
		water = sheet.crop(width * 4, 0, width, height);
		campfire = sheet.crop(width * 5, 0, width, height);
		flowers = sheet.crop(width * 6, 0, width, height);
		rock = sheet.crop(width * 7, 0, width, height);
		wall = sheet.crop(0, height, width, height);
	}

}
