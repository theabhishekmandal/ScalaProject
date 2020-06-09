package LinkedList

import LinkedList.SinglyLinkedList.Sll

object SinglyLinkedListDemo {
    def main(args: Array[String]): Unit = {
      var list : Sll[Int] = new Sll
      list.append(1)
      list.append(1)
      list.append(1)
      list.append(1)
      println(list)

      val stringList : Sll[String] = new Sll
      stringList.append("hey there")
      stringList.append("1")
      stringList.append("1")
      stringList.append("1")
      println(stringList)
      stringList.head = null;
      println(stringList)
    }
}
