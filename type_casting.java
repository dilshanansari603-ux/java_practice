public class type_casting {
    //Type casting
    public static void main(String[] args) {
        System.out.println("<---------------------------Type Casting--------------------------------->");
        System.out.println("Implicit Type Casting(wide casting)>>>");
    float f=55.55f;
    double d=f;
    System.out.println(f +"-> float to double>>>");
    System.out.println(d); 

 System.out.println("Explicit Type Casting(Narrow casting)>>>"); 
    long l=(long)f;
    System.out.println(f+"-> float to long>>>");
    System.out.println(l); 
    System.out.println("Advance Type Casting>>> using string: primitive to Non-primitive data type.");  
    int a=2;
    float fl=65.67f;
    String str=String.valueOf(a);
    String str1=String.valueOf(fl);
     
    System.out.println(a+a);
    System.out.println(str +str); 

    System.out.println(fl+fl);
    System.out.println(str1+str1);
    System.out.println("Advance Type Casting>>> using string: Non-primitive to primitive data type.");
String s="45.56";
// int num=Integer.parseInt(s);
float fnum=Float.parseFloat(s);
// System.out.println(num+num);

System.out.println(fnum+fnum);
}

}
