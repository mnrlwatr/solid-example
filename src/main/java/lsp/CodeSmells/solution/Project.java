package lsp.CodeSmells.solution;

import java.io.IOException;
import java.util.List;

public class Project {

    List<Document> allDocuments;
    List<WritableDocument> writableDocuments;

    void openAll() throws IOException {
        for (Document document : allDocuments) {
            document.open();
        }
    }

    void saveAll (){
        for (WritableDocument document : writableDocuments) {
            document.save();
        }
    }
}
