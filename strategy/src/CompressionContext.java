/**
 * Created by Bram on 20-2-2017.
 * This class 'CompressionContext' provide a way for the client to compress different files through the strategy pattern.
 * Context can be anything in the real world.
 */
public class CompressionContext {
    private CompressionStrategy compressionStrategy;

    // This can be set at runtime by the application
    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    // Use the strategy
    public void executeCompression() {
        compressionStrategy.compressFile();
    }
}
