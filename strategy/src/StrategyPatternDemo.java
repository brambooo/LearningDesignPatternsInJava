public class StrategyPatternDemo {

    public static void main(String[] args) {

        CompressionContext compressionContext = new CompressionContext();

        // Set strategy - we could implement a default strategy, but we didn't do that in the context
        compressionContext.setCompressionStrategy(new ZipCompression());   // ZIP compression enabled
        compressionContext.executeCompression();                           // Show executed compression

        // Change compression to RAR  (AT RUNTIME)
        compressionContext.setCompressionStrategy(new RarCompression());    // RAR compression enabled
        compressionContext.executeCompression();                            // Show executed compression
    }
}
