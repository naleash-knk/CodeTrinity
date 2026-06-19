
def main():
    friends = int(input())
    teams = int(input())

    leftOut = friends%teams
    teamMembers = (friends-leftOut)//teams

    print(f"The number of friends in each team is {teamMembers} and left out is {leftOut}")


if __name__ == "__main__":
    main()

