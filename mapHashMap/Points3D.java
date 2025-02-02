package mapHashMap;

import java.util.Comparator;

public class Points3D implements Comparable<Points3D> {
    private double x, y, z;
    private String color;

    public Points3D(double x, double y, double z, String color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }

    @Override
    public int compareTo(Points3D other) {
        return Comparator.comparingDouble((Points3D p) -> p.x)
                .thenComparingDouble(p -> p.y)
                .thenComparingDouble(p -> p.z)
                .thenComparing(p -> p.color)
                .compare(this, other);
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ", " + color + ")";
    }
}