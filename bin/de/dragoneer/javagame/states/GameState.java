package de.dragoneer.javagame.states;

import java.awt.Graphics;

import de.dragoneer.javagame.Game;
import de.dragoneer.javagame.entities.creatures.Player;
import de.dragoneer.javagame.worlds.World;

public class GameState extends State {

	private Player player;
	private World world;
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 96, 32);
		world = new World(game, "res/worlds/world1.txt");
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}
	
	
	
}
