# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.15

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = "/Users/ryskit/Library/Application Support/JetBrains/Toolbox/apps/CLion/ch-0/193.5662.56/CLion.app/Contents/bin/cmake/mac/bin/cmake"

# The command to remove a file.
RM = "/Users/ryskit/Library/Application Support/JetBrains/Toolbox/apps/CLion/ch-0/193.5662.56/CLion.app/Contents/bin/cmake/mac/bin/cmake" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/086_a.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/086_a.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/086_a.dir/flags.make

CMakeFiles/086_a.dir/086/a.cpp.o: CMakeFiles/086_a.dir/flags.make
CMakeFiles/086_a.dir/086/a.cpp.o: ../086/a.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/ryskit/dev/src/github.com/ryskit/atcoder/abc/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/086_a.dir/086/a.cpp.o"
	/Library/Developer/CommandLineTools/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/086_a.dir/086/a.cpp.o -c /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc/086/a.cpp

CMakeFiles/086_a.dir/086/a.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/086_a.dir/086/a.cpp.i"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc/086/a.cpp > CMakeFiles/086_a.dir/086/a.cpp.i

CMakeFiles/086_a.dir/086/a.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/086_a.dir/086/a.cpp.s"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc/086/a.cpp -o CMakeFiles/086_a.dir/086/a.cpp.s

# Object files for target 086_a
086_a_OBJECTS = \
"CMakeFiles/086_a.dir/086/a.cpp.o"

# External object files for target 086_a
086_a_EXTERNAL_OBJECTS =

086_a: CMakeFiles/086_a.dir/086/a.cpp.o
086_a: CMakeFiles/086_a.dir/build.make
086_a: CMakeFiles/086_a.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/ryskit/dev/src/github.com/ryskit/atcoder/abc/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable 086_a"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/086_a.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/086_a.dir/build: 086_a

.PHONY : CMakeFiles/086_a.dir/build

CMakeFiles/086_a.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/086_a.dir/cmake_clean.cmake
.PHONY : CMakeFiles/086_a.dir/clean

CMakeFiles/086_a.dir/depend:
	cd /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc/cmake-build-debug /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc/cmake-build-debug /Users/ryskit/dev/src/github.com/ryskit/atcoder/abc/cmake-build-debug/CMakeFiles/086_a.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/086_a.dir/depend

