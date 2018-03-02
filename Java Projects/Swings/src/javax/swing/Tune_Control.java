package javax.swing;
import javax.sound.midi.*;

public class Tune_Control {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Sequencer sequencer=MidiSystem.getSequencer();
			sequencer.open();
			
			Sequence seq=new Sequence(Sequence.PPQ,4);
			Track track=seq.createTrack();
			
			for(int i=0;i<61;i+=4){
				
				track.add(makeEvent(144,1,i,100,i));
				track.add(makeEvent(128,1,i,100,i+2));
				
			}
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			
			sequencer.start();
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

	private static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		// TODO Auto-generated method stub
		MidiEvent event=null;
		try{
			ShortMessage a=new ShortMessage();
			a.setMessage(comd,chan,one,two);
			event=new MidiEvent(a,tick);
		}catch(Exception e){
			return event;
		}
		return null;
	}

}