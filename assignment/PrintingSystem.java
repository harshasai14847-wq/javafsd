class Document {
    void print() {
        System.out.println("Printing a document...");
    }
}
class PDFDocument extends Document {
    @Override
    void print() {t
        System.out.println("Printing PDF document.");
    }
}

class WordDocument extends Document {
    @Override
    void print() {
        System.out.println("Printing Word document.");
    }
}

class ImageDocument extends Document {
    @Override
    void print() {
        System.out.println("Printing Image document.");
    }
}
class PrintingSystem {
    public static void main(String[] args) {
        Document d;

        d = new PDFDocument();
        d.print();

        d = new WordDocument();
        d.print();

        d = new ImageDocument();
        d.print();
    }
}