
def main():
    totalCopies = int(input())
    spPerCopy = int(input())
    cpPerCopy = int(input())

    revenue = totalCopies*spPerCopy
    expenditure = (totalCopies*cpPerCopy)+100

    print(revenue-expenditure)

if __name__=="__main__":
    main()
