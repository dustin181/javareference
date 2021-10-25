from collections import defaultdict


class GraphAdjacencyList:
    def __init__(self):
        self.graph = defaultdict(list)

    def insertEdge(self, v1, v2):
        self.graph[v1].append(v2)


class GraphAdjacencyMatrix:
    def __init__(self,numberOfNodes):
        self.numberOfNodes = numberOfNodes + 1
        self.graph = [[0 for x in range(numberOfNodes + 1)]
                      for y in range(numberOfNodes + 1)]

    def insertEdge(self, v1, v2):
        if (v1 <= self.numberOfNodes and v2 <= self.numberOfNodes) and (v1 >= 0 and v2 >= 0):
            self.graph[v1][v2] = 1


g = GraphAdjacencyList()
g.insertEdge(1,2)
g.insertEdge(1,3)
print(g.graph[1])
print(g.graph[2])

g2 = GraphAdjacencyMatrix(4)
g2.insertEdge(1,4)
g2.insertEdge(2,3)

