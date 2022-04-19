package isp.lab5.exercise3;

interface Shape {
    /**
     * Draw a specific shape
     */
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("A rectangle is drawn");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("A square is drawn");
    }
}


class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("A rounded rectangle is drawn");
    }
}

class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("A rounded square is drawn");
    }
}

abstract class AbstractShapeFactory {
    /**
     * Get specific shape by type
     * @param type - one of the values ("rectangle", "roundedRectangle", "square", "roundedSquare")
     * @return instance of shape by desired type
     */
    abstract Shape getShape(String type);
}

class ShapeFactory extends AbstractShapeFactory {
    @Override
    Shape getShape(String type) {
        if ("rectangle".equals(type)) {
            return new Rectangle();
        }
        if ("square".equals(type)) {
            return new Square();
        }
        return null;
    }
}

class RoundedShapeFactory extends AbstractShapeFactory {
    @Override
    Shape getShape(String type) {
        if ("roundedRectangle".equals(type)) {
            return new RoundedRectangle();
        }
        if ("roundedSquare".equals(type)) {
            return new RoundedSquare();
        }
        return null;
    }
}

class ShapeFactoryProvider {
    private ShapeFactoryProvider() {
    }

    /**
     * Get an instance of {@link AbstractShapeFactory} based on <param>type</param>
     * @param type - one of the values "normal" / "rounded"
     * @return instance of type {@link AbstractShapeFactory}
     */
    public static AbstractShapeFactory getShapeFactory(String type) {
        if ("normal".equals(type)) {
            return new ShapeFactory();
        }

        if ("rounded".equals(type)) {
            return new RoundedShapeFactory();
        }

        return null;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        AbstractShapeFactory roundedShapeFactory = ShapeFactoryProvider.getShapeFactory("rounded");
        AbstractShapeFactory roundedShapeFactory1 = ShapeFactoryProvider.getShapeFactory("rounded");
        
        AbstractShapeFactory normalShapeFactory = ShapeFactoryProvider.getShapeFactory("normal");
        AbstractShapeFactory normalShapeFactory1 = ShapeFactoryProvider.getShapeFactory("normal");
        // create instances
        Shape rectangle = roundedShapeFactory.getShape("roundedRectangle");
        Shape rectangle2 = roundedShapeFactory.getShape("roundedSquare");
        Shape shape = normalShapeFactory.getShape("rectangle");
        Shape shape1 = normalShapeFactory1.getShape("square");
        
        rectangle.draw();
        shape.draw();
        shape1.draw();
        rectangle2.draw();
    }
}