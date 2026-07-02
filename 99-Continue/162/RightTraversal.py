from collections import deque

class Node:
    def __init__(self,data:int):
        self.data = data
        self.left = self.right = None

class BinaryTree:
    def __init__(self):
        self.root = None
        
    def buildTree(self,arr:list[str])->None:
        if len(arr)==0:
            return self.root
        
        self.root=Node(int(arr[0]))
        queue = deque([self.root])
        
        i=1
        while queue and i<len(arr):
            current = queue.popleft()
            if i<len(arr) and arr[i]!="null":
                current.left = Node(int(arr[i]))
                queue.append(current.left)
            i+=1
            if i<len(arr) and arr[i]!="null":
                current.right = Node(int(arr[i]))
                queue.append(current.right)
            i+=1
        
        return Node
    
    def rightTraversal(self):
        if self.root is None:
            return None
        
        queue = deque([self.root])
        print(self.root.data,end=" ")
        while queue:
            size = len(queue)
            val = -1
            while size>0:
                current = queue.popleft()
                if current.left is not None:
                    queue.append(current.left)
                    val=current.left.data
                if current.right is not None:
                    queue.append(current.right)
                    val=current.right.data
                size-=1
            if val!=-1:
                print(val,end=" ")

def main():
    int(input())
    tree = BinaryTree()
    s = input().split()
    tree.buildTree(s)
    tree.rightTraversal()
    
if __name__ == "__main__":
    main()
    
        
            
        
        
        
    