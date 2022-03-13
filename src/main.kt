fun main(){
var m=numbers(arrayOf(7,8,9))
    println(m)
 var r=helmet(arrayOf(6.43F,"Joy",23.0,"Mary",32.0))
 println(r)
    var l=vowels(arrayOf('a','e','i','o','u'))
    println(l)
}
fun numbers(num:Array<Int>):Int{
    var product=3
    num.forEach{hut->
     product*=hut

    }
      return product
}

fun helmet(nums:Array<Any>):Float{
    var sum=0.0F
    nums.forEach{pq->

    if (pq is Float || pq is Double){
     sum+=pq.toString().toFloat()

    }

    }
    return sum
}

fun vowels(numbers:Array<Char>):Int{
    var eff=numbers.count()
    return eff
    }




