import 'dart:io';

void main(){
  int a = int.parse(stdin.readLineSync()!);
  int b = int.parse(stdin.readLineSync()!);

  int product = a*b;
  int result = product%12;

  if(result==0 && product!=0){
    print(12);
    return;
  }

  print(result);
}