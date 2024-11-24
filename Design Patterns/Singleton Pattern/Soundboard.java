public class Soundboard {
    private static Soundboard instance;

    private Soundboard(){
        System.out.println("Initializing Global DJ Soundboard");
    }

    public static Soundboard getInstance(){
        if (instance == null){
            instance = new Soundboard();
        }
        return instance;
    }

    public void playSound(String sound){
        System.out.println("Playing sound: " + sound);
    }
    
}
