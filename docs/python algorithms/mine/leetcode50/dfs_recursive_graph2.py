from collections import defaultdict

class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def addEdge(self, u, v):
        self.graph[u].append(v)

    def DFS(self, v):
        visited = set()

        self.DFSHelper(v, visited)

    def DFSHelper(self, v, visited):
        visited.add(v)
        print(v, end=" ")

        for neighbor in self.graph[v]:
            if neighbor not in visited:
                self.DFSHelper(neighbor, visited)


# Create a graph given
# in the above diagram
g = Graph()
g.addEdge(0, 1)
g.addEdge(0, 2)
g.addEdge(1, 2)
g.addEdge(2, 0)
g.addEdge(2, 3)
g.addEdge(3, 3)

print("Following is DFS from (starting from vertex 2)")
g.DFS(2)
