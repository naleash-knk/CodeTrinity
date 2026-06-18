import 'dart:io';

void main(){
  int r = int.parse(stdin.readLineSync()!);
  int h = int.parse(stdin.readLineSync()!);
  double pi = 3.14;

  print((pi*r*r*h).ceil());

}

