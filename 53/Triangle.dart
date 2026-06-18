import 'dart:io';

void main(){
  int n = int.parse(stdin.readLineSync()!);
  int width = (2*n)-1;
  for(int i=1;i<=width;i+=2){
    int spacer = ((width-i)/2).toInt();
    for(int j=0;j<spacer;j++){
      stdout.write("  ");
    }
    for(int j=0;j<i;j++){
      stdout.write("* ");
    }
    for(int j=0;j<spacer;j++){
      stdout.write("  ");
    }
    print("");
  }
}