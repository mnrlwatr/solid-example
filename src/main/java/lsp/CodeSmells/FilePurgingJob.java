package lsp.CodeSmells;

import java.io.IOException;

public class FilePurgingJob {

    private FileSystem fileSystem;

    public FilePurgingJob(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    public void purgeOldestFile(String path) throws IOException {
        // If the client code needs to use instanceof or downcasting,
        // then the chances are that both the Open/Closed Principle and the Liskov Substitution Principle have been violated.
        if (!(fileSystem instanceof ReadOnlyFileSystem)) {
            // code to detect oldest file
            fileSystem.deleteFile(path);
        }
        //Because the FileSystem model is fundamentally incompatible with read-only file systems, the ReadOnlyFileSystem inherits a deleteFile method it can’t support.
        //This example code uses an instanceof check to do special work based on a subtype implementation.
    }
}
