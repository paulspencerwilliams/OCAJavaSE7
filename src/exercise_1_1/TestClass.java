package exercise_1_1;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestClass {
    public static void main (String[] args) throws IOException {
        new File("logs").mkdir();
        DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
        Date now = new Date();
        String date = df.format(now);
        String logFileName = "logs/testlog-" + date + ".txt";
        FileHandler myFileHandler = new FileHandler(logFileName);
        Logger ocajLogger = Logger.getLogger("OCAJ Logger");
        ocajLogger.setLevel(Level.ALL);
        ocajLogger.addHandler(myFileHandler);
        ocajLogger.info("\nThis is a logged information message.");
        myFileHandler.close();
    }
}
