package lsp.CodeSmells;

import java.io.File;

public class ExceptionRule implements FileSystem {
    @Override
    public File[] listFiles(String path) {
        return new File[0];
    }

    /*
Метод не должен выбрасывать исключения, которые не
свойственны базовому методу. Типы исключений в переопределённом методе должны совпадать
или быть подтипами исключений, которые выбрасывает базовый метод.
Блоки try-catch в клиентском коде нацелены на конкретные типы исключений, выбрасываемые базовым методом.
Поэтому неожиданное исключение, выброшенное подклассом, может проскочить сквозь обработчики клиентского
кода и обрушить программу.
*/
    @Override
    public void deleteFile(String path) throws NullPointerException {

    }
}
