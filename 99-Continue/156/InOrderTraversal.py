from collections import deque 

class Node:
    def __init__(self,data:int):
        self.left = None
        self.right = None
        self.data = data

class BinaryTree:
    def __init__(self):
        self.root = None

    def buildTree(self, n:int)->Node:
        values = input().split()
        if not values:
            return None
        self.root = Node(values[0])
        queue = deque([self.root])
        i = 1
        while(queue and i<len(values)):
            current = queue.popleft()
            if(i<len(values)):
                if values[i]!="null":
                    current.left = Node(values[i])
                    queue.append(current.left)
                i+=1

            if(i<len(values)):
                if values[i]!="null":
                    current.right= Node(values[i])
                    queue.append(current.right)
                i+=1
        return self.root

    def inOrderTraversal(self,root:Node):
        if root:
            self.inOrderTraversal(root.left)
            print(root.data,end=" ")
            self.inOrderTraversal(root.right)

def main():
    n = int(input())
    tree = BinaryTree()
    tree.buildTree(n)
    tree.inOrderTraversal(tree.root)

if __name__ =="__main__":
    main()
