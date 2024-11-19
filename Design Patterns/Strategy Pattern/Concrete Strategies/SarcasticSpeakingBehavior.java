// A sarcastic parrot that mimics mockingly
public class SarcasticSpeakingBehavior implements SpeakingBehavior {
    @Override
    public String speak(String phrase) {
        return phrase.toUpperCase() + " (mocking)";
    }
}