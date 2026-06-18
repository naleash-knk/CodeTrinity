class Node:
    def __init__(self,n:int):
        self.next = None
        self.val = n

def main():
    n = int(input())
    head = None
    for i in range(n):
        k = int(input())
        head = insertAtBeginning(head,k)

    iter = head
    while(iter!=None):
        print(iter.val,end=" ")
        iter=iter.next


def insertAtBeginning(head: Node, n: int) -> Node:
    newNode = Node(n)
    newNode.next = head
    return newNode

if __name__ == "__main__":
    main()