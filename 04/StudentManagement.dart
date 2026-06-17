import 'dart:io';

double truncate(double val){
  int temp = (val*100).toInt();
  return (temp.toDouble()/100);
}

void main(){
  String name = stdin.readLineSync()!;
  int age = int.parse(stdin.readLineSync()!);
  double cgpa = double.parse(stdin.readLineSync()!);
  String grade = stdin.readLineSync()!.trim();

  print(
    """
  Name: $name
  Age: $age
  CGPA: ${truncate(cgpa)}
  Grade: $grade
    """
  );
}