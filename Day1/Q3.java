import java.util.*;

    class Q3 {

        public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number" );
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ch=0;
               System.out.println("Enter the operation you want to perform :" );

               do{
               System.out.println("\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division \n5.exit:" );
               ch=sc.nextInt();

               switch (ch) {
                case 1:
                  System.out.println("Addition is :" + (a+b));
                  break;

                case 2:
                  System.out.println("Subtraction is is :" + (a-b));
                  break;
               
                case 3:
                  System.out.println("Multiplication  is :" + (a*b));
                  break;

                  case 4:
                  System.out.println("Division is :" + (a/b));
                  break;

                  case 5:
                  System.out.println("exited");
                  break;

                default:
                   System.out.println("enter valid choise");
                  break;
               }
              }while(ch!=5);

       sc.close();
          
        }
      }
    
