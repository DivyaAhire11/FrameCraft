package GUISwing;
 //LAMBDA EXPRESSION :     
      //lambda i think of lambo short for Lambordhini for some reason
      // future for Java 8 and above
      //also known as an anonymous method 
      // a shorter way to write anonymous classes with only one method
      //need to use a functional interface or use a pre-defined functional interface
      //they contain only one abstrct method
      //eg: ActionListener,Runnable,(user-defined)
      
      //a Lambda expression can be used in any place where a functional interface
      //How to use lambda expression:
      //    (argument) -> (statement/s) : -> lambda operator
 
         
class LambdaExpression {
    public static void main(String[] args) {
         MyInterface ob = (x,y) -> {
            System.out.println("Hello "+x+y);
            System.out.println("Good Day"); 
        };

        MyInterface ob2 = (a,b) ->{
           System.out.println("Thank You "+a+b);
        };

         ob.message("Ritu",'!');
         ob2.message("Divya", '!');
        }
}
