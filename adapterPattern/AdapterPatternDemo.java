package example.designPatterns.adapterPattern;


public class AdapterPatternDemo {
	public static void main(String[] args) {
		// Create a MusicPlayer
		MusicPlayer mMusicPlayer = new MusicPlayer();
		
		mMusicPlayer.play("La La Land", "mp3");
		
		// This would print "Invalid File Format" if adaptor is not being used.
		mMusicPlayer.play("Monster", "mp4");
		
		// MusicPlayer only supports MP3 file format.
		// How can we make it support other file formats such as MP4? 
		// Solution one: let MusicPlayer implement AdvancedMediaPlayer interface,
		// so our MusicPlayer will have playMP4 method.
		// Solution two: create an adapter, so we can keep play method,
		// and still can play file with MP4 format.
		mMusicPlayer.play("New Divide", "mp4");
	}
}
