import javax.sound.midi.*;

public class MiniMusicPlayer1 {

    public static void main(String[] args) {

        try {
            Sequencer sequencer = MidiSystem.getSequencer(); //создаем синтезатор
            sequencer.open(); //открываем синтезатор

            Sequence seq = new Sequence(Sequence.PPQ, 4);//создаем последоваетльность
            Track track = seq.createTrack();//создаем дорожку
            //создаем группу событий, чтобы ноты продолжали подниматься (от фортепиано 5 до ноты 61)
            for (int i = 5; i < 73; i += 4) {

                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));

            }//Конец цикла

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception ex) {ex.printStackTrace();}
    }//Закрывеам main

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e){}
        return event;
    }
}
