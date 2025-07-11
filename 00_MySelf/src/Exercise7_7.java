//class Parent{
//    int x = 100;
//
//    Parent(){
//        this(200);
//        System.out.println("Parent()");
//    }
//
//    Parent(int x){
//        System.out.println("Parent(int x)" + x);
//        this.x = x;
//    }
//
//    int getX(){
//        System.out.println("getX()" + x);
//        return x;
//    }
//}
//
//class Child extends Parent{
//    int x = 3000;
//
//    Child(){
//        this(1000);
//        System.out.println("Child()" + x);
//    }
//
//    Child(int x){
//        System.out.println("Child(int x)" + x);
//        this.x = x;
//    }
//}
//
//public class Exercise7_7 {
//    public static void main(String[] args) {
//        Child c = new Child();
//        System.out.println("x=" + c.getX());
//    }
//
//}
