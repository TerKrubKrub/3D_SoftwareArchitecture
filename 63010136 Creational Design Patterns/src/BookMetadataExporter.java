
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {
    public abstract BookMetadataFormatter make();
    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see
        // fit.
        BookMetadataFormatter res = make();
        for (Book book : books) {
            res.append(book);
        }
        stream.println(res.getMetadataString());
    }
}
