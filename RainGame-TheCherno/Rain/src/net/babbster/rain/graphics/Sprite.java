package net.babbster.rain.graphics;

public class Sprite {
	
	private final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	public Sprite(int size, int x, int y, SpriteSheet sheet)
	{
		this.SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * this.SIZE;
		this.y = y * this.SIZE;
		this.sheet = sheet;
	}
	
	//loop through and copy the pixels from a zone of the sprite sheet
	private void load(){
		for(int y = 0; y < SIZE; y++){
			for(int x = 0; x < SIZE; x++){
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE ];
			}
		}
	}

}
