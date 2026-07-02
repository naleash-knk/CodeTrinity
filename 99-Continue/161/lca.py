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
    
    def lca(self,root:Node,a:int,b:int) -> Node:
        if root is None:
            return root
        
        if root.data==a or root.data==b:
            return root
        
        left = self.lca(root.left,a,b)
        right = self.lca(root.right,a,b)
        
        if left is not None and right is not None:
            return root
        
        return left if left is not None else right
        
def main():
    n = int(input())
    tree = BinaryTree()
    lsr = input().split()
    tree.buildTree(lsr)
    insr = list(map(int,input().split()))
    print(tree.lca(tree.root,insr[0],insr[1]).data)

if __name__ == "__main__":
    main()
    