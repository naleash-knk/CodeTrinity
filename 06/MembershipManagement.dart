import 'dart:io';

void main(){
  String name = stdin.readLineSync()!;
  String subscription = stdin.readLineSync()!;

  print("""
  Member Name: $name
  Selected Membership: $subscription
""");
}