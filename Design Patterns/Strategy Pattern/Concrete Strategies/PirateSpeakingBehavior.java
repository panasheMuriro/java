// A pirate parrot that adds "Arrr!" at the end
public class PirateSpeakingBehavior implements SpeakingBehavior {
    @Override
    public String speak(String phrase) {
        return phrase + " Arrr!";
    }
}