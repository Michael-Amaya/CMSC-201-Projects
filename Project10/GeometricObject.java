/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Create a triangle and get data from it using an abstract class
 * Due: 04/19/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/
import java.util.Scanner;

abstract class  GeometricObject {
private  String  color = "white";
private  boolean  filled;
private  java.util.Date dateCreated;

/** Construct  a default  geometric object  */
protected GeometricObject() {
}

/** Construct  a geometric object  with color and filled value  */
protected GeometricObject(String  color, boolean  filled) {
dateCreated = new java.util.Date();
this.color = color;
this.filled = filled;
}

/** Return color */
public String  getColor() {
return color;
}

/** Set a new color */
public void setColor(String  color) {
this.color = color;
}

/** Return filled. Since filled is boolean ,
 the get method  is named  isFilled */
public boolean  isFilled() {
return filled;
}

/** Set a new filled */
public void setFilled(boolean  filled) {
this.filled = filled;
}

/** Get dateCreated */
public java.util.Date getDateCreated() {
return dateCreated;
}

@Override
public String  toString() {
return "created on " + dateCreated + "\ncolor: " + color +
" and filled: " + filled;
}

/** Abstract method  getArea */
public abstract double  getArea();

/** Abstract method  getPerimeter */
public abstract double  getPerimeter();
}