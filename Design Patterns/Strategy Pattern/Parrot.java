public class Parrot {
    private SpeakingBehavior speakingBehavior;

    // Constructor to set initial behavior
    public Parrot(SpeakingBehavior speakingBehavior) {
        this.speakingBehavior = speakingBehavior;
    }

    // Change speaking behavior at runtime
    public void setSpeakingBehavior(SpeakingBehavior speakingBehavior) {
        this.speakingBehavior = speakingBehavior;
    }

    // Parrot speaks using the current behavior
    public void speak(String phrase) {
        System.out.println(speakingBehavior.speak(phrase));
    }
}
