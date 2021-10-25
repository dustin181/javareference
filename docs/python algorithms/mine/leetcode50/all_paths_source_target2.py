from typing import List
from collections import deque


def allPathsSourceTargetDFS(graph: List[List[int]]) -> List[List[int]]:
    result = []
    stack = [(0, [0])]
    target = len(graph) - 1

    while stack:
        cur, route = stack.pop()
        if target == cur:
            result.append(route)
        else:
            for node in graph[cur]:
                stack.append((node, route + [node]))

    return result




def allPathsSourceTargetBFS(graph: List[List[int]]) -> List[List[int]]:
    pass


graph = [[4,3,1],[3,2,4],[3],[4],[]]

print(allPathsSourceTargetDFS(graph))
print(allPathsSourceTargetBFS(graph))