// Main function
fun main() {
	  val age=24;
    val layer=5;
    drawCandle(age);
    drawTopCake(age);
    drawBottomCake(age,layer);
}



fun drawCandle(age:Int){
    print(" ")
    repeat(age){
        print(",")  
    }
    println()
    
    print(" ")
    repeat(age){
        print("|")
    }
    println()
}
fun drawTopCake(age:Int){
    repeat(age+2){
        print("=")
    }
    println()
}
fun draBbottomCake(age:Int,layer:Int){
    
    repeat(layer){
        print(" ")
        repeat(age){
        print("@")
    }
        println();
    }
    
    
}


