
all: bin-c/mcp2200-jni$(SO_EXT)

bin-c:
	mkdir -p bin-c

bin-c/mcp2200-jni.o: bin-c src-c/mcp2200-jni.c src-c/mcp2200-jni.h
	$(CC) -c $(CC_OPT) -I../mcp2200/src -o bin-c/mcp2200-jni.o src-c/mcp2200-jni.c
	
bin-c/mcp2200.o: bin-c ../mcp2200/src/mcp2200.c
	$(CC) -c $(CC_OPT) -I../mcp2200/src -o bin-c/mcp2200.o ../mcp2200/src/mcp2200.c

bin-c/mcp2200-jni$(SO_EXT): bin-c/mcp2200-jni.o bin-c/mcp2200.o
	$(CC) $(LD_OPT) -o bin-c/mcp2200-jni$(SO_EXT) bin-c/mcp2200-jni.o bin-c/mcp2200.o $(LD_LIBS)