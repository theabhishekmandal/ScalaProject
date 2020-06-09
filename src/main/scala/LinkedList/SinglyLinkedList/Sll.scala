package LinkedList.SinglyLinkedList

import LinkedList.SinglyLinkedList.Sll.node

object Sll{
  class node[T](var _data : T, var _next : node[T]){
    def data : T = _data
    def next : node[T] = _next

    def data_=(newData : T) : Unit = _data = newData
    def next_=(newNode : node[T]) : Unit = _next = newNode

    override def toString : String ={
      super.toString
      s"[$data]-->"
    }
  }
}

class Sll[T](private var _head : node[T] = null,
          private var _tail : node[T] = null,
          private var _size : Int = 0){
  def head : node[T] = _head
  def tail : node[T] = _tail
  def size : Int = _size

  def head_=(newRoot : node[T]) : Unit = _head = newRoot
  def tail_=(newTail : node[T]) : Unit = _tail = newTail
  def size_=(newSize : Int) : Unit = _size = newSize

  def append(data : T) : Unit = {
    if(_head == null){
      _head = new node[T](_data = data, _next = null)
      _tail = _head
      _size = 1;
      return
    }
    val newnode = new node[T](_data = data, _next = null)
    _tail._next = newnode
    _tail = newnode
    _size += 1
  }

  override def toString : String = {
    super.toString
    var temp : node[T] = _head
    var br : StringBuilder = null
    while(temp != null){
      if(br == null)
        br = new StringBuilder("(")
      else
        br.append(",")
      br.append(temp)
      temp = temp._next
    }
    if(br == null)
      br = new StringBuilder("(")
    br.append(")")
    br.toString()
  }
}
