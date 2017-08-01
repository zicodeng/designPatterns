package example.designPatterns.adapterPattern;

public class MP4Player implements AdvancedMediaPlayer {
	
	public MP4Player() {
		// Empty constructor.
	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("File Name: " + fileName + " - File Format: MP4");
	}
}
