class Rectangle
{
//Data Member 
int height;
int width;
int area;
//constructor 
//notice here there is no return type and name is same as class name
Rectangle()
 {
  height=15;
  width=25;
  area=height*width;
  System.out.println("Area of Rectangle="+area);
 }
 public static void main(String[] args) 
 {
  //creating object
  //notice here no need to call a constructor
  Rectangle obj=new Rectangle();
 }
}
/*
### Output ###
Area of Rectangle=375
*/