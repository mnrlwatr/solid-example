package lsp.CodeSmells.solution;

/*
Проблему можно решить, перепроектировав иерархию
классов. Базовый класс сможет только открывать документы, но не сохранять их.
Подкласс, который теперь будет называться WritableDocument , расширит
 поведение родителя, позволив сохранять документ.
 */
public class Document {
    String data;
    String fileName;

    void open() {}
}


