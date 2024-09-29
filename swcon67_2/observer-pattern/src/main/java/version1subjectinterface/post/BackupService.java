package version1subjectinterface.post;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BackupService implements Observer {
    private String directory;
    private String filename;

    public BackupService(String filename, Subject subject) {
        this.filename = filename;
        subject.addObserver(this);
    }

    public BackupService(String directory, String filename, Subject subject) {
       this.directory = directory;
       this.filename = filename;
       subject.addObserver(this);
    }

    @Override
    public void update(String data) {
        // write file
        FileWriter writer = null;

        if (directory != null) {

            filename =  createDirectory() + filename;
        }

        try {
            writer = new FileWriter(filename, true);
            PrintWriter out = new PrintWriter(writer);
            out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    String createDirectory() {
        String path = "data"+File.separator+directory;
        File newDirectory = new File(path);
        if (!newDirectory.exists()) {
           newDirectory.mkdir();
        }

       return path;
    }
}
