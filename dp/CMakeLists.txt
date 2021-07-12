cmake_minimum_required(VERSION 3.14)
project(dp)

set(CMAKE_CXX_STANDARD 14)

include_directories(./includes)

add_executable(dp_a a.cpp)
add_executable(dp_d d.cpp)
