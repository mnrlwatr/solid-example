package lsp.Postconditions.ex2;

/*
Метод не должен ослаблять пост-условия.
Например, базовый метод требует, чтобы по завершению метода все
подключения к базе данных были закрыты, а подкласс
оставляет эти подключения открытыми, чтобы потом
повторно использовать. Но клиентский код
базового класса ничего об этом не знает. Он может завершить программу
сразу после вызова метода, оставив запущенные
процессы призраки в системе.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    void method(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            //reader.read();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    class ChildMain extends Main {
        BufferedReader reader;
        @Override
        void method(String fileName) {
            try {
                reader = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
