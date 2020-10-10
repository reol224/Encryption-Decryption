import java.util.*;

class AsciiCharSequence implements java.lang.CharSequence {
    // implementation
    private byte[] byteSequence;

    public AsciiCharSequence(byte[] bytesSequence) {
        this.byteSequence = bytesSequence;
    }

    @Override
    public int length() {
        return byteSequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteSequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(byteSequence, start, end));
    }

    @Override
    public String toString() {
        return new String(byteSequence);
    }
}