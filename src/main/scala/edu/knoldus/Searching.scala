package edu.knoldus

import scala.annotation.tailrec

class Searching extends App {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
  @tailrec
    def binaryHelper(array: Array[Int], elem:Int, lowerIndex:Int,higherIndex:Int): Boolean={
      val mid =(lowerIndex + higherIndex) /2
      if(elem > array(higherIndex)){
        false
      }else{

        if(elem == array(mid)){
          true
        }else if(elem<array(mid)){
          binaryHelper( array,elem, lowerIndex, mid-1)
        }else
        {
          binaryHelper(array , elem , mid + 1 , higherIndex)
        }
      }
    }
    binaryHelper(array,elem,0 ,array.length-1)
  }

      def linearSearch(array: Array[Int], elem: Int): Boolean = {
        if ( array.isEmpty ) {
          false
        }
         else if (array.headOption.get == elem){
          true
        }
        else {linearSearch(array.tail, elem)
      }
      }


    }



