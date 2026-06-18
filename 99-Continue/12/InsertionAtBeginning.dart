import 'dart:io';

class Node{
  int val;
  Node? next;
  Node(this.val);

}

void main(){
  int n = int.parse(stdin.readLineSync()!);
  Node head;
  for(int i=0;i<n;i++){
    int k=int.parse(stdin.readLineSync()!);
    head = insertAtBeginning(head,k);
  }
}

Node insertAtBeginning(Node head, int val){
  Node newNode = Node(val);
  newNode.next = head;
  return newNode;
}