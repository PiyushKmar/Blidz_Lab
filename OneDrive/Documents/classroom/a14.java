public class Student {
   String name;
   double marks;

   void result(){
      if(marks>40){
         System.out.println("Pass");
      }
      else{
         System.out.println("fail");
      }
   }

   public static void main(String[] args) {
      Student a=new Student();
      a.name="Piyush";
      a.marks=100;
      System.out.println(a.name+" "+a.marks);
   }


}
