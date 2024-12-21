import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("Storm bringer", "Deep Purple");
        album.addSong("Storm bringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);

        albums.add(album);
        Album album1 = new Album("For those about to rock", "AC/DC");
        album1.addSong("For those about to rock", 5.44);
        album1.addSong("I put the finger on you", 3.25);
        album1.addSong("Lets go", 3.45);
        album1.addSong("Inject the venom", 3.33);
        album1.addSong("Snowballed", 4.51);
        album1.addSong("Evil walks", 3.45);
        album1.addSong("C.O.D.", 5.25);
        album1.addSong("Breaking the rules", 5.32);
        album1.addSong("Night of the long knives", 5.12);

        albums.add(album1);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);
        System.out.println(playList);// There is no track 24
    }






}