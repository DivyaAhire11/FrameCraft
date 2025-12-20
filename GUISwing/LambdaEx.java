package GUISwing;
 //LAMBDA EXPRESSION :     
      //lambda i think of lambo short for Lambordhini for some reason
      // future for Java 8 and above
      //also known as an anonymous method 
      // a shorter way to write anonymous classes with only one method
      //need to use a functional interface or use a pre-defined functional interface
      //functional interface they contain only one abstrct method
      //eg: ActionListener,Runnable,(user-defined)
      
      //a Lambda expression can be used in any place where a functional interface
      //How to use lambda expression:: -> lambda operator
      //    (argument) -> (statement/s) 
 
   /**
    * when we used () -> { s.o.p(''); };   then we use semicolon to s.o.p and outer
    * 
    * button.addActionListener(
            (e) -> System.out.println("You Click Button")  //here we not used semicolon
         );  
    *  */      
class LambdaExpression {
    public static void main(String[] args) {
      //    MyInterface ob = (x,y) -> {
      //       System.out.println("Hello "+x+y);
      //       System.out.println("Good Day"); 
      //   };

      //   MyInterface ob2 = (a,b) ->{
      //      System.out.println("Thank You "+a+b);  
      //   };
        MyInterface ob2 = (a,b) -> System.out.println("Thank You "+a+b);
        ob2.message("Ritu",'!');

      //    ob.message("Ritu",'!');
      //    ob2.message("Divya", '!');
      //   }

        LambdaEx2 lEx2 = new LambdaEx2();
}
}