public abstract class GeometricObject implements Comparable<GeometricObject> {
    /** Abstract method getArea */
    public abstract double getArea();
    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
    /** Abstract method toString */
    public abstract String toString();

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
