from collections import deque

class Node:
    def __init__(self, data):
        self.data = data
        self.left = self.right = None


class BinaryTree:
    def __init__(self):
        self.root = None

    def buildTree(self, arr):
        if not arr:
            return None

        self.root = Node(int(arr[0]))
        queue = deque([self.root])

        i = 1

        while queue and i < len(arr):
            current = queue.popleft()

            if i < len(arr) and arr[i] != "null":
                current.left = Node(int(arr[i]))
                queue.append(current.left)
            i += 1

            if i < len(arr) and arr[i] != "null":
                current.right = Node(int(arr[i]))
                queue.append(current.right)
            i += 1

        return self.root

    def rootToLeaf(self, root, s, lst):
        if root is None:
            return

        s += str(root.data)

        if root.left:
            self.rootToLeaf(root.left, s, lst)

        if root.right:
            self.rootToLeaf(root.right, s, lst)

        if root.left is None and root.right is None:
            lst.append(int(s))


def main():
    input()  # n
    arr = input().split()

    tree = BinaryTree()
    tree.buildTree(arr)

    lst = []
    tree.rootToLeaf(tree.root, "", lst)

    print(sum(lst))


if __name__ == "__main__":
    main()