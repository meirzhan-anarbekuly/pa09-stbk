public class Main {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = {
            new Circle(5),
            new Rectangle(1000, 10),
            new Rectangle(3, 6),
            new Circle(8),
            new Circle(80),
            new Circle(6),
            new Rectangle(1, 10),
            new Rectangle(10, 10)
        };

        Double[] doubles = {4.0, 3.0, 21.0, 5.0, 6.0, 23.0, 44.0, -123.0};
        Integer[] ints = {1, 2, 76, 1, -4, 123, 11, -100};

        printArray(geometricObjects, "before sort");
        sortGeneric(geometricObjects);
        printArray(geometricObjects, "\nafter sort");

        printArray(doubles, "\ndoubles before");
        sortGeneric(doubles);
        printArray(doubles, "\ndoubles after");
        
        printArray(ints, "\nints before");
        sortGeneric(ints);
        printArray(ints, "\nints after");
    }

    public static <T> void printArray(T[] array, String msg) {
        System.out.println(msg);
        for (T element: array) {
            System.out.println(element.toString());
        }
    }

    public static void sort(GeometricObject[] objects) {
        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects.length - 1; j++) {
                // System.out.println(String.format("comparing %s and %s", objects[j].toString(), objects[j+1].toString()));
                if (objects[j].compareTo(objects[j + 1]) > 0) {
                    GeometricObject temp = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sortGeneric(T[] objects) {
        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects.length - 1; j++) {
                if (objects[j].compareTo(objects[j + 1]) > 0) {
                    T temp = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = temp;
                }
            }
        }
    }
}