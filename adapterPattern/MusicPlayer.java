package designPatterns.adapterPattern;

public class MusicPlayer implements MediaPlayer {
	// m means this is a member instance of MediaAdapter class.
	private MediaAdapter mMediaAdapter;
	
	public MusicPlayer() {
		// Empty constructor.
	}

	@Override
	public void play(String fileName, String fileFormat) {
		// If the file format is MP3, it is natively supported by the music player.
		// Therefore, we don't need to use a media adapter.
		if(fileFormat.equalsIgnoreCase("mp3")) {
			System.out.println("File Name: " + fileName + " - File Format: MP3");
			
		} else {
			// If the file format is not MP3,
			// we will need MediaAdapter to provide support for other file formats.
			mMediaAdapter = new MediaAdapter(fileFormat);
			mMediaAdapter.play(fileName, fileFormat);
		}
	}
}
