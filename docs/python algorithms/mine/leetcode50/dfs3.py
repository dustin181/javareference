from collections import defaultdict


class Graph:
    def __init__(self):
        self.graph = defaultdict(list)

    def insertEdge(self, v1, v2):
        self.graph[v1].append(v2)

    def DFS(self, startNode):
        visited = set()
        st = [startNode]

        while st:

            curr = st[-1]
            st.pop()

            if curr not in visited:
                print(curr, end=" ")
                visited.add(curr)

            for vertex in self.graph[curr]:
                if vertex not in visited:
                    st.append(vertex)


    def BFS(self, startNode):
        visited = set()
        queue = [startNode]

        while queue:
            curr = queue.pop(0)
            print(curr, end=" ")

            for vertex in self.graph[curr]:
                if vertex not in visited:
                    visited.add(vertex)
                    queue.append(vertex)



g = Graph()
g.insertEdge(2,1)
g.insertEdge(2,5)
g.insertEdge(5,6)
g.insertEdge(5,8)
g.insertEdge(8,9)

g.DFS(2)
print()
g.BFS(2)
