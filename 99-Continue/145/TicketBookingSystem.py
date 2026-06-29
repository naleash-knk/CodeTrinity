from collections import deque

def main():
    queue = deque()

    size = int(input())
    n = int(input())

    for _ in range(n):

        s = input().split()

        match s[0]:

            case "ENQUEUE":
                if len(queue) < size:
                    queue.append(s[1])
                else:
                    print(f"Queue is full. Cannot add {s[1]}")

            case "DISPLAY":
                disp = ""
                if not queue:
                    print("Queue is empty.")
                else:
                    print("Current Queue: ",end="")
                    for s in queue:
                        disp=disp+s+" "
                    print(disp)

            case "DEQUEUE":
                if not queue:
                    print("Served Customer: Queue is empty. No customer to serve.")
                else:
                    customer = queue.popleft()
                    print(f"Served Customer: {customer}")

if __name__ == "__main__":
    main()