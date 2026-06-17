import 'dart:io';
import 'dart:math';

void main(){
  double fn = double.parse(stdin.readLineSync()!);
  double sn = double.parse(stdin.readLineSync()!);

  print(
    """
Square Root of first number: ${sqrt(fn)}
First number raised to the power of second number: ${pow(fn,sn)}
Absolute value of first number: $fn
Absolute value of second number: $sn
"""
  );

}