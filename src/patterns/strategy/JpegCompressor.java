package patterns.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String filename) {
        System.out.println("compressing using JPEG");
    }
}
