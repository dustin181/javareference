from collections import defaultdict

class Graph:
    def __init__(self, graph):
        self.graph = graph

    def addEdge(self, vertex, edge):
        self.graph[vertex].append(edge)

    def bfs(self, vertex):
        visited = [vertex]
        queue = [vertex]

        while queue:
            node = queue.pop(0)
            print(node)

            for neighbor in self.graph[node]:
                if neighbor not in visited:
                    visited.append(neighbor)
                    queue.append(neighbor)

    def dfs(self, vertex):
        visited = [vertex]
        stack = [vertex]

        while stack:
            node = stack.pop()
            print(node)

            for neighbor in self.graph[node]:
                if neighbor not in visited:
                    visited.append(neighbor)
                    stack.append(neighbor)



customDict = {"a": ["b", "c"],
              "b": ["a", "d", "e"],
              "c": ["a", "e"],
              "d": ["b", "e", "f"],
              "e": ["d", "f", "c"],
              "f": ["d", "e"]
              }

g = Graph(customDict)
g.dfs("a")
print("***")
g.bfs("a")

