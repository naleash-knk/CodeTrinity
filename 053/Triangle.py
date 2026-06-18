def main():
    n = int(input())
    width =(2*n)-1
    for i in range(1,width+1,2):
        spacer = int((width-i)/2)
        for j in range(spacer):
            print("  ",end="")
        for j in range(i):
            print("* ",end="")
        for j in range(spacer):
            print("  ",end="")
        print()

if __name__ == "__main__":
    main()