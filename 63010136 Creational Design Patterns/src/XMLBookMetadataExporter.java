
public class XMLBookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter make() {
        try {
            return new XMLBookMetadataFormatter();
        } catch (Exception e) {
            return null;
        }
    }
}