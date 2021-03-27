cmake_minimum_required(VERSION 3.14)
project(past)

set(CMAKE_CXX_STANDARD 14)

include_directories(./includes)

add_executable(past202004 past202004/c.cpp)
