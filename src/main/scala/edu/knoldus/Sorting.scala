package edu.knoldus

import scala.annotation.tailrec
import scala.language.postfixOps

class Sorting extends App {

  def insertionSort(array: Array[Int]): Array[Int] = {
    val list: List[Int] = array.toList

    def insertHelper(list: List[Int]): List[Int] = {
      if (list.isEmpty) {
        Nil

      }
      else {
        insert(list.head, insertHelper(list.tail))
      }
    }

    def insert(elem: Int, list: List[Int]): List[Int] =
      if (list.isEmpty || elem <= list.head) {
        elem :: list
      } else {
        list.head :: insert(elem, list.tail)
      }

    insertHelper(list).toArray



  }


  def selectionSort(array: Array[Int]): Array[Int] = {



    @tailrec
    def selectionHelper(list: List[Int], acc:List[Int] =List[Int]()): List[Int]={
      if(list== Nil){
        acc
      }else
      {
        val min = list.min
        val remainlist =list.filter(_ !=min)
        selectionHelper(remainlist, acc ::: List.fill(list.length - remainlist.length)(min))
      }

    }
    selectionHelper(array.toList).toArray
  }

      def bubbleSort(array: Array[Int]): Array[Int] = {


        def bubbleHelper(array: Array[Int], l:Int): Int={
          if(l==1) {
            return 0
          }
          for(i<-0 until l-1){
            if(array(i) >array(i+1)){
              val temp = array(i)
              array(i) = array(i+1)
              array(i+1) = temp
            }
          }
          bubbleHelper(array, l-1)
        }
        bubbleHelper(array,array.length)
        array
      }



}
