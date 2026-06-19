import 'dart:io';

void main(){
  int totalCopies = int.parse(stdin.readLineSync()!);
  int spPerCopy = int.parse(stdin.readLineSync()!);
  int cpPerCopy = int.parse(stdin.readLineSync()!);

  int revenue = totalCopies*spPerCopy;
  int expenditure = (totalCopies*cpPerCopy)+100;

  print(revenue-expenditure);
}