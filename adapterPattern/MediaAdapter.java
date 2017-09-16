package designPatterns.adapterPattern;

// MediaAdapter class is for creating a media adapter that
// can be used by regular music player to support more advanced file formats.
// The idea behind the media adapter is that it borrows functionalities from
// advanced music player, and use it to support more formats.
public class MediaAdapter implements MediaPlayer {
	
	private AdvancedMusicPlayer mAdvancedMusicPlayer;
	
	public MediaAdapter(String fileFormat) {
		// Validate file format first,
		// because the user might try special formats that are not even
		// supported by advanced music player.
		if(fileFormat.equalsIgnoreCase("mp4") || fileFormat.equalsIgnoreCase("mp5")) {
			mAdvancedMusicPlayer = new AdvancedMusicPlayer();
		} else {
			System.out.println("Invalid format.");
		}
	}

	@Override
	public void play(String fileName, String fileFormat) {
		if(fileFormat.equalsIgnoreCase("mp4")) {
			mAdvancedMusicPlayer.playMP4(fileName);
		} else if(fileFormat.equalsIgnoreCase("mp5")) {
			mAdvancedMusicPlayer.playMP5(fileName);
		}
	}
}
