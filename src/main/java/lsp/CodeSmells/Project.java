package lsp.CodeSmells;

import java.io.IOException;
import java.util.List;

public class Project {
    private List<Document> allDocuments;

    public Project(List<Document> allDocuments) {
        this.allDocuments = allDocuments;
    }

    void openAll() throws IOException {
        for (Document document : allDocuments) {
            document.open();
        }
    }

    void saveAll (){
        /* Метод сохранения в подклассе ReadOnlyDocuments выбросит исключение, если кто-то попытается вызвать его метод
сохранения. Базовый метод не имеет такого ограничения.
Из-за этого клиентский код вынужден проверять тип документа при сохранении всех документов.
При этом нарушается ещё и принцип открытости/закрытости, так как клиентский код начинает
зависеть от конкретного класса, который нельзя заменить на другой, не внося изменений в клиентский код. */
        for (Document document : allDocuments) {
            if(!(document instanceof ReadOnlyDocument)){
                document.save();
            }
        }
    }
}
