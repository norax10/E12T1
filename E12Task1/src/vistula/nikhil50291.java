package vistula;


enum shapes
{
    square, rectangle, circle, trapezoid, rhombus, triangle, oval, hexagon
}

public class T1
{
    public static void main(String[] args)
    {
        shapes ob;
        System.out.println("Here is all shapes.");

        shapes allShapes[] = shapes.values();
        for (shapes m : allShapes)
            System.out.println(m);

        ob = shapes.valueOf("trapezoid");
        System.out.println("In this all Shapes, one shapes is: " + ob);

    }

}