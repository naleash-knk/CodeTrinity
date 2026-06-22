def main():
    n = int(input())
    head = None
    for i in range(n):
        k=int(input())
        if(head==None):
            head = Node(k)
        else:
            insertAtEnd(head,k)

    iter = head
    while(iter!=None):
        print(iter.val,end=" ")
        iter=iter.next

class Node:
    def __init__(self,val: int):
        self.next = None
        self.val = val

def insertAtEnd(head: Node, n:int):
    current = head
    while(current.next!=None):
        current=current.next
    current.next = Node(n)

if __name__ == "__main__":
    main()