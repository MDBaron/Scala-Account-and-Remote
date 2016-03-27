import scala.collection.mutable.ListBuffer

object Recursion {
  def pascal(c: Int, r: Int): Int = {
    if(c == r || c == 0) return 1 //check to see if the apex is the current position
    else pascal(c,r-1) + pascal(c-1,r-1)//add parents to derive child 
    
  }
  
  def countChange(money: Int, coins: List[Int]): Int = {
   
    def permutate(coinMax: List[(Int,Int)],value: Int): Int = {
      val buff = ListBuffer[(Int,Int)]()
      if(coinMax.isEmpty){
        return value
      } else {
          var newValue = value
          
          for((lastCoin, sum) <- coinMax){
            if(sum < money){
              for(c <- coins){
                if(c >= lastCoin){
                  var result = (c,sum + c)
                  buff += result
                }//if
              }//for
            } else if(sum == money){
              newValue += 1
            }//else
          }//for
          permutate(buff.toList, newValue)
      }//else
    }//permutate
    
    
    val b = coins.map { c => (c,c)}
    permutate(b,0)
  }//countChange
  
 def balance(chars: List[Char]): Boolean = {
    // implementation (CSCI 6900 Only)
    return false	// stub -- remove this line
  }
  
 }//object Recursion