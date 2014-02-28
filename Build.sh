#!/bin/bash
echo ${JAVA_HOME:=/usr/lib/jvm/default-java}
ant -f Build.xml jni_header
export CC_OPT="-fPIC -g '-I$JAVA_HOME/include' '-I$JAVA_HOME/include/linux'"
export SO_EXT=".so"
export LD_LIBS="-lrt -lpthread -ludev -lusb-1.0"
export LD_OPT="-shared"
make 
mv bin-c/mcp2200-jni.so bin-c/libmcp2200-jni.so
ant -f Build.xml
