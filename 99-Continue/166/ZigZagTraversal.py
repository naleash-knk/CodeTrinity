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
            if i<len(arr) and arr[i]!="null":
                current.left = Node(int(arr[i]))
                queue.append(current.left)
            i+=1
            if i<len(arr) and arr[i]!="null":
                current.right = Node(int(arr[i]))
                queue.append(current.right)
            i+=1
        return self.root
    
    def zigZagPrintTree(self)->Node:
        if self.root is None:
            return self.root
        
        queue = deque([self.root])
        print(self.root.data,end="")
        while queue:
            size = len(queue)
            print()
            while size>0:
                current = queue.popleft()
                if current.right is not None:
                    if current.left is not None:
                        queue.append(current.left)
                    print(current.right.data,end=" ")
                if current.left is not None:
                    if current.right is not None:
                        queue.append(current.right)
                    print(current.left.data,end=" ")
                size-=1
            print()
            size0 = len(queue)
            while size0>0:
                current = queue.popleft()
                if current.left is not None:
                    queue.append(current.left)
                    print(current.left.data,end=" ")
                if current.right is not None:
                    queue.append(current.right)
                    print(current.right.data,end=" ")
                size0-=1
                

def main():
    int(input())
    s = input().split()
    tree = BinaryTree()
    tree.buildTree(s)
    tree.zigZagPrintTree()
    
if __name__=="__main__":
    main()
            
            
                
        
    
    
        