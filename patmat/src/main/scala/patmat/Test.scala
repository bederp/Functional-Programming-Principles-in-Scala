package patmat

import Huffman._

object Test extends App{
  println("Welcome to the Scala worksheet")      
  val string = "Hamak"                           
  val list = string2Chars(string);                
  val tmp = times(list);
  val t1 = Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5)
  encode(t1)(List('a', 'a', 'b', 'b'))
  
}