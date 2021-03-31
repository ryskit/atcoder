cmake_minimum_required(VERSION 3.14)
project(past)

set(CMAKE_CXX_STANDARD 14)

include_directories(./includes)

add_executable(past201912_e past201912/e.cpp)

add_executable(past202004_c past202004/c.cpp)
add_executable(past202004_d past202004/d.cpp)

add_executable(past202005_e past202005/e.cpp)
