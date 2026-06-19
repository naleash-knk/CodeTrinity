import 'dart:io';

void main(){
  int friends = int.parse(stdin.readLineSync()!);
  int teams = int.parse(stdin.readLineSync()!);

  int leftOut = friends%teams;
  int teamMembers = ((friends-leftOut)/teams).toInt();

  print("The number of friends in each team is $teamMembers and left out is $leftOut");
}