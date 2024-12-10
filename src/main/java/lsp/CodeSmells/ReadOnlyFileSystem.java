package lsp.CodeSmells;

import java.io.File;
import java.io.IOException;

public class ReadOnlyFileSystem implements FileSystem {
    @Override
    public File[] listFiles(String path) {
        // code to list files
        return new File[0];
    }
    @Override
    public void deleteFile(String path) throws IOException {
        // A Subtype Provides No Implementation (do nothing) for a Behavior It Can’t Fulfill
        // or throws an exception for a Behavior It Can’t Fulfill
        // or always Returns the Same Fixed Value (e.g. return 0;)
    }


}
