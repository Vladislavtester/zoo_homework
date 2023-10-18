package src.aviary;

public enum EnumAviarySize {
    LARGE(100),
    MEDIUM(25),
    SMALL(10);
    private final Integer size;
    EnumAviarySize(Integer size ){
        this.size=size;
    }
    public Integer getSize() {
        return size;
    }
}
