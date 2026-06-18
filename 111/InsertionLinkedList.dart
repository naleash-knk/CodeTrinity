import 'dart:io';

class Node {
  int val;
  Node? next;

  Node(this.val);
}

void insertAtEnd(Node head, int n) {
  Node current = head;

  while (current.next != null) {
    current = current.next!;
  }

  current.next = Node(n);
}

void main() {
  int n = int.parse(stdin.readLineSync()!);

  Node? head;

  for (int i = 0; i < n; i++) {
    int k = int.parse(stdin.readLineSync()!);

    if (head == null) {
      head = Node(k);
    } else {
      insertAtEnd(head, k);
    }
  }

  Node? iter = head;

  while (iter != null) {
    stdout.write("${iter.val} ");
    iter = iter.next;
  }
}
