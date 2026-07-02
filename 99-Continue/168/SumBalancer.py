from collections import deque

class Node:
    def __init__(self, data: int):
        self.data = data
        self.left = self.right = None


class BinaryTree:
    def __init__(self):
        self.root = None

    def buildTree(self, arr: list[str]) -> Node:
        if len(arr) == 0:
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

    def isSumTree(self, root):
        if root is None:
            return True, 0

        if root.left is None and root.right is None:
            return True, root.data

        left_ok, left_sum = self.isSumTree(root.left)
        right_ok, right_sum = self.isSumTree(root.right)

        if (
            left_ok
            and right_ok
            and root.data == left_sum + right_sum
        ):
            return True, root.data + left_sum + right_sum

        return False, 0

    def sumBalancer(self):
        result, _ = self.isSumTree(self.root)
        return result


def main():
    int(input())
    arr = input().split()

    tree = BinaryTree()
    tree.buildTree(arr)

    print("Yes" if tree.sumBalancer() else "No")


if __name__ == "__main__":
    main()