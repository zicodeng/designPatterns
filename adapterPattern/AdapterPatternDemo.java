package designPatterns.adapterPattern;


public class AdapterPatternDemo {
	public static void main(String[] args) {
		// Create a MusicPlayer
		MusicPlayer mMusicPlayer = new MusicPlayer();
		
		mMusicPlayer.play("La La Land", "mp3");
		
		// This would print "Invalid File Format" if adaptor is not being used.
		mMusicPlayer.play("Monster", "mp4");
		
		// MusicPlayer now only supports MP3 file format.
		// How can we make it support other file formats such as MP4 and MP5?
		
		// Solution one: let MusicPlayer implement AdvancedMediaPlayer interface,
		// so our MusicPlayer will have playMP4 and playMP5 methods.
		
		// Solution two: create an adapter,
		// so that our MusicPlayer class doesn't need to add additional methods,
		// and it still supports MP4 and MP5 format.
		mMusicPlayer.play("New Divide", "mp4");
		mMusicPlayer.play("Hello", "mp5");
		mMusicPlayer.play("If You", "avi");
	}
}
