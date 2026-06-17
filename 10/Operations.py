import math

def main():
    fn = float(input())
    sn = float(input())

    print(f"""
Square Root of first number: {math.sqrt(fn)}
First number raised to the power of second number: {fn**sn}
Absolute value of first number: {fn}
Absolute value of second number: {sn}
""");

if __name__ == "__main__":
    main()