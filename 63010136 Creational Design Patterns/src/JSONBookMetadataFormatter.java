import org.json.simple.*;
import java.io.IOException;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONArray json;

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see
        // fit.
        json = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see
        // fit.
        JSONObject book = new JSONObject();
        book.put(Book.Metadata.ISBN.value, b.getISBN());
        book.put(Book.Metadata.TITLE.value, b.getTitle());
        book.put(Book.Metadata.PUBLISHER.value, b.getAuthors());
        JSONArray authors = new JSONArray();
        for (String auth : b.getAuthors()) {
            authors.add(auth);
        }
        book.put(Book.Metadata.AUTHORS.value, authors);
        json.add(book);
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see
        // fit.
        return json.toString();
    }
}
