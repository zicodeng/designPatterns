package example.designPatterns.adapterPattern;

public class MusicPlayer implements MediaPlayer {
	// m means this is a member instance of MediaAdapter class.
	MediaAdapter mMediaAdapter;
	
	public MusicPlayer() {
		// Empty constructor.
	}

	@Override
	public void play(String fileName, String fileFormat) {
		if(fileFormat.equalsIgnoreCase("mp3")) {
			System.out.println("File Name: " + fileName + " - File Format: MP3");
			
		} else if(fileFormat.equalsIgnoreCase("mp4")) {
			// MediaAdapter is providing support for MP4 file format.
			mMediaAdapter = new MediaAdapter(fileFormat);
			mMediaAdapter.play(fileName, fileFormat);
		} else {
			System.out.println("Invalid File Format.");
		}
	}
}
