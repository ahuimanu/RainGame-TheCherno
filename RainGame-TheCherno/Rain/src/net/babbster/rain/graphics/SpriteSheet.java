package net.babbster.rain.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	
	private String path;
	public final int SIZE;
	public int[] pixels;
	
	public SpriteSheet(String path, int size){
		
		this.path = path;
		this.SIZE = size;
		pixels = new int[SIZE * SIZE];
		
	}
	
	private void loadSpriteSheetImage(){
		
		try{
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		}catch(IOException exp){
			exp.printStackTrace();
		}
		
	}

}
