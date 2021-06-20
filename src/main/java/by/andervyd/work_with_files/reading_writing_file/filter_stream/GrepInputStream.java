package by.andervyd.work_with_files.reading_writing_file.filter_stream;

import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GrepInputStream extends FilterInputStream implements AutoCloseable {
    String substring;
    BufferedReader reader;

    public GrepInputStream(InputStream input, String substring) {
        super(input);
        this.reader = new BufferedReader(new InputStreamReader(input));
        this.substring = substring;
    }

    public final String readLine() throws IOException {
        String line;

        do {
            line = reader.readLine();
        } while ((line != null) && line.indexOf(substring) == -1);

        return line;
    }
}
