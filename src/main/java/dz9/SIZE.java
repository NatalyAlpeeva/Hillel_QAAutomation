package dz9;

public enum SIZE {
    SMALL("S",5, 10 ), MEDIUM("M",10, 15 ), LARGE("L",15, 20 ), EXTRA_LARGE("EL",20, 25 );
    final String s;
    final int width;
    final int length;

    SIZE(String s, int width, int length) {
        this.s = s;
        this.width = width;
        this.length = length;
    }

    public String getS() {
        return s;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return getS()+" size: width="+getWidth()+", length="+getLength();
    }
}
