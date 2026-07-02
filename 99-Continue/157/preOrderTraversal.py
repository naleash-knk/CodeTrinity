from collections import deque

class Node:
    def __init__(self,data:int):
        self.left = self.right = None
        self.data = data
        
class BinaryTree:
    def __init__(self):
        self.root=None
        
    def buildTree(self,arr:list[str])->Node:
        if len(arr)==0:
            return self.root
        queue = deque()
        self.root = Node(int(arr[0]))
        queue.append(self.root)
        i = 1
        while queue and i<len(arr):
            current = queue.popleft();
            if i<len(arr):
                if int(arr[i])!=-1:
                    current.left = Node(int(arr[i]))
                    queue.append(current.left)
                i+=1
            if i<len(arr):
                if int(arr[i])!=-1:
                    current.right = Node(int(arr[i]))
                    queue.append(current.right)
                i+=1
        return self.root
    
    def preOrderTraversal(self,root:Node):
        if root is not None:
            print(root.data,end=" ")
            self.preOrderTraversal(root.left)
            self.preOrderTraversal(root.right)
            
def main():
    tree = BinaryTree()
    strarr = input().split()
    tree.buildTree(strarr)
    tree.preOrderTraversal(tree.root)
    
if __name__=="__main__":
    main()
    

                
                
                
                
                
                
                
                
                
                
                
                