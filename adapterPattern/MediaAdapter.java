package example.designPatterns.adapterPattern;

public class MediaAdapter implements MediaPlayer {
	
	// AdvancedMediaPlayer is an interface.
	// We cannot instantiate an interface directly,
	// but we can instantiate a class that implements that interface.
	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String fileFormat) {
		if(fileFormat.equalsIgnoreCase("mp4")) {
			// This is valid because MP4Player implements AdvancedMediaPlayer interface.
			advancedMusicPlayer = new MP4Player();
		}
	}

	@Override
	public void play(String fileName, String fileFormat) {
		if(fileFormat.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMP4(fileName);
		}
	}
}
