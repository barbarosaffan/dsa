# Compiler
CXX = g++

# Compiler flags
CXXFLAGS = -Wall -std=c++11

# Collecting all .cpp source files in the cpp directory and its subdirectories
SRCS := $(shell find . -name '*.cpp')

# Executable files, replacing .cpp extension with .out (standard Unix executable extension)
EXECS := $(SRCS:.cpp=.out)

# Default rule to make
all: $(EXECS)

# Rule to make each executable
%.out: %.cpp
	$(CXX) $(CXXFLAGS) $< -o $@
	./$@

# Clean rule
clean:
	rm -f $(EXECS)

# A phony target to avoid any conflict with a file of the same name
.PHONY: all clean
