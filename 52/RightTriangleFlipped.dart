import 'dart:io';

void main(){
  int n = int.parse(stdin.readLineSync()!);
  for(int i=1;i<=n;i++){
    int spacer = n-i;
    for(int j=0;j<spacer;j++){
      stdout.write("  ");
    }
    for(int j=0;j<i;j++){
      stdout.write("* ");
    }
    print("");
  }
  
}