from collections import deque

class Node:
    def __init__(self,data:int):
        self.left = None
        self.right = None
        self.data = data

class BinaryTree:
    def __init__(self):
        self.root = None

    def buildTree(self, n):
        values = list(map(int, input().split()))
        self.root = Node(values[0])
        queue = deque([self.root])
        index = 1
        while queue and index < n:
            current = queue.popleft()
            if index < n:
                current.left = Node(values[index])
                queue.append(current.left)
                index += 1

            if index < n:
                current.right = Node(values[index])
                queue.append(current.right)
                index += 1

    def levelOrderTraversal(self):
        if self.root == None:
            return 

        queue = deque([self.root])
        while queue:
            current = queue.popleft()
            print(current.data,end=" ")
            if current.left:
                queue.append(current.left)
            if current.right:
                queue.append(current.right)

def main():
    tree = BinaryTree()
    n = int(input())
    tree.buildTree(n)
    tree.levelOrderTraversal()

if __name__=="__main__":
    main()




