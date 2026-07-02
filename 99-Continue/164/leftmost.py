from collections import deque

class Node:
    def __init__(self,data:int):
        self.data = data
        self.left = self.right = None

class BinaryTree:
    def __init__(self):
        self.root = None
    
    def buildTree(self,arr:list[str])->Node:
        if len(arr)==0:
            return self.root
        self.root = Node(int(arr[0]))
        queue = deque([self.root])
        i = 1
        while queue and i<len(arr):
            current = queue.popleft()
            if i<len(arr):
                current.left = Node(int(arr[i]))
                queue.append(current.left)
            i+=1
            if i<len(arr):
                current.right = Node(int(arr[i]))
                queue.append(current.right)
            i+=1
        return self.root
        
    def leftMost(self)->int:
        current = self.root
        while current.left is not None:
            current=current.left
        return current.data

def main():
    int(input())
    s = input().split()
    tree = BinaryTree()
    tree.buildTree(s)
    print(tree.leftMost())
    
if __name__=="__main__":
    main()

