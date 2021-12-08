# Makefile to compile Java and C; then run Java, C, and Python
CC = gcc
JC = javac
CLASSPATH = .

# -g flag compiles with debugging info
JFLAGS = -g
CFLAGS = -g -Wall

# the build target executable:
JTARGET = BinarySearch
CTARGET = binary_search
PTARGET = binary_search

all: compile run clean

compile: $(CTARGET).c $(JTARGET).java
	$(CC) $(CFLAGS) -o $(CTARGET) $(CTARGET).c
	$(JC) $(JFLAGS) $(JTARGET).java

run:
	$(CTARGET).exe
	java -cp $(CLASSPATH) $(JTARGET)
	python $(CTARGET).py


clean: 
	$(RM) *.class
	$(RM) *.exe
