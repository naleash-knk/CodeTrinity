import 'dart:io';

void main(){
  print("Four Digit Integer");
  String n = stdin.readLineSync()!;
  int first = int.parse(n[0]);
  int second = int.parse(n[3]);
  print(first+second);
}