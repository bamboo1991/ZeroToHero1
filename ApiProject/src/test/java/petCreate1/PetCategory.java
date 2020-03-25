package petCreate1;

public class PetCategory {
    private String types;
    private int size;
    private String origin;


    public PetCategory(String types, int size, String origin) {
        this.types = types;
        this.size = size;
        this.origin = origin;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
