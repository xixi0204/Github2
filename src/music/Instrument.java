package music;

public class Instrument {
    void play(Note n){
        System.out.print("Instrument.play()"+n);
    }
    String What() {
        return "Instrument"; }
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
    public String toString(){
        return What();
    }
}


