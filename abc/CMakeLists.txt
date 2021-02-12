cmake_minimum_required(VERSION 3.14)
project(abc)

set(CMAKE_CXX_STANDARD 14)

include_directories(./includes)

add_executable(042_a 042/a.cpp)
add_executable(042_b 042/b.cpp)
add_executable(042_c 042/c.cpp)

add_executable(083_b 083/b.cpp)
add_executable(088_b 088/b.cpp)
