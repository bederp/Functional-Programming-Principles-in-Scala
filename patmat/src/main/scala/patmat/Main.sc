package patmat

import Huffman._

object Main {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val string = "Hello World"                      //> string  : String = Hello World
  val list = string2Chars(string);                //> list  : List[Char] = List(H, e, l, l, o,  , W, o, r, l, d)
  val tmp = times(list);                          //> tmp  : List[(Char, Int)] = List((H,1), (e,1), (l,3), (o,2), ( ,1), (W,1), (r
                                                  //| ,1), (d,1))
  val t1 = Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5)
                                                  //> t1  : patmat.Huffman.Fork = Fork(Leaf(a,2),Leaf(b,3),List(a, b),5)
  val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
                                                  //> t2  : patmat.Huffman.Fork = Fork(Fork(Leaf(a,2),Leaf(b,3),List(a, b),5),Leaf
                                                  //| (d,4),List(a, b, d),9)
  decode(t1, List(0, 1, 1, 0))                    //> res0: List[Char] = List(a, b, b, a)
  decodedSecret                                   //> res1: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  encode(t1)(List('a', 'b', 'a', 'b'))            //> res2: List[patmat.Huffman.Bit] = List(0, 1, 0, 1)
  val codeTable1 = List(('a', List(0,1,0)), ('b', List(1,1,1)))
                                                  //> codeTable1  : List[(Char, List[Int])] = List((a,List(0, 1, 0)), (b,List(1, 1
                                                  //| , 1)))
  codeBits(codeTable1)('b')                       //> res3: List[patmat.Huffman.Bit] = List(1, 1, 1)
  convert(t1)                                     //> res4: patmat.Huffman.CodeTable = List((a,List(0)), (b,List(1)))
  convert(t2)                                     //> res5: patmat.Huffman.CodeTable = List((a,List(0, 0)), (b,List(0, 1)), (d,Lis
                                                  //| t(1)))
}