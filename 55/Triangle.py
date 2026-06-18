def main():
    n = int(input())

    for i in range(n,0,-1):
        spacer = n-i
        for j in range(spacer):
            print("  ",end="")
        for j in range(i):
            print("* ",end="")
        print()

if __name__=="__main__":
    main()