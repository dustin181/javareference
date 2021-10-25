from collections import defaultdict

class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def addEdge(self, u, v):
        self.graph[u].append(v)

    def bfs(self, vertex):
        queue = [vertex]
        visited = [vertex]

        while queue:
            popVertex = queue.pop(0)
            print(popVertex)

            for neighbor in self.graph[popVertex]:
                if neighbor not in visited:
                    queue.append(neighbor)
                    visited.append(neighbor)

    def dfs(self, vertex):
        stack = [vertex]
        visited = [vertex]

        while stack:
            popVertex = stack.pop()
            print(popVertex)

            for neighbor in self.graph[popVertex]:
                if neighbor not in visited:
                    visited.append(neighbor)
                    stack.append(neighbor)




g = Graph()

g.addEdge("a", "b")
g.addEdge("a", "c")
g.addEdge("b", "a")
g.addEdge("b", "d")
g.addEdge("b", "e")
g.addEdge("c", "a")
g.addEdge("c", "e")
g.addEdge("d", "b")
g.addEdge("d", "e")
g.addEdge("d", "f")
g.addEdge("e", "d")
g.addEdge("e", "f")
g.addEdge("e", "c")
g.addEdge("f", "d")
g.addEdge("f", "e")


g.dfs("a")
print("***")
g.bfs("a")

