from collections import deque

class Node:
    def __init__(self,data:int):
        self.data = data
        self.right = self.left = None
    
class BinaryTree:
    def __init__(self):
        self.root = None
    
    def buildTree(self, arr:list[str])->Node:
        if len(arr)==0:
            return self.root
        
        self.root = Node(int(arr[0]))
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
            
        return self.root
    
    def sumLeaf(self,root:Node)->int:
        if root is None:
            return 0
        
        if root.left is None and root.right is None:
            return root.data
        
        return self.sumLeaf(root.left)+self.sumLeaf(root.right)
        
def main():
    int(input())
    s = input().split()
    tree = BinaryTree()
    tree.buildTree(s)
    print(tree.sumLeaf(tree.root))

if __name__=="__main__":
    main()        
        
            
            
            
            
            