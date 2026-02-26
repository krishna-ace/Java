package calc;
class Sum{
    int num1,num2;
    Sum(){
      // User define default constructor
    }
    Sum (int num1, int num2){
      this.num1=num1;
      this.num2=num2;
    }
    void getSum(){
      System.out.println("Sum = "+(num1+num2));
    }
}
class  Div{
  void getDiv(int num,int numn){
    System.out.println("Sum = "+(num/numn));
  }
}
public class Calculator { 
    public static void main(String[] args){
      Sum s1; // Object declaration 
      s1 = new Sum(22,80);  //object instantion
      s1.getSum();
      Div div1 = new Div();
      div1.getDiv(4,2);
     }
}
