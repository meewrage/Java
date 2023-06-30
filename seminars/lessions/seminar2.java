package seminars.lessions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

import javax.sound.midi.Sequencer.SyncMode;
import javax.sound.sampled.SourceDataLine;

// public class seminar2 {
//     public static void main(String[] args) throws IOException {
//         Logger logger1 = Logger.getAnonymousLogger(null);
//         FileWriter fileWriter = new FileWriter("test.txt"); //создание текстовго файла
//         String happy = "Всем привет!";
//         logger1.info(happy);
//         fileWriter.write(happy);
//         fileWriter.close();
//     }
// }
public class seminar2 {
    public static void main(String[] args) throws IOException {
        System.out.println(createNewString(8));

    } 
    public static String createNewString(int len) {
        StringBuilder str = new StringBuilder();
        String c1 = "C1";
        String c2 = "C2";
        for (int i = 0; i < len; i++) {
            str.append(c1).append(c2);
        }
        return str.toString();
    }
}