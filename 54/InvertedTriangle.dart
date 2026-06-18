import 'dart:io';

void main(){
  int n =int.parse(stdin.readLineSync()!);
  for(int i=n;i>0;i--){
    for(int j=0;j<i;j++){
      stdout.write("* ");
    }
    print("");
  }
}