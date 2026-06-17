import 'dart:io';

void main(){
  int age = int.parse(stdin.readLineSync()!);
  String name = stdin.readLineSync()!;

  print("""
User Details:
Name: $name
Age: $age
""");

}