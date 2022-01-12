package edu.knoldus

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



    for (i <- 0 until array.length - 1) {
      var min = i
      for (j <- i + 1 until array.length) {
        if (array(j) < array(min)) min = j
      }
      val temp = array(i)
      array(i) = array(min)
      array(min) = temp
    }
    array
  }

      def bubbleSort(array: Array[Int]): Array[Int] = {
        for (i <- 1 to array.length - 1) {
          for (j <- (i - 1) to 0 by -1) {
            if (array(j) > array(j + 1)) {
              val temp = array(j + 1)
              array(j + 1) = array(j)
              array(j) = temp
            }
          }
        }
        array
      }


}
