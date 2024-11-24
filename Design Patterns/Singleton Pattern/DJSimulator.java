public class DJSimulator {
    public static void main(String[] args) {
        System.out.println("Accessing the soundboard for the first time...");
        Soundboard sb1 = Soundboard.getInstance();
        sb1.playSound("Airhorn.mp3");

        System.out.println("\nAccessing the soundboard again...");
        Soundboard sb2 = Soundboard.getInstance();
        sb2.playSound("Crowdcheer.mp3");

        System.out.println("\nAre sb1 and sb2 the same instance?" + (sb1 == sb2));
    }
    
}


// OUTPUT 

// Accessing the soundboard for the first time...
// Initializing Global DJ Soundboard
// Playing sound: Airhorn.mp3

// Accessing the soundboard again...
// Playing sound: Crowdcheer.mp3

// Are sb1 and sb2 the same instance?true
