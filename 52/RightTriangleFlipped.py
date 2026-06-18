def main():
    n = int(input())

    for i in range(1,n+1):
        spacer = n-i
        for j in range(spacer):
            print("  ",end="")
        for k in range(i):
            print("* ", end="")
        print()


if __name__ == "__main__":
    main()
    