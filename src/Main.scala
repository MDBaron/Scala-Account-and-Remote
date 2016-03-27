import Recursion._
//import RemoteKeypad._
object Main {
  
  def main(args: Array[String]) {
    println("step 2: print function")
    myPrint()
    println()
    
    println("step 3: recursive algorithm")
    println()
    // args(0) is number of lines of Pascal triangle to print
    printPascal(args(0).toInt)	
    
    println()
    // args(1) is the amount of money for which to calculate the number of combinations for change
    printCountChange(args(1).toInt, List(1, 5, 10))	
    
    
  
    println()
    // Start CSCI 6900
    // arg2 and arg3 are parenthesized strings to be validated
    printBalance(args(2))
    printBalance(args(3))
    // End CSCI 6900
    println()
    println("step 4: remote keypad")
    // arg4 and arg 5 are strings of alphabetic characters
    val keypad:RemoteKeypad = new RemoteKeypad(5, 0, 0)
   
    keypad.getMoves(args(4))
  
    keypad.getMoves(args(5))
   
    println()
  }//Main
  
  def printPascal(row: Int): Unit = {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }//for
  }//printPascal
  
  def printCountChange(money:Int, coins:List[Int]): Unit = {
    println("Number of ways to give change for " + money + " is: " + countChange(money, coins))
  }//printCountChange
  
  def myPrint(){
    var star: String = "*"
    var i: Int = 0
    var j: Int = 0
    var a: Int = 0
    for(a <- 0 until 5){
	  for(i <- a until 8){		  
        print(" ")
        
	  }//for
	  print(star)
	  star += "**"
	  for(j <- a until 8){
	    print(" ")
	    
	  }//for
	  a + 1
	  println()
    }//for
  }//myPrint
  
  
def printBalance(expression:String): Unit = {
    if (balance(expression.toList)) {
      println("expression: " + expression + " is balanced")
    } else {
      println("expression: " + expression + " is not balanced")
      }
  }
 
  
}//object Main

