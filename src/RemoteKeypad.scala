class RemoteKeypad(width:Int, x:Int, y:Int) {
	
	var h:Int = x
	var v:Int = y
	var W:Int = width
    
	
	def getRow(c:Char):Int = (c-'a')/width
	def getCol(c:Char):Int = (c-'a')%width
	
	def getMoves(c:Char):Unit = {
	  val UpDown: Int = getCol(c)
	  val LeftRight: Int = getRow(c)
	  
	    if(LeftRight == h && UpDown == v){
		  println("enter")
	    }//if
	    
	    if(h > LeftRight){
	      while(h > LeftRight){
	      print("Left ")
	      h -= 1
	      }//while
	    } else if (h < LeftRight){
	        while(h < LeftRight){
	        print("Right ")
	        h += 1
	        }//while
	    }//else if
	    if(LeftRight == h && UpDown == v){
		  println("enter")
	    }//if
	   
	    if(v > UpDown){
	      while(v > UpDown){
	      print("Up ")
	      v -= 1
	      }//while
	    } else if(v < UpDown){
	      while(v < UpDown){
	        print("Down ")
	        v += 1
	      }//while
	    }//else if
	    if(LeftRight == h && UpDown == v){
		  println("enter")
	    }//if
	}//getMoves
	

	
	def getMoves(s:String):Unit = {
	  var sequence:List[Char] = s.toList
	  var i:Int = 0
	  while(sequence.isEmpty == false){
	    for(i <- 0 until sequence.length){
	       getMoves(sequence(i))
		    
	    }//for
	    return
	  }//while
	}//getMoves
}//RemoteKeypadClass