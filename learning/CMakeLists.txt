cmake_minimum_required(VERSION 3.14)
project(learning)

set(CMAKE_CXX_STANDARD 14)

include_directories(./includes)

add_executable(dfs_a dfs/a.cpp)
add_executable(dfs_b dfs/b.cpp)

