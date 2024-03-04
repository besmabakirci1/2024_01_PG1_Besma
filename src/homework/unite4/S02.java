package homework.unite4;

// (Geometry: great circle distance)
// The great circle distance is the distance between two points on the surface of a sphere.
// Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points.
// The great circle distance between the two points can be computed using the following formula:
// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
// Write a program that prompts the user to enter the latitude and longitude of two points on the earth
// in degrees and displays its great circle distance. The average earth radius is 6,371.01 km.
// Note that you need to convert the degrees into radians using the Math.toRadians method
// since the Java trigonometric methods use radians. The latitude and longitude degrees in the formula are for north and west.
// Use negative to indicate south and east degrees.
// Here is a sample run:
// Enter point 1 (latitude and longitude) in degrees: 39.55, -116.25-> "Enter"
// Enter point 2 (latitude and longitude) in degrees: 41.5, 87.37-> "Enter"
// The distance between the two points is 10691.79183231593 km
public class S02 {
}
