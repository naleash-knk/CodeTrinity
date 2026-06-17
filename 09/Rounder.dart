import 'dart:io';
void main(){
  double n = double.parse(stdin.readLineSync()!);

  print(n.toInt());
  print(n.ceil());
  print(n.floor());
}