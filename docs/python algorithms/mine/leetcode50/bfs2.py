from collections import defaultdict


class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def insertEdge(self, v1, v2):
        self.graph[v1].append(v2)

    def DFS(self, startNode):
        visited = set()

        stack = [startNode]

        while stack:
            cur = stack[-1]
            stack.pop()

            if cur not in visited:
                visited.add(cur)

            for node in self.graph[cur]:
                if node not in visited:
                    stack.append(node)



    # def BFS(self, startNode):




g = Graph()
g.insertEdge(2,1)
g.insertEdge(2,5)
g.insertEdge(5,6)
g.insertEdge(5,8)
g.insertEdge(6,9)

g.DFS(2)
print()
g.BFS(2)