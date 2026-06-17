
def main():
    name = input().strip()
    age = int(input())
    cgpa = float(input())
    grade = input()

    print(
        f"""
        Name: {name}
        Age: {age}
        CGPA: {truncate(cgpa)}
        Grade: {grade}
        """
    )

def truncate(cgpa: float) -> float:
    temp = int(cgpa*100)
    result = float(temp)/100
    return result

if __name__=="__main__":
    main()
