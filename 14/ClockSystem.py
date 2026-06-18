def main():
    a = int(input())
    b = int(input())

    product = a*b
    result = product%12

    if(result==0 and product!=0):
        print(12)
        return

    print(result)

if __name__ == "__main__":
    main()