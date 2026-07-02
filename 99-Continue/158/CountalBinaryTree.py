from collections import deque

class Node:
    def __init__(self,data:int):
        self.left = self.right = None
        self.data = data

class BinaryTree:
    def __init__(self):
        self.root = None;
        
    def buildTree(self,arr:list[int]) -> Node:
        if len(arr)==0:
            return self.root
        
        self.root = Node(arr[0])
        queue = deque()
        queue.append(self.root)
        
        i = 1
        while queue and i<len(arr):
            current = queue.popleft()
            if i<len(arr):
                current.left = Node(arr[i])
                queue.append(current.left)
                i+=1
            if i<len(arr):
                current.right = Node(arr[i])
                queue.append(current.right)
                i+=1
        return self.root
    
    def countNodes(self) -> int:
        if self.root is None:
            return 0;
        
        count =1
        queue = deque([self.root])
        
        while queue:
            current = queue.popleft()
            if current.left is not None:
                queue.append(current.left)
                count+=1
            if current.right is not None:
                queue.append(current.right)
                count+=1
        return count
        

def main():
    n = int(input())
    lst = list(map(int,input().split()))
    tree = BinaryTree()
    tree.buildTree(lst)
    print(tree.countNodes())
    
if __name__=="__main__":
    main()
