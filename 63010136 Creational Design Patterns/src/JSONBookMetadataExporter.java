
public class JSONBookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter make() {
        try {
            return new JSONBookMetadataFormatter();
        } catch (Exception e) {
            return null;
        }
    }
}
