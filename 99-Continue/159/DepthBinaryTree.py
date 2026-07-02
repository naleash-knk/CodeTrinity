from collections import deque

class Node:
    def __init__(self,data:int):
        self.left = self.right = None
        self.data = data
        
class BinaryTree:
    def __init__(self):
        self.root = None
        
    def buildTree(self,arr:list[str])->Node:
        if len(arr)==0:
            return self.root
        
        self.root=Node(int(arr[0]))
        queue=deque()
        queue.append(self.root)
        i = 1;
        while queue and i<len(arr):
            current = queue.popleft()
            if i<len(arr):
                if arr[i]!="null":
                    current.left = Node(int(arr[i]))
                    queue.append(current.left)
                i+=1
            if i<len(arr):
                if arr[i]!="null":
                    current.right = Node(int(arr[i]))
                    queue.append(current.right)
                i+=1
        return self.root
    
    def depthFinder(self)->int:
        if self.root is None:
            return 0
        
        depth = 0
        queue = deque([self.root])
        
        while queue:
            size = len(queue)
            while size>0:
                current = queue.popleft()
                if current.left is not None:
                    queue.append(current.left)
                if current.right is not None:
                    queue.append(current.right)
                size-=1
            depth+=1
        
        return depth
        
def main():
    tree = BinaryTree()
    n = int(input())
    lst = input().split()
    tree.buildTree(lst)
    print(tree.depthFinder())

if __name__ == "__main__":
    main()
    
                    
        
            
        