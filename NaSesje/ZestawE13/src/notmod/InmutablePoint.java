package notmod;

import java.util.Objects;

public final class InmutablePoint {
    private int x;
    private int y;
    private int z;

    public InmutablePoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y + ", z: " + z;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InmutablePoint that = (InmutablePoint) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
