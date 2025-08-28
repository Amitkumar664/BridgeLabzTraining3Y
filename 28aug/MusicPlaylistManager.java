import java.util.*;

public class MusicPlaylistManager {
    public static void main(String[] args) {
        // Playlist
        String[] songs = {"Song1", "Song2", "Song3"};

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            
            System.out.println("Music Playlist Manager");
            System.out.println("1. Play all songs");
            System.out.println("2. Play a song by index");
            System.out.println("3. Search for a song by name");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Playing all songs:");
                    for (String song : songs) {
                        System.out.println("play" + song);
                    }
                    break;

                case 2:
                    System.out.print("Enter song index (0 - " + (songs.length - 1) + "): ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < songs.length) {
                        System.out.println("Playing:  " + songs[index]);
                    } else {
                        System.out.println(" Invalid index.");
                    }
                    break;

                case 3:
                    System.out.print("Enter song name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equalsIgnoreCase(search)) {
                            System.out.println("Found and Playing: " + song);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(" Song not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }  
        sc.close();  
    }    

}