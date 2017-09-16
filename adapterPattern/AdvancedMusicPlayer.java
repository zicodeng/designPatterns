package designPatterns.adapterPattern;

public class AdvancedMusicPlayer implements AdvancedMediaPlayer {
	
	public AdvancedMusicPlayer() {
		// Empty constructor.
	}
	
	@Override
	public void playMP4(String fileName) {
		System.out.println("File Name: " + fileName + " - File Format: MP4");
		
	}

	@Override
	public void playMP5(String fileName) {
		System.out.println("File Name: " + fileName + " - File Format: MP5");
	}
}
