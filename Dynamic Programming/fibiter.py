#def IterFibn(n):
    #dp=[-1]*(n+1)
    
    #dp[0]=0
    #dp[1]=1
    #for i in range(2,n+1):
        #dp[i]=dp[i-1]+dp[i-2]
    #return dp[n]
#n=int(input())
#print(IterFibn(n))


#     s=int(input())
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        def printLL(self,head):
            while head is not None:
                print(head.data,end=" ")
                head = head.next



node1 = Node(10)
node2 = Node(20)
node2.next = node1
printLL(node2)