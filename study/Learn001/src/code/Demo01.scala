package code

import java.math.BigInteger;

object Demo01 {
  
  def factorial(x: BigInt): BigInt=
    if (x == 0) 1 else x * factorial(x-1);
  
  def factoria(x: BigInteger):BigInteger=
    if(x == BigInteger.ZERO)
      BigInteger.ONE;
    else
      x.multiply(factoria(x.subtract(BigInteger.ONE)));
    
  def main(args: Array[String]){
    var capital = Map("US"->"Washington","France"->"Paris");
    capital += ("Japen"->"Tokyp");
    println(capital("France"));
    
    println(factorial(30));
  }
}